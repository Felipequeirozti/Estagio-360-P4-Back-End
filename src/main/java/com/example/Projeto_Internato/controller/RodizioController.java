package com.example.Projeto_Internato.controller;

import com.example.Projeto_Internato.dto.RodizioRequestDTO;
import com.example.Projeto_Internato.dto.RodizioResponseDTO;
import com.example.Projeto_Internato.service.RodizioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rodizios")
public class RodizioController {

    @Autowired
    private RodizioService rodizioService;

    @PostMapping
    public RodizioResponseDTO criarRodizio(@RequestBody RodizioRequestDTO dto) {
        return rodizioService.criar(dto);
    }

    @GetMapping
    public List<RodizioResponseDTO> listarRodizios() {
        return rodizioService.listarTodos();
    }

    @GetMapping("/{id}")
    public RodizioResponseDTO buscarRodizio(@PathVariable Long id) {
        return rodizioService.buscarPorId(id);
    }

    @PutMapping("/{id}")
    public RodizioResponseDTO atualizarRodizio(@PathVariable Long id, @RequestBody RodizioRequestDTO dto) {
        return rodizioService.atualizar(id, dto);
    }

    @DeleteMapping("/{id}")
    public void deletarRodizio(@PathVariable Long id) {
        rodizioService.deletar(id);
    }
}
