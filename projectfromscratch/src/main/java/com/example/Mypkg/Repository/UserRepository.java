package com.example.Mypkg.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Mypkg.Entity.User;
@Repository

public interface UserRepository extends JpaRepository<User, Long>{
	

}
