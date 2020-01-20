package global.coda.hms.constants;
/**
 * Patient Query Constants.
 * @author VC
 *
 */
public final class PatientQuery {
	/**
	 * Default Constructor.
	 */
	private PatientQuery() {

	}
	public static final String INSERT_PATIENT = "INSERT INTO hmsdb.t_patient (fk_user_id, blood_group, weight) VALUES (#{pkUserId}, #{bloodGroup}, #{weight})";
	public static final String READ_PATIENT = "select * from hmsdb.t_user_details as user LEFT JOIN hmsdb.t_patient as patient ON user.pk_user_id = patient.fk_user_id "
			+ "where user.pk_user_id=#{id} and user.is_active = 1 and user.fk_role_id = 3";;
			public static final String UPDATE_PATIENT = "UPDATE t_patient SET blood_group = #{bloodGroup}, weight = #{weight} WHERE (fk_user_id = #{pkUserId})";
			public static final String DELETE_PATIENT = "update t_patient set is_active = 0 where fk_user_id = #{id}";
}
