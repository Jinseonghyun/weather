package com.weather.repository;

import com.weather.domain.Diary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface DiaryRepository extends JpaRepository<Diary, Integer> {
    List<Diary> findAllByDate (LocalDate date);

    List<Diary> findAllByDateBetween (LocalDate start, LocalDate end);

    Diary getFirstByDate(LocalDate date);

}
