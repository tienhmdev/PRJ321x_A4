package funix.edu.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

import com.sun.istack.NotNull;

@Entity
@Table(name = "Users")
public class User {
@Id
@NotBlank(message = "Email is invalid!")
@NotEmpty(message = "Email is invalid!")
@Pattern(regexp=".+@.+\\.[a-z]+", message="Invalid email address!")
 private String email;
 private String name;
@NotNull
 private String password;
 public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

private String phone;
 private String address;
 private int age;
 
 
public User(String email, String password, String phone, String address, int age) {
	super();
	this.email = email;
	this.password = password;
	this.phone = phone;
	this.address = address;
	this.age = age;
}

public User(String email, String password) {
	super();
	this.email = email;
	this.password = password;
}

public User() {
	super();
}

public String getEmail() {
	return email;
}

public String getPassword() {
	return password;
}

public String getPhone() {
	return phone;
}

public String getAddress() {
	return address;
}

public int getAge() {
	return age;
}

public void setEmail(String email) {
	this.email = email;
}

public void setPassword(String password) {
	this.password = password;
}

public void setPhone(String phone) {
	this.phone = phone;
}

public void setAddress(String address) {
	this.address = address;
}

public void setAge(int age) {
	this.age = age;
}

@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "info: " + email + " / " + name + " / " + password + " / " + phone + " / " + address + " / " + age;
	}
}
