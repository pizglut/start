package com.javappa.start.item.repository;

import com.javappa.start.item.domain.Tytul;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TytulRepository extends JpaRepository<Tytul, Long> {
}
