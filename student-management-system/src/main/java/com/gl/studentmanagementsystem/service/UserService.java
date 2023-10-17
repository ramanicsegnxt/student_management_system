package com.gl.studentmanagementsystem.service;

import com.gl.studentmanagementsystem.dto.UserDto;
import com.gl.studentmanagementsystem.entity.User;
import com.gl.studentmanagementsystem.security.ApplicationUserDetails;

public interface UserService {

    UserDto save(UserDto userDto);
}
