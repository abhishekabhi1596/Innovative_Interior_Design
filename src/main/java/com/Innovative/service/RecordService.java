package com.Innovative.service;

import com.Innovative.Entities.Records;
import com.Innovative.repositories.RecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecordService {

    @Autowired
    private RecordRepository recordRepository;

    public List<Records> getAllexpenses(){

        return recordRepository.findAll();
    }


    public void addRecord(String name, String mode, String paidTo, String paidAmount, String description) {


        recordRepository.save(new Records(name,mode,paidTo,paidAmount,description));

    }

    public void deleteRecord(Long id) {
        recordRepository.deleteById(id);
    }
}
