package com.gl.studentmanagementsystem;

import com.gl.studentmanagementsystem.dto.RoleDto;
import com.gl.studentmanagementsystem.dto.UserDto;
import com.gl.studentmanagementsystem.entity.Role;
import com.gl.studentmanagementsystem.entity.User;
import com.gl.studentmanagementsystem.repository.RoleRepository;
import com.gl.studentmanagementsystem.repository.UserRepository;
import com.gl.studentmanagementsystem.service.RoleService;
import com.gl.studentmanagementsystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class StudentManagementSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudentManagementSystemApplication.class, args);
    }
}
