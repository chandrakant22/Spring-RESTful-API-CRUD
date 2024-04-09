package in.asterisc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.asterisc.model.User;

public interface UserRepository extends JpaRepository<User,Long>{

}
