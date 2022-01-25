package com.javappa.start.item.repository;

import com.javappa.start.item.domain.Godzina;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GodzinaRepository extends JpaRepository<Godzina, Long> {
}
