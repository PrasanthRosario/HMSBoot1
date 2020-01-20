package global.coda.hms.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import global.coda.hms.constants.PatientQuery;
import global.coda.hms.constants.UserQuery;
import global.coda.hms.model.Patient;
/**
 * Patient mapper.
 * @author VC
 *
 */
@Mapper
public interface PatientMapper {
	/**
	 * read patient.
	 * @param id user id
	 * @return patient
	 */
	@Select(PatientQuery.READ_PATIENT)
	Patient getById(int id);
	/**
	 * craete user.
	 * @param patient patient
	 * @return int created
	 */
	@Insert(UserQuery.INSERT_USER)
	@Options(useGeneratedKeys = true, keyProperty = "pkUserId", keyColumn = "pk_user_id")
	int createUser(Patient patient);
	/**
	 * create patient.
	 * @param patient patient
	 * @return int created
	 */
	@Insert(PatientQuery.INSERT_PATIENT)
	int createPatient(Patient patient);
	/**
	 * delete patient.
	 * @param id user id
	 * @return int deleted
	 */
	@Update(PatientQuery.DELETE_PATIENT)
	int deletePatient(int id);
	/**
	 * delete user.
	 * @param id user id
	 * @return int deleted
	 */
	@Update(UserQuery.DELETE_USER)
	int deleteUser(int id);
	/**
	 * update patient.
	 * @param patient patient
	 * @return int updated
	 */
	@Update(PatientQuery.UPDATE_PATIENT)
	int updatePatient(Patient patient);
	/**
	 * update user.
	 * @param patient patient
	 * @return int updated
	 */
	@Update(UserQuery.UPDATE_USER)
	int updateUser(Patient patient);
}
