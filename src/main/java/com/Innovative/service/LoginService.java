package com.Innovative.service;

import com.Innovative.Entities.Records;
import com.Innovative.Entities.Registration;
import com.Innovative.repositories.RecordRepository;
import com.Innovative.repositories.RegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoginService {

    @Autowired
    private RegistrationRepository registrationRepository;
    @Autowired
    private RecordRepository recordRepository;

    public Registration validates(String username , String password){

        return registrationRepository.findByNameAndPassword(username,password);
    }


    public List<Records> getAllRecords() {

        return recordRepository.findAll();

    }
}
