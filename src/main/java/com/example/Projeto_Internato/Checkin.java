package com.example.Projeto_Internato;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Checkin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Usuario usuario;

    @ManyToOne
    private Rodizio rodizio;

    private LocalDateTime dataHoraCheckIn;
    private LocalDateTime dataHoraCheckOut;

    private boolean presente;
    private boolean valido;
}
