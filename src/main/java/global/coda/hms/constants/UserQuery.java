package global.coda.hms.constants;
/**
 * User query Constants.
 * @author VC
 *
 */
public final class UserQuery {
	/**
	 * Default constructor.
	 */
	private UserQuery() {
	}
	public static final String INSERT_USER = "INSERT INTO hmsdb.t_user_details (username, password, fk_role_id, firstname, lastname, city, state, phone_number)"
			+ " VALUES (#{username}, #{password}, #{fkRoleId}, #{firstname}, "
			+ "#{lastname}, #{city}, #{state}, #{phoneNumber})";
	public static final String UPDATE_USER = "UPDATE t_user_details SET password = #{password}, firstname = #{firstname}, lastname = #{lastname}, "
			+ "city = #{city}, state = #{state} , phone_number = #{phoneNumber} WHERE"
			+ " (pk_user_id = #{pkUserId} and is_active = 1)";
	public static final String DELETE_USER = "update t_user_details set is_active = 0 where pk_user_id = #{id}";

}
