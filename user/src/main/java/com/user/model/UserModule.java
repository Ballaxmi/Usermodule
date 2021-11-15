package com.user.model;

	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.Id;
	import javax.persistence.Table;
	@Entity
	@Table(schema = "APP", name = "USERMODULE")

	public class UserModule {
	@Id
	@Column(name = "USER_ID")
	private String userId;
	@Column(name = "PASSWORD")
	private String password;
	@Column(name = "FIRST_NAME")
	private String firstName;
	@Column(name = "LAST_NAME")
	private String lastName;
   	@Column(name = "CREDIT_CARD")
	private String creditcard;
    @Column(name = "DEBIT_CARD")
	private String debitcard;
    @Column(name = "CARD_NO")
	private String creditno;
    @Column(name = "CARD_HOLDER_NAME")
   	private String cardholdername;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
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
	public String getCreditcard() {
		return creditcard;
	}
	public void setCreditcard(String creditcard) {
		this.creditcard = creditcard;
	}
	public String getDebitcard() {
		return debitcard;
	}
	public void setDebitcard(String debitcard) {
		this.debitcard = debitcard;
	}
	public String getCreditno() {
		return creditno;
	}
	public void setCreditno(String creditno) {
		this.creditno = creditno;
	}
	public String getCardholdername() {
		return cardholdername;
	}
	public void setCardholdername(String cardholdername) {
		this.cardholdername = cardholdername;
	}
   
    
	

	}