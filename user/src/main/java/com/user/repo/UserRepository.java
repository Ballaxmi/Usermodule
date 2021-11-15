package com.user.repo;


	import org.springframework.data.jpa.repository.JpaRepository;

	import com.user.model.UserModule;

	public interface UserRepository extends JpaRepository<UserModule, String> {

	}