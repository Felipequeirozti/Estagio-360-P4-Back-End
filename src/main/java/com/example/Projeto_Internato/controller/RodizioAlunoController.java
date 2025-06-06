package com.example.Projeto_Internato.controller;

import com.example.Projeto_Internato.dto.RodizioAlunoRequestDTO;
import com.example.Projeto_Internato.dto.RodizioAlunoResponseDTO;
import com.example.Projeto_Internato.service.RodizioAlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rodizio-alunos")
public class RodizioAlunoController {

    @Autowired
    private RodizioAlunoService rodizioAlunoService;

    @PostMapping
    public RodizioAlunoResponseDTO criarRodizioAluno(@RequestBody RodizioAlunoRequestDTO dto) {
        return rodizioAlunoService.criar(dto);
    }

    @GetMapping
    public List<RodizioAlunoResponseDTO> listarRodizioAlunos() {
        return rodizioAlunoService.listarTodos();
    }

    @GetMapping("/{rodizioId}/{alunoId}")
    public RodizioAlunoResponseDTO buscarRodizioAluno(@PathVariable Long rodizioId, @PathVariable Long alunoId) {
        return rodizioAlunoService.buscarPorId(rodizioId, alunoId);
    }

    @PutMapping("/{rodizioId}/{alunoId}")
    public RodizioAlunoResponseDTO atualizarRodizioAluno(@PathVariable Long rodizioId, @PathVariable Long alunoId,
                                                         @RequestBody RodizioAlunoRequestDTO dto) {
        return rodizioAlunoService.atualizar(rodizioId, alunoId, dto);
    }

    @DeleteMapping("/{rodizioId}/{alunoId}")
    public void deletarRodizioAluno(@PathVariable Long rodizioId, @PathVariable Long alunoId) {
        rodizioAlunoService.deletar(rodizioId, alunoId);
    }
}
