package com.example.Projeto_Internato.controller;

import com.example.Projeto_Internato.dto.PeriodoAcademicoEspecialidadeRequestDTO;
import com.example.Projeto_Internato.dto.PeriodoAcademicoEspecialidadeResponseDTO;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/periodos-especialidades")
public class PeriodoAcademicoEspecialidadeController {

    @PostMapping
    public PeriodoAcademicoEspecialidadeResponseDTO criarPeriodoEspecialidade(@RequestBody PeriodoAcademicoEspecialidadeRequestDTO dto) {
        return null;
    }

    @GetMapping
    public List<PeriodoAcademicoEspecialidadeResponseDTO> listarPeriodosEspecialidades() {
        return List.of();
    }

    @GetMapping("/{id}")
    public PeriodoAcademicoEspecialidadeResponseDTO buscarPeriodoEspecialidade(@PathVariable Long id) {
        return null;
    }

    @PutMapping("/{id}")
    public PeriodoAcademicoEspecialidadeResponseDTO atualizarPeriodoEspecialidade(@PathVariable Long id, @RequestBody PeriodoAcademicoEspecialidadeRequestDTO dto) {
        return null;
    }

    @DeleteMapping("/{id}")
    public void deletarPeriodoEspecialidade(@PathVariable Long id) {
    }
}
