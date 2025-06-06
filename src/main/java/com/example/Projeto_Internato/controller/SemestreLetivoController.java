package com.example.Projeto_Internato.controller;

import com.example.Projeto_Internato.dto.SemestreLetivoRequestDTO;
import com.example.Projeto_Internato.dto.SemestreLetivoResponseDTO;
import com.example.Projeto_Internato.service.SemestreLetivoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/semestres-letivos")
@RequiredArgsConstructor
public class SemestreLetivoController {

    private final SemestreLetivoService service;

    @PostMapping
    public SemestreLetivoResponseDTO criarSemestreLetivo(@RequestBody SemestreLetivoRequestDTO dto) {
        return service.criar(dto);
    }

    @GetMapping
    public List<SemestreLetivoResponseDTO> listarSemestresLetivos() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public SemestreLetivoResponseDTO buscarSemestreLetivo(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    @PutMapping("/{id}")
    public SemestreLetivoResponseDTO atualizarSemestreLetivo(@PathVariable Long id, @RequestBody SemestreLetivoRequestDTO dto) {
        return service.atualizar(id, dto);
    }

    @DeleteMapping("/{id}")
    public void deletarSemestreLetivo(@PathVariable Long id) {
        service.deletar(id);
    }
}
