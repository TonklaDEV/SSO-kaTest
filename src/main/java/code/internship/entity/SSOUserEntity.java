package code.internship.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "sso_user_test", catalog = "ssotest")
public class SSOUserEntity {

	@Id
	private Timestamp requestDate;

	@Column(name = "ssotype", length = 50)
	private String ssoType;

	@Column(name = "systemid", length = 50)
	private String systemId;

	@Column(name = "systemname", length = 250)
	private String systemName;

	@Column(name = "systemtransactions", length = 250)
	private String systemTransactions;

	@Column(name = "systemprivileges", length = 250)
	private String systemPrivileges;

	@Column(name = "systemusergroup", length = 50)
	private String systemUserGroup;

	@Column(name = "systemlocationgroup", length = 50)
	private String systemLocationGroup;

	@Column(name = "userid", length = 200)
	private String userId;

	@Column(name = "userfullname", length = 500)
	private String userFullName;

	@Column(name = "userrdofficecode", length = 250)
	private String userRdOfficeCode;

	@Column(name = "userofficecode", length = 250)
	private String userOfficeCode;

	@Column(name = "clientlocation", length = 250)
	private String clientLocation;

	@Column(name = "locationmachinenumber", length = 500)
	private String locationMachineNumber;

	@Column(name = "tokenid", length = 1000)
	private String tokenId;

	public SSOUserEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SSOUserEntity(Timestamp requestDate, String ssoType, String systemId, String systemName,
			String systemTransactions, String systemPrivileges, String systemUserGroup, String systemLocationGroup,
			String userId, String userFullName, String userRdOfficeCode, String userOfficeCode, String clientLocation,
			String locationMachineNumber, String tokenId) {
		super();
		this.requestDate = requestDate;
		this.ssoType = ssoType;
		this.systemId = systemId;
		this.systemName = systemName;
		this.systemTransactions = systemTransactions;
		this.systemPrivileges = systemPrivileges;
		this.systemUserGroup = systemUserGroup;
		this.systemLocationGroup = systemLocationGroup;
		this.userId = userId;
		this.userFullName = userFullName;
		this.userRdOfficeCode = userRdOfficeCode;
		this.userOfficeCode = userOfficeCode;
		this.clientLocation = clientLocation;
		this.locationMachineNumber = locationMachineNumber;
		this.tokenId = tokenId;
	}

	public Timestamp getRequestDate() {
		return requestDate;
	}

	public void setRequestDate(Timestamp requestDate) {
		this.requestDate = requestDate;
	}

	public String getSsoType() {
		return ssoType;
	}

	public void setSsoType(String ssoType) {
		this.ssoType = ssoType;
	}

	public String getSystemId() {
		return systemId;
	}

	public void setSystemId(String systemId) {
		this.systemId = systemId;
	}

	public String getSystemName() {
		return systemName;
	}

	public void setSystemName(String systemName) {
		this.systemName = systemName;
	}

	public String getSystemTransactions() {
		return systemTransactions;
	}

	public void setSystemTransactions(String systemTransactions) {
		this.systemTransactions = systemTransactions;
	}

	public String getSystemPrivileges() {
		return systemPrivileges;
	}

	public void setSystemPrivileges(String systemPrivileges) {
		this.systemPrivileges = systemPrivileges;
	}

	public String getSystemUserGroup() {
		return systemUserGroup;
	}

	public void setSystemUserGroup(String systemUserGroup) {
		this.systemUserGroup = systemUserGroup;
	}

	public String getSystemLocationGroup() {
		return systemLocationGroup;
	}

	public void setSystemLocationGroup(String systemLocationGroup) {
		this.systemLocationGroup = systemLocationGroup;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserFullName() {
		return userFullName;
	}

	public void setUserFullName(String userFullName) {
		this.userFullName = userFullName;
	}

	public String getUserRdOfficeCode() {
		return userRdOfficeCode;
	}

	public void setUserRdOfficeCode(String userRdOfficeCode) {
		this.userRdOfficeCode = userRdOfficeCode;
	}

	public String getUserOfficeCode() {
		return userOfficeCode;
	}

	public void setUserOfficeCode(String userOfficeCode) {
		this.userOfficeCode = userOfficeCode;
	}

	public String getClientLocation() {
		return clientLocation;
	}

	public void setClientLocation(String clientLocation) {
		this.clientLocation = clientLocation;
	}

	public String getLocationMachineNumber() {
		return locationMachineNumber;
	}

	public void setLocationMachineNumber(String locationMachineNumber) {
		this.locationMachineNumber = locationMachineNumber;
	}

	public String getTokenId() {
		return tokenId;
	}

	public void setTokenId(String tokenId) {
		this.tokenId = tokenId;
	}

}
