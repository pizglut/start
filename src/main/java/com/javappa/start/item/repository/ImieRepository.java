package com.javappa.start.item.repository;

import com.javappa.start.item.domain.Imie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImieRepository extends JpaRepository<Imie, Long> {
}
