package global.coda.hms.model;

import java.util.Date;

// TODO: Auto-generated Javadoc
/**
 * The Class UserDetails.
 *
 * @author
 */

public class UserDetails {

	/** The user id. */
	private int pkUserId;

	/** The username. */
	private String username;

	/** The password. */
	private String password;

	/** The phone number. */
	private String phoneNumber;

	/** The role id. */
	private int fkRoleId;

	/** The user first name. */
	private String firstname;

	/** The user last name. */
	private String lastname;

	/** The user city. */
	private String city;

	/** The user state. */
	private String state;

	/** The is active. */
	private int isActive;

	/** The created date. */
	private Date createdTime;

	/** The updated date. */
	private Date updatedTime;

	/**
	 * Gets the phone number.
	 *
	 * @return phone the phone number
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * Sets the phone number.
	 *
	 * @param phoneNumber the new phone number
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	/**
	 * Gets updatedDate.
	 *
	 * @return updateddate Value of updatedDate.
	 */
	public Date getUpdatedDate() {
		return updatedTime;
	}

	/**
	 * Gets username.
	 *
	 * @return username Value of username.
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * Gets userState.
	 *
	 * @return state Value of userState.
	 */
	public String getState() {
		return state;
	}

	/**
	 * Gets userCity.
	 *
	 * @return city Value of userCity.
	 */
	public String getCity() {
		return city;
	}

	/**
	 * Sets new updatedDate.
	 *
	 * @param updatedDate New value of updatedDate.
	 */
	public void setUpdatedDate(Date updatedDate) {
		this.updatedTime = updatedDate;
	}

	/**
	 * Gets userId.
	 *
	 * @return userid Value of userId.
	 */
	public int getPkUserId() {
		return pkUserId;
	}

	/**
	 * Sets new userId.
	 *
	 * @param userId New value of userId.
	 */
	public void setPkUserId(int userId) {
		this.pkUserId = userId;
	}

	/**
	 * Gets isActive.
	 *
	 * @return isActive Value of isActive.
	 */
	public int getIsActive() {
		return isActive;
	}

	/**
	 * Sets new username.
	 *
	 * @param username New value of username.
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * Gets userFirstName.
	 *
	 * @return firstname Value of userFirstName.
	 */
	public String getFirstname() {
		return firstname;
	}

	/**
	 * Sets new userFirstName.
	 *
	 * @param firstname New value of userFirstName.
	 */
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	/**
	 * Sets new createdDate.
	 *
	 * @param createdDate New value of createdDate.
	 */
	public void setCreatedDate(Date createdDate) {
		this.createdTime = createdDate;
	}

	/**
	 * Sets new password.
	 *
	 * @param password New value of password.
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * Gets userLastName.
	 *
	 * @return lastname Value of userLastName.
	 */
	public String getLastname() {
		return lastname;
	}

	/**
	 * Sets new userLastName.
	 *
	 * @param lastname New value of userLastName.
	 */
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	/**
	 * Gets password.
	 *
	 * @return password Value of password.
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Gets createdDate.
	 *
	 * @return createdTime Value of createdDate.
	 */
	public Date getCreatedDate() {
		return createdTime;
	}


	/**
	 * Gets the fk role id.
	 *
	 * @return the fk role id
	 */
	public int getFkRoleId() {
		return fkRoleId;
	}

	/**
	 * Sets the fk role id.
	 *
	 * @param fkRoleId the new fk role id
	 */
	public void setFkRoleId(int fkRoleId) {
		this.fkRoleId = fkRoleId;
	}

	/**
	 * Sets new userCity.
	 *
	 * @param city New value of userCity.
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * Sets new isActive.
	 * @param isActive New value of isActive.
	 */
	public void setIsActive(int isActive) {
		this.isActive = isActive;
	}

	/**
	 * Sets new userState.
	 *
	 * @param state New value of userState.
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * To string.
	 *
	 * @return string the string
	 */

	@Override
	public String toString() {
		return "UserDetails [pkUserId=" + pkUserId + ", username=" + username + ", password=" + password
				+ ", phoneNumber=" + phoneNumber + ", fkRoleId=" + fkRoleId + ", firstname=" + firstname + ", lastname="
				+ lastname + ", city=" + city + ", userState=" + state + ", isActive=" + isActive + ", createdDate="
				+ createdTime + ", updatedDate=" + updatedTime + "]";
	}


}
