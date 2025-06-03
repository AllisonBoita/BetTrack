package com.example.bettrack.bettrack.domain.bets;

import com.example.bettrack.bettrack.domain.user.User;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity(name="bets")
@Table(name="bets")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")

public class Bets {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    private String home;
    private String away;
    private String bet;
    private BigDecimal stake;
    private BigDecimal odd;
    @Enumerated(EnumType.STRING)
    private Result result;
    private LocalDateTime data;
}
