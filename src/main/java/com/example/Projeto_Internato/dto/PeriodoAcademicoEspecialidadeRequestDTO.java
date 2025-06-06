package com.example.Projeto_Internato.dto;

import lombok.Data;

@Data
public class PeriodoAcademicoEspecialidadeRequestDTO {
    private Long periodoId;
    private Long especialidadeId;
    private Integer cargaHorariaObrigatoria;
}
