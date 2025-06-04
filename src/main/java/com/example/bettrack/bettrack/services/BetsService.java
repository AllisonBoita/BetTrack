package com.example.bettrack.bettrack.services;

import com.example.bettrack.bettrack.domain.bets.Bets;
import com.example.bettrack.bettrack.dtos.BetsDTO;
import com.example.bettrack.bettrack.repositories.BetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;

@Service
public class BetsService {

    @Autowired
    private UserService userService;

    @Autowired
    private BetRepository betRepository;

    @Autowired
    private RestTemplate restTemplate;

    public Bets createBet(BetsDTO betsDTO){
        if (betsDTO.stake().compareTo(BigDecimal.ZERO) <= 0){
            throw new InvalidBetException("Stake deve ser maior que zero");
        }

        if (betsDTO.odd().compareTo(BigDecimal.ZERO) <= 0){
            throw new InvalidBetException("Odd deve ser maior que zero");
        }

        if (betsDTO.home().equalsIgnoreCase(betsDTO.away())) {
            throw new InvalidBetException("Times não podem ser iguais");
        }

        //TODO Criar exceptions e terminar o construtor.

        var user = userService.findUserById(betsDTO.userId());

        Bets newBet = new Bets();
        newBet.setHome(newBet.getHome());



        return newBet;
    }
}
