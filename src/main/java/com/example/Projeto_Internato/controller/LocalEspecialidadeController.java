package com.example.Projeto_Internato.controller;

import com.example.Projeto_Internato.dto.LocalEspecialidadeRequestDTO;
import com.example.Projeto_Internato.dto.LocalEspecialidadeResponseDTO;
import com.example.Projeto_Internato.service.LocalEspecialidadeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/locais-especialidades")
@RequiredArgsConstructor
public class LocalEspecialidadeController {

    private final LocalEspecialidadeService localEspecialidadeService;

    @PostMapping
    public LocalEspecialidadeResponseDTO criarLocalEspecialidade(@RequestBody LocalEspecialidadeRequestDTO dto) {
        return localEspecialidadeService.criar(dto);
    }

    @GetMapping
    public List<LocalEspecialidadeResponseDTO> listarLocaisEspecialidades() {
        return localEspecialidadeService.listar();
    }

    @GetMapping("/{id}")
    public LocalEspecialidadeResponseDTO buscarLocalEspecialidade(@PathVariable Long id) {
        return localEspecialidadeService.buscarPorId(id);
    }

    @PutMapping("/{id}")
    public LocalEspecialidadeResponseDTO atualizarLocalEspecialidade(@PathVariable Long id, @RequestBody LocalEspecialidadeRequestDTO dto) {
        return localEspecialidadeService.atualizar(id, dto);
    }

    @DeleteMapping("/{id}")
    public void deletarLocalEspecialidade(@PathVariable Long id) {
        localEspecialidadeService.deletar(id);
    }
}
