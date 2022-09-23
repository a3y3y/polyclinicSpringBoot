package com.perakladau.polyclinic.repository;

import com.perakladau.polyclinic.entity.Passport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PassportRepository extends JpaRepository<Passport, Integer> {
}
