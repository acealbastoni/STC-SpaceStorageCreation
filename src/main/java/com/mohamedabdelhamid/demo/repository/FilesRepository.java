package com.mohamedabdelhamid.demo.repository;

import com.mohamedabdelhamid.demo.model.Files;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilesRepository extends JpaRepository<Files, Long> {
    // Add custom query methods if needed
}
