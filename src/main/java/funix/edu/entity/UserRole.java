package funix.edu.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class UserRole {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userRoleId;
	
	@ManyToOne
	@JoinColumn(name = "email", referencedColumnName = "email")
	private User user;
	
	@ManyToOne
	@JoinColumn(name = "roleId", referencedColumnName = "roleId")
	private Role role;

}
