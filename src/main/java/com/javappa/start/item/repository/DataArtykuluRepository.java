package com.javappa.start.item.repository;

import com.javappa.start.item.domain.DataArtykulu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DataArtykuluRepository extends JpaRepository<DataArtykulu, Long> {
}
