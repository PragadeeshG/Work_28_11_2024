package com.test1;

public class DevOperationUserProfile {
	private String devOPsUserId;
	private String devOPsUserName;
	private String emailId;
	private String devOPsUserStatus;
	private String contactId;
	private String addressId;
	private String orgUnit;
	private String buUnit;
	private String costCentre;
	private String managerId;
	private boolean isActive;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public DevOperationUserProfile() {

	}

	public DevOperationUserProfile(String devOPsUserId, String devOPsUserName, String emailId, String devOPsUserStatus,
			String contactId, String addressId, String orgUnit, String buUnit, String costCentre, String managerId,
			boolean isActive, String creationDate, String modifiedDate, String entityState) {
		super();
		this.devOPsUserId = devOPsUserId;
		this.devOPsUserName = devOPsUserName;
		this.emailId = emailId;
		this.devOPsUserStatus = devOPsUserStatus;
		this.contactId = contactId;
		this.addressId = addressId;
		this.orgUnit = orgUnit;
		this.buUnit = buUnit;
		this.costCentre = costCentre;
		this.managerId = managerId;
		this.isActive = isActive;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public String getDevOPsUserId() {
		return devOPsUserId;
	}

	public void setDevOPsUserId(String devOPsUserId) {
		this.devOPsUserId = devOPsUserId;
	}

	public String getDevOPsUserName() {
		return devOPsUserName;
	}

	public void setDevOPsUserName(String devOPsUserName) {
		this.devOPsUserName = devOPsUserName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getDevOPsUserStatus() {
		return devOPsUserStatus;
	}

	public void setDevOPsUserStatus(String devOPsUserStatus) {
		this.devOPsUserStatus = devOPsUserStatus;
	}

	public String getContactId() {
		return contactId;
	}

	public void setContactId(String contactId) {
		this.contactId = contactId;
	}

	public String getAddressId() {
		return addressId;
	}

	public void setAddressId(String addressId) {
		this.addressId = addressId;
	}

	public String getOrgUnit() {
		return orgUnit;
	}

	public void setOrgUnit(String orgUnit) {
		this.orgUnit = orgUnit;
	}

	public String getBuUnit() {
		return buUnit;
	}

	public void setBuUnit(String buUnit) {
		this.buUnit = buUnit;
	}

	public String getCostCentre() {
		return costCentre;
	}

	public void setCostCentre(String costCentre) {
		this.costCentre = costCentre;
	}

	public String getManagerId() {
		return managerId;
	}

	public void setManagerId(String managerId) {
		this.managerId = managerId;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

}