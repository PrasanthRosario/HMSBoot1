package global.coda.hms.constants;
/**
 * Doctor Query Constants.
 * @author VC
 *
 */
public final class DoctorQuery {
	/**
	 * default Constructor of DoctorQuery.
	 */
	private DoctorQuery() {

	}
	public static final String INSERT_DOCTOR = "INSERT INTO t_doctor (doctor_specialization, fk_user_id) VALUES (#{doctorSpecialization}, #{pkUserId})";

	public static final String UPDATE_DOCTOR = "UPDATE t_doctor SET doctor_specialization = #{doctorSpecialization} WHERE (fk_user_id = #{pkUserId})";

	public static final String DELETE_DOCTOR = "update t_doctor set is_active = 0 where fk_user_id = #{id}";

	public static final String READ_DOCTOR = "select * from hmsdb.t_user_details as user "
			+ "LEFT JOIN hmsdb.t_doctor as doctor ON user.pk_user_id = doctor.fk_user_id where user.is_active = 1 and user.fk_role_id = 4 and user.pk_user_id = #{id}";

	public static final String READ_PATIENTS = "select patient.username,patient.firstname,record.fk_patient_id,patient.user_id, patient.lastname,patient.blood_group,patient.weight,patient.city,patient.state,patient.phone_number from t_record as record  "
			+ "LEFT join (select user.pk_user_id as user_id, user.username,user.password,user.firstname,user.lastname,patient.blood_group,patient.weight,user.fk_role_id,user.city,user.state,user.created_time,user.updated_time, patient.pk_patient_id as patient_id,user.phone_number "
			+ "from  t_user_details as user LEFT JOIN t_patient as patient ON user.pk_user_id = patient.fk_user_id where  patient.is_active = 1 "
			+ "and fk_role_id = 3) as patient "
			+ "on patient.patient_id = fk_patient_id "
			+ "where record.fk_doctor_id = #{fkDoctorId} and record.is_active = 1 group by patient.patient_id";

	public static final String DOCTOR_ID = "select distinct fk_doctor_id from t_record";

	public static final String READ_ALL_DOCTORS = "<script> select * from hmsdb.t_user_details as user "
			+ "LEFT JOIN hmsdb.t_doctor as doctor ON user.pk_user_id = doctor.fk_user_id where user.is_active = 1 and  user.fk_role_id = 4 <if test= 'pk_user_id !=0'> and pk_user_id = #{id}  </if></script>";


}
