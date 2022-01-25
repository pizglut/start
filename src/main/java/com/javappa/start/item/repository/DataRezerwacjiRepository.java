package com.javappa.start.item.repository;

import com.javappa.start.item.domain.DataRezerwacji;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DataRezerwacjiRepository extends JpaRepository<DataRezerwacji, Long> {
}
