package com.intern.backend.backend.naver.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Member {
	
	private String user_id;
	private String user_pwd;
	private String user_name;
	private String user_mail;
	private int    pwd_errornum;
	private String user_lock;
	public void setAccountLocked(boolean b) {

	}
}
