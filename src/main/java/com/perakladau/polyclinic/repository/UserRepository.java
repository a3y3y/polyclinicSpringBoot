package com.perakladau.polyclinic.repository;

import com.perakladau.polyclinic.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User findByUuid(UUID uuid);

}
