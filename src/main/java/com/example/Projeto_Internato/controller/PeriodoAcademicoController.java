package com.example.Projeto_Internato.controller;

import com.example.Projeto_Internato.dto.PeriodoAcademicoRequestDTO;
import com.example.Projeto_Internato.dto.PeriodoAcademicoResponseDTO;
import com.example.Projeto_Internato.service.PeriodoAcademicoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/periodos-academicos")
@RequiredArgsConstructor
public class PeriodoAcademicoController {

    private final PeriodoAcademicoService periodoService;
    @PostMapping
    public PeriodoAcademicoResponseDTO criarPeriodo(@RequestBody PeriodoAcademicoRequestDTO dto) {
        return periodoService.criar(dto);
    }

    @GetMapping
    public List<PeriodoAcademicoResponseDTO> listarPeriodos() {
        return periodoService.listar();
    }

    @GetMapping("/{id}")
    public PeriodoAcademicoResponseDTO buscarPeriodo(@PathVariable Long id) {
        return periodoService.buscarPorId(id);
    }

    @PutMapping("/{id}")
    public PeriodoAcademicoResponseDTO atualizarPeriodo(@PathVariable Long id, @RequestBody PeriodoAcademicoRequestDTO dto) {
        return periodoService.atualizar(id, dto);
    }

    @DeleteMapping("/{id}")
    public void deletarPeriodo(@PathVariable Long id) {
        periodoService.deletar(id);
    }

}
