package com.javappa.start.item.repository;

import com.javappa.start.item.domain.Kategoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KategoriaRepository extends JpaRepository<Kategoria, Long> {
}
