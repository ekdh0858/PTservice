package com.ptservice.ptservice.repository.packaze;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface PackageRepository extends JpaRepository<PackageEntity,Integer> {
    List<PackageEntity> findByCreatedAtAfter(LocalDateTime dateTime, Pageable pageable);
}
