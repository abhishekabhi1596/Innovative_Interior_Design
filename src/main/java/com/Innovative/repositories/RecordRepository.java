package com.Innovative.repositories;

import com.Innovative.Entities.Records;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecordRepository extends JpaRepository<Records,Long> {
}
