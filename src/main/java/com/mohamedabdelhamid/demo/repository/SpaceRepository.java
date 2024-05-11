package com.mohamedabdelhamid.demo.repository;

import com.mohamedabdelhamid.demo.model.Space;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpaceRepository extends JpaRepository<Space, Long> {
}