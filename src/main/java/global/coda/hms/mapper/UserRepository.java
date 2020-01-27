package global.coda.hms.mapper;

import org.springframework.data.repository.CrudRepository;

import global.coda.hms.model.UserRecord;
public interface UserRepository extends CrudRepository<UserRecord, Integer> {
}