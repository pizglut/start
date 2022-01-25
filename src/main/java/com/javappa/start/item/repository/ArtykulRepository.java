package com.javappa.start.item.repository;

import com.javappa.start.item.domain.Artykul;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArtykulRepository extends JpaRepository<Artykul, Long> {
}
