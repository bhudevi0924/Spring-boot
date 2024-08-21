package com.BlobAndClob.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;

@Entity
@Table(name = "emp")
public class Employee {

    @Id
    private String empId;
    private String empName;

    @Lob
    private byte[] empImage;

    @Lob
    private byte[] empResume;

    // Getters and setters
    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public byte[] getEmpImage() {
        return empImage;
    }

    public void setEmpImage(byte[] empImage) {
        this.empImage = empImage;
    }

    public byte[] getEmpResume() {
        return empResume;
    }

    public void setEmpResume(byte[] empResume) {
        this.empResume = empResume;
    }
}
