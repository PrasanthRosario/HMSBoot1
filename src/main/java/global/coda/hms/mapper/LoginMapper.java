package global.coda.hms.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import global.coda.hms.model.LoginModel;
import global.coda.hms.model.UserDetails;
@Mapper
public interface LoginMapper {
	@Select("select pk_user_id , fk_role_id from t_user_details where username = #{username} and password = #{password} and is_active = 1")
	UserDetails login(LoginModel login);

}
