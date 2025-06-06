package com.example.Projeto_Internato.dto;

import lombok.Data;

@Data
public class LocalEspecialidadeRequestDTO {
    private Long localId;
    private Long especialidadeId;
    private Integer qtdVagas;
    private Long semestreLetivoId;
}
