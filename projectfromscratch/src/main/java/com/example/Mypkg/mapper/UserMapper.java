package com.example.Mypkg.mapper;

import com.example.Mypkg.Dto.UserDto;
import com.example.Mypkg.Entity.User;

public class UserMapper {

	public static UserDto maptoUserDto(User user ) {
		return new UserDto(
				user.getId(),
				user.getFirstName(),
				user.getLastName(),
				user.getEmail()
				
				);
	}		
	public static User mapToUser(UserDto userDto) {
		return new  User (
				userDto.getId(),
				userDto.getFirstName(),
				userDto.getLastName(),
				userDto.getEmail()
				);
	}
}
