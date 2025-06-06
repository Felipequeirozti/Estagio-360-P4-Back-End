package com.example.Projeto_Internato.dto;

import java.time.LocalDateTime;

public record CheckinResponseDTO(
    Long id,
    String nomeUsuario,
    String nomeRodizio,
    LocalDateTime dataHoraCheckIn,
    LocalDateTime dataHoraCheckOut,
    boolean presente,
    boolean valido
) {}
