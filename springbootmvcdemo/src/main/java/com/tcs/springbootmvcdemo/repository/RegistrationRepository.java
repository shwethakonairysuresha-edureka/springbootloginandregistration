package com.tcs.springbootmvcdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tcs.springbootmvcdemo.model.Registration;
@Repository
public interface RegistrationRepository extends JpaRepository<Registration, String> {

}