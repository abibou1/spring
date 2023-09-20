package dev.abibou.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import dev.abibou.security.entity.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Integer>{
	@Query("Select s from UserEntity s where s.username = ?1")
	UserEntity findByUsername(String username);
}
