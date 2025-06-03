package com.example.bettrack.bettrack.dtos;

import com.example.bettrack.bettrack.domain.bets.Result;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record BetsDTO(Long userId, LocalDateTime data, String home, String away, String bet, BigDecimal stake, BigDecimal odd, Result result) {
}
