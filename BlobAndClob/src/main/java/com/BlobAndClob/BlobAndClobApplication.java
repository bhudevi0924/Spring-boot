package com.BlobAndClob;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.BlobAndClob.dao.EmployeeDao;
import com.BlobAndClob.entity.Employee;

@SpringBootApplication
public class BlobAndClobApplication {

    public static void main(String[] args) throws Exception {
//        SpringApplication.run(BlobAndClobApplication.class, args);

        String configFile = "applicationContext.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(configFile);
        EmployeeDao dao = (EmployeeDao) context.getBean("empDao");

        File file1 = new File("C:/Users/Bhudevi Dobbala/Pictures/Bhudevi-image.jpg");
        File file2 = new File("C:/Users/Bhudevi Dobbala/Documents/DRUPAL_Learnings.docx");

        Employee emp1 = new Employee();
        emp1.setEmpId("Cog01");
        emp1.setEmpName("Bhudevi Dobbala");
        emp1.setEmpImage(convertFileToBytes(file1));
        emp1.setEmpResume(convertFileToBytes(file2));
        dao.insertEmployee(emp1);
        System.out.println("Employee Inserted");

        Employee emp2 = dao.readEmployee();
        System.out.println("Employee Retrieved");
        System.out.println("Employee Details");
        System.out.println("*****************");
        System.out.println("Employee Number : " + emp2.getEmpId());
        System.out.println("Employee Name : " + emp2.getEmpName());

        // Optionally save retrieved data to files
        saveBytesToFile(emp2.getEmpImage(), new File("C:/Users/Bhudevi Dobbala/Pictures/Retrieved-image.jpg"));
        saveBytesToFile(emp2.getEmpResume(), new File("C:/Users/Bhudevi Dobbala/Documents/Retrieved-Resume.docx"));

        System.out.println("Employee Image saved to file.");
        System.out.println("Employee Resume saved to file.");
    }

    private static byte[] convertFileToBytes(File file) throws IOException {
        try (FileInputStream fis = new FileInputStream(file)) {
            return fis.readAllBytes();
        }
    }

    private static void saveBytesToFile(byte[] data, File file) throws IOException {
        try (FileOutputStream fos = new FileOutputStream(file)) {
            fos.write(data);
        }
    }
}
