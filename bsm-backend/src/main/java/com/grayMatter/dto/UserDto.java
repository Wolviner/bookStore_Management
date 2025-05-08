package com.grayMatter.dto;

import com.grayMatter.entities.Role;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserDto {

	private Long userId;
	private String email;
	private String password;
	private Role role;

}
