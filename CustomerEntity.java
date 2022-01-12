package study.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="customer_info_tbl")
public class CustomerEntity {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	
	@Column(name="first_name")
	String firstName;
	@Column(name="last_name")
	String lastName;
	String address;
	
	
	public CustomerEntity() {
		// TODO Auto-generated constructor stub
	}
	
	
	public CustomerEntity( String firstName, String lastName, String address) {
		super();
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
