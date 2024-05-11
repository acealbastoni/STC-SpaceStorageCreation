package com.mohamedabdelhamid.demo.repository;

import com.mohamedabdelhamid.demo.model.Folder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FolderRepository extends JpaRepository<Folder, Long> {
}
