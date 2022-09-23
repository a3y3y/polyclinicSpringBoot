package com.perakladau.polyclinic.repository;

import com.perakladau.polyclinic.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface AddressRepository extends JpaRepository<Address, Integer> {

    Optional<Address> findByUuid(UUID uuid);
}
