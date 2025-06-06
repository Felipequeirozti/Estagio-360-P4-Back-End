package com.example.Projeto_Internato.dto;

import java.time.LocalDateTime;

public record CheckinRequestDTO(
    Long usuarioId,
    Long rodizioId,
    LocalDateTime dataHoraCheckIn,
    LocalDateTime dataHoraCheckOut,
    boolean presente,
    boolean valido
) {}
