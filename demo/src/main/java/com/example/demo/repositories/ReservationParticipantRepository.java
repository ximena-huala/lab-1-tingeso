package com.example.demo.repositories;

import com.example.demo.entities.ReservationEntity;
import com.example.demo.entities.ReservationParticipantEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReservationParticipantRepository extends JpaRepository<ReservationParticipantEntity, Long> {
    List<ReservationParticipantEntity> findByReservation(ReservationEntity reservation);
}
