package com.Innovative.repositories;

import com.Innovative.Entities.Login;
import com.Innovative.Entities.Registration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface RegistrationRepository extends JpaRepository<Registration, Long> {

    @Query(
            value = "SELECT * FROM customer_record record where record.email =:name and record.password =:password",
            nativeQuery = true
    )
     Registration findByNameAndPassword(@Param("name") String name, @Param("password") String password);

     Login findByName(String username);
}
