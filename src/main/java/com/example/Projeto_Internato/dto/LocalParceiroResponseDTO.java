package com.example.Projeto_Internato.dto;

import lombok.Data;

@Data
public class LocalParceiroResponseDTO {
    private Long id;
    private String nome;
    private String sigla;
    private String endereco;
    private String cep;
    private String cidade;
    private Double latitude;
    private Double longitude;
}
