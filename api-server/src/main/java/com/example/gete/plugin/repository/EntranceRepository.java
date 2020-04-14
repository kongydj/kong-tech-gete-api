package com.example.gete.plugin.repository;

import com.example.gete.plugin.model.entity.Entrance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EntranceRepository extends JpaRepository<Entrance, Long> {
}
