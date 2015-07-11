package com.praxify.pojos;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document
public class Patient implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7341653405392826883L;

	@Id
    private String id;

    private String firstName;
    private String lastName;
    private Long contactNumber;
    private String aadharId;
    private Date dob;
    private String emailID;
    private  byte[] password;
    public Long getContactNumber() {
		return contactNumber;
	}
	public void setPassword(byte[] bs) {
		this.password = bs;
	}
	public Patient() {
	}
    public Patient(String firstName,String lastName,Long contactNumber,String aadharId,Date dob,String emailID, byte[] password){
    	this.firstName=firstName;
    	this.lastName=lastName;
    	this.contactNumber=contactNumber;
    	this.aadharId=aadharId;
    	this.aadharId=aadharId;
    	this.password = password;
    	this.dob=dob;
    	this.emailID=emailID;
    }
    
    public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getEmailID() {
		return emailID;
	}
	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}
	public void setContactNumber(Long contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getId() {
		return id;
	}

	public void setId(String id) {
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


	public String getAadharId() {
		return aadharId;
	}

	public void setAadharId(String aadharId) {
		this.aadharId = aadharId;
	}

	@Override
    public String toString() {
    	return "[PatientDetails: id: "+id+" firstName : "+firstName+" lastName : "+lastName+" contactNumber: "+contactNumber+" aadharID :"+aadharId+" ]";
    }
    

}
