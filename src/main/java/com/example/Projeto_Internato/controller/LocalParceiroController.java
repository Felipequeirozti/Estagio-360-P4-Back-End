package com.example.Projeto_Internato.controller;

import com.example.Projeto_Internato.dto.LocalParceiroRequestDTO;
import com.example.Projeto_Internato.dto.LocalParceiroResponseDTO;
import com.example.Projeto_Internato.service.LocalParceiroService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/locais-parceiros")
@RequiredArgsConstructor
public class LocalParceiroController {

    private final LocalParceiroService localParceiroService;

    @PostMapping
    public LocalParceiroResponseDTO criarLocalParceiro(@RequestBody LocalParceiroRequestDTO dto) {
        return localParceiroService.criar(dto);
    }

    @GetMapping
    public List<LocalParceiroResponseDTO> listarLocaisParceiros() {
        return localParceiroService.listar();
    }

    @GetMapping("/{id}")
    public LocalParceiroResponseDTO buscarLocalParceiro(@PathVariable Long id) {
        return localParceiroService.buscarPorId(id);
    }

    @PutMapping("/{id}")
    public LocalParceiroResponseDTO atualizarLocalParceiro(@PathVariable Long id, @RequestBody LocalParceiroRequestDTO dto) {
        return localParceiroService.atualizar(id, dto);
    }

    @DeleteMapping("/{id}")
    public void deletarLocalParceiro(@PathVariable Long id) {
        localParceiroService.deletar(id);
    }
}
