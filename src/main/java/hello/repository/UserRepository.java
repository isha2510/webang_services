package hello.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import hello.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Serializable> {

}
