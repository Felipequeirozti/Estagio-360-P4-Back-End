package com.example.Projeto_Internato.controller;

import com.example.Projeto_Internato.dto.EspecialidadeRequestDTO;
import com.example.Projeto_Internato.dto.EspecialidadeResponseDTO;
import com.example.Projeto_Internato.service.EspecialidadeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/especialidades")
@RequiredArgsConstructor
public class EspecialidadeController {

    private EspecialidadeService especialidadeService;

    @PostMapping
    public EspecialidadeResponseDTO criarEspecialidade(@RequestBody EspecialidadeRequestDTO dto) {
        return especialidadeService.criar(dto);
    }

    @GetMapping
    public List<EspecialidadeResponseDTO> listarEspecialidades() {
        return especialidadeService.listar();
    }

    @GetMapping("/{id}")
    public EspecialidadeResponseDTO buscarEspecialidade(@PathVariable Long id) {
        return especialidadeService.buscarPorId(id);
    }

    @PutMapping("/{id}")
    public EspecialidadeResponseDTO atualizarEspecialidade(@PathVariable Long id, @RequestBody EspecialidadeRequestDTO dto) {
        return especialidadeService.atualizar(id, dto);
    }

    @DeleteMapping("/{id}")
    public void deletarEspecialidade(@PathVariable Long id) {
        especialidadeService.deletar(id);
    }
}
