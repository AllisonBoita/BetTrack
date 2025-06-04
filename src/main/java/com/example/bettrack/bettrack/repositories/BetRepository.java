package com.example.bettrack.bettrack.repositories;

import com.example.bettrack.bettrack.domain.bets.Bets;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BetRepository extends JpaRepository<Bets, Long> {
}
