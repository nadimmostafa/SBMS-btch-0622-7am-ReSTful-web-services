package org.nadim.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
	private Integer userId;
	private String userName;
	private String userEmail;
	
	private UserRole role;
}
