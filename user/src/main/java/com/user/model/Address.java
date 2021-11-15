package com.user.model;



	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.Id;
	import javax.persistence.Table;
	@Entity
	@Table(schema = "APP", name = "ADDRESS")

	public class Address {
	@Id
	@Column(name = "ADDRESS_ID")
	private String addressId;
	@Column(name = "PERMANENT_ADDRESS")
	private String permanentaddress;
	@Column(name = "TEMPORARY_ADDRESS")
	private String temporaryaddress;
	@Column(name = "OFFICE_ADDRESS")
	private String officeaddress;
	public String getAddressId() {
		return addressId;
	}
	public void setAddressId(String addressId) {
		this.addressId = addressId;
	}
	public String getPermanentaddress() {
		return permanentaddress;
	}
	public void setPermanentaddress(String permanentaddress) {
		this.permanentaddress = permanentaddress;
	}
	public String getTemporaryaddress() {
		return temporaryaddress;
	}
	public void setTemporaryaddress(String temporaryaddress) {
		this.temporaryaddress = temporaryaddress;
	}
	public String getOfficeaddress() {
		return officeaddress;
	}
	public void setOfficeaddress(String officeaddress) {
		this.officeaddress = officeaddress;
	}
   	
	


}