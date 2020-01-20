
package global.coda.hms.model;

import java.util.Date;
import java.util.List;
/**
 * doctor model.
 * @author VC
 *
 */
public class Doctor extends UserDetails {

	/** The doctor id. */
	private int pkDoctorId;

	/** The user id. */
	private int fkUserId;

	/** The specialization. */
	private String doctorSpecialization;

	/** The is active. */
	private int isActive;

	/** The created time. */
	private Date createdDate;

	/** The updated time. */
	private Date updatedDate;
	private List<Patient> patientList;
	/**
	 * Method to return Object String.
	 *
	 * @return the string
	 */

	@Override
	public String toString() {
		return "Doctor{" + "doctor_id=" + pkDoctorId + ", userId=" + fkUserId + ", specialization='" + doctorSpecialization + '\''
				+ ", isActive=" + isActive + ", createdTime=" + createdDate + ", updatedTime=" + updatedDate + '}';
	}

	/**
	 * Sets new createdTime.
	 *
	 * @param createdTime New value of createdTime.
	 */
	@Override
	public void setCreatedDate(Date createdTime) {
		this.createdDate = createdTime;
	}

	/**
	 * Gets createdTime.
	 *
	 * @return Value of createdTime.
	 */
	@Override
	public Date getCreatedDate() {
		return createdDate;
	}

	/**
	 * Sets new specilization.
	 *
	 * @param specialization New value of specilization.
	 */
	public void setDoctorSpecialization(String specialization) {
		this.doctorSpecialization = specialization;
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
	 * Gets isActive.
	 *
	 * @return Value of isActive.
	 */
	@Override
	public int getIsActive() {
		return isActive;
	}

	/**
	 * Gets updatedTime.
	 *
	 * @return Value of updatedTime.
	 */
	@Override
	public Date getUpdatedDate() {
		return updatedDate;
	}

	/**
	 * Gets the doctor id.
	 *
	 * @return the doctor id
	 */
	public int getPkDoctorId() {
		return pkDoctorId;
	}

	/**
	 * Sets the doctor id.
	 *
	 * @param doctorId the new doctor id
	 */
	public void setPkDoctorId(int doctorId) {
		this.pkDoctorId = doctorId;
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
	 * Sets new updatedTime.
	 *
	 * @param updatedTime New value of updatedTime.
	 */
	@Override
	public void setUpdatedDate(Date updatedTime) {
		this.updatedDate = updatedTime;
	}

	/**
	 * Gets specilization.
	 *
	 * @return Value of specialization.
	 */
	public String getDoctorSpecialization() {
		return doctorSpecialization;
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
	 * to get patient list.
	 * @return patientlist patientList
	 */
	public List<Patient> getPatientList() {
		return patientList;
	}
	/**
	 * To set patient List.
	 * @param patientList patient list
	 */
	public void setPatientList(List<Patient> patientList) {
		this.patientList = patientList;
	}
}
