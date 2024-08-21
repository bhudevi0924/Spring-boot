package com.BlobAndClob.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.lob.LobHandler;
import org.springframework.jdbc.core.support.AbstractLobCreatingPreparedStatementCallback;
import org.springframework.jdbc.core.support.AbstractLobStreamingResultSetExtractor;
import org.springframework.jdbc.support.lob.LobCreator;

import javax.sql.DataSource;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.BlobAndClob.entity.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

    private LobHandler lobHandler;
    private JdbcTemplate jdbcTemplate;

    public void setDataSource(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public void setLobHandler(LobHandler lobHandler) {
        this.lobHandler = lobHandler;
    }

    public LobHandler getLobHandler() {
        return lobHandler;
    }

    @Override
    public void insertEmployee(Employee emp) {
        String sqlQuery = "INSERT INTO emp (empId, empName, empImage, empResume) VALUES (?, ?, ?, ?)";
        jdbcTemplate.execute(sqlQuery, new AbstractLobCreatingPreparedStatementCallback(lobHandler) {
            @Override
            protected void setValues(PreparedStatement ps, LobCreator lobCreator) throws SQLException {
                try {
                    ps.setString(1, emp.getEmpId());
                    ps.setString(2, emp.getEmpName());
                    lobCreator.setBlobAsBytes(ps, 3, emp.getEmpImage());
                    lobCreator.setBlobAsBytes(ps, 4, emp.getEmpResume());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    @Override
    public Employee readEmployee() {
        String sql = "SELECT * FROM emp";
        return jdbcTemplate.queryForObject(sql, (ResultSet rs, int rowNum) -> {
            Employee emp = new Employee();
            emp.setEmpId(rs.getString("empId"));
            emp.setEmpName(rs.getString("empName"));
            byte[] empImageData = lobHandler.getBlobAsBytes(rs, "empImage");
            byte[] empResumeData = lobHandler.getBlobAsBytes(rs, "empResume");
            emp.setEmpImage(empImageData);
            emp.setEmpResume(empResumeData);
            return emp;
        });
    }
}
