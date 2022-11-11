package test;

import lombok.Data;

@Data
public class UserVO {
	public UserVO(String username) {
		super();
		this.username = username;
	}

	String username;
}
