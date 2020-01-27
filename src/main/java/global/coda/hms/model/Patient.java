package global.coda.hms.model;

import java.sql.Date;
// TODO: Auto-generated Javadoc

/**
 * The Class Patient.
 *
 * @author
 */
public class Patient extends UserDetails {

	/** The patient id. */
	private int pkPatientId;

	/** The user id. */
	private int fkUserId;

	/** The blood group. */
	private String bloodGroup;

	/** The weight. */
	private int weight;

	/** The is active. */
	private int isActive;

	/** The created date. */
	private Date createdDate;

	/** The updated date. */
	private Date updatedDate;







	/**
	 * Gets bloodGroup.
	 *
	 * @return Value of bloodGroup.
	 */
	public String getBloodGroup() {
		return bloodGroup;
	}

	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return "Patient [pkPatientId=" + pkPatientId + ", fkUserId=" + fkUserId + ", bloodGroup=" + bloodGroup
				+ ", weight=" + weight + ", isActive=" + isActive + ", createdDate=" + createdDate + ", updatedDate="
				+ updatedDate + ", getBloodGroup()=" + getBloodGroup() + ", getCreatedDate()=" + getCreatedDate()
				+ ", getPatientId()=" + getPatientId() + ", getUserId()=" + getPkUserId() + ", getWeight()=" + getWeight()
				+ ", getIsActive()=" + getIsActive() + ", getUpdatedDate()=" + getUpdatedDate() + ", getPhoneNumber()="
				+ getPhoneNumber() + ", getUsername()=" + getUsername() + ", getState()=" + getState() + ", getCity()="
				+ getCity() + ", getFirstname()=" + getFirstname() + ", getLastname()=" + getLastname()
				+ ", getPassword()=" + getPassword() + ", getRoleId()=" + getFkRoleId() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

	/**
	 * Sets new createdDate.
	 *
	 * @param createdDate New value of createdDate.
	 */
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	/**
	 * Sets new weight.
	 *
	 * @param weight New value of weight.
	 */
	public void setWeight(int weight) {
		this.weight = weight;
	}

	/**
	 * Gets createdDate.
	 *
	 * @return Value of createdDate.
	 */
	@Override
	public Date getCreatedDate() {
		return createdDate;
	}

	/**
	 * Sets new isActive.
	 *
	 * @param isActive New value of isActive.
	 */
	@Override
	public void setIsActive(int isActive) {
		this.isActive = isActive;
	}

	/**
	 * Gets patientId.
	 *
	 * @return Value of patientId.
	 */
	public int getPatientId() {
		return pkPatientId;
	}

	/**
	 * Gets userId.
	 *
	 * @return Value of userId.
	 */
	@Override
	public int getPkUserId() {
		return fkUserId;
	}

	/**
	 * Sets new userId.
	 *
	 * @param userId New value of userId.
	 */
	@Override
	public void setPkUserId(int userId) {
		this.fkUserId = userId;
	}

	/**
	 * Sets new patientId.
	 *
	 * @param patientId New value of patientId.
	 */
	public void setPatientId(int patientId) {
		this.pkPatientId = patientId;
	}

	/**
	 * Sets new bloodGroup.
	 *
	 * @param bloodGroup New value of bloodGroup.
	 */
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	/**
	 * Sets new updatedDate.
	 *
	 * @param updatedDate New value of updatedDate.
	 */
	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	/**
	 * Gets weight.
	 *
	 * @return Value of weight.
	 */
	public int getWeight() {
		return weight;
	}

	/**
	 * Gets isActive.
	 *
	 * @return Value of isActive.
	 */
	@Override
	public int getIsActive() {
		return isActive;
	}

	/**
	 * Gets updatedDate.
	 *
	 * @return Value of updatedDate.
	 */
	@Override
	public Date getUpdatedDate() {
		return updatedDate;
	}
}

