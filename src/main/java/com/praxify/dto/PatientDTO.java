package com.praxify.dto;

import java.io.Serializable;
import java.util.Date;

public class PatientDTO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 116732928999044127L;
	private String firstName;
    private String lastName;
    private Long contactNumber;
    private String aadharId;
    private Date dob;
    private String emailID;
    private String password;
    public PatientDTO() {
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
	public Long getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(Long contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getAadharId() {
		return aadharId;
	}
	public void setAadharId(String aadharId) {
		this.aadharId = aadharId;
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
	
    @Override
    public String toString() {
    	return "[PatientDetails: firstNAme: "+firstName+" lastName: "+lastName+" contactNumber: "+contactNumber+" aadharID: "+aadharId+" DOB: "+dob+" emailID: "+emailID+"]";
    }
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
