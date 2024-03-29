package com.spring.mcdelivery.dto;

public class UserDTO {

	private String name;
	private String gender;
	private String phone;
	private String email;
	private String pw;
	private String address;
	
	public UserDTO() {
		// TODO Auto-generated constructor stub
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}


	@Override
	public String toString() {
		return "UserDTO [name=" + name + ", gender=" + gender + ", phone=" + phone + ", email=" + email + ", pw=" + pw
				+ ", address=" + address + "]";
	}
	
	
	
	
	
}
