package com.Innovative.repositories;

import com.Innovative.Entities.Registration;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RegistoringCustomer extends JpaRepository<Registration, Long> {


        public Optional<Registration> findByEmail(String email);

}
