package global.coda.hms.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import global.coda.hms.constants.DoctorQuery;
import global.coda.hms.constants.UserQuery;
import global.coda.hms.model.Doctor;
import global.coda.hms.model.Patient;
/**
 * Doctor mapper.
 * @author VC
 *
 */
@Mapper
public interface DoctorMapper {
	/**
	 * read doctor.
	 * @param id user id
	 * @return doctor doctor
	 */
	@Select(DoctorQuery.READ_DOCTOR)
	Doctor read(int id);
	/**
	 * create user.
	 * @param doctor doctor model
	 * @return int created
	 */
	@Insert(UserQuery.INSERT_USER)
	@Options(useGeneratedKeys = true, keyProperty = "pkUserId", keyColumn = "pk_user_id")
	int createUsers(Doctor doctor);
	/**
	 * create doctor.
	 * @param doctor doctor
	 * @return int created
	 */
	@Insert(DoctorQuery.INSERT_DOCTOR)
	int createDoctors(Doctor doctor);
	/**
	 * delete doctor.
	 * @param id user id
	 * @return int deleted
	 */
	@Update(DoctorQuery.DELETE_DOCTOR)
	int deleteDoctors(int id);
	/**
	 * delete user.
	 * @param id user id
	 * @return int deleted
	 */
	@Update(UserQuery.DELETE_USER)
	int deleteUsers(int id);
	/**
	 * update doctor.
	 * @param doctor doctor
	 * @return int updated
	 */
	@Update(DoctorQuery.UPDATE_DOCTOR)
	int updateDoctors(Doctor doctor);
	/**
	 * update user.
	 * @param doctor doctor
	 * @return int updated
	 */
	@Update(UserQuery.UPDATE_USER)
	int updateUsers(Doctor doctor);
	/**
	 * read Patients.
	 * @param doctorId doctor id
	 * @return list list of patients
	 */
	@Select(DoctorQuery.READ_PATIENTS)
	List<Patient> readPatients(int doctorId);
	/**
	 * read all users.
	 * @return list doctor id
	 */
	@Select(DoctorQuery.READ_ALL_DOCTORS)
	@Results(value = {
			@Result(property = "patientList", column = "pk_doctor_id", javaType = List.class, many = @Many(select = "readPatients"))
	})
	List<Doctor> getPatients(int id);
	//
	//	@Select(DoctorQuery.READ_DOCTOR)
	//	@Results(value = {
	//			@Result(property = "patientList", column = "pk_doctor_id", javaType = List.class, many = @Many(select = "readPatients"))
	//	})
	//	Doctor readPatientsForDoctor(int id);
}
