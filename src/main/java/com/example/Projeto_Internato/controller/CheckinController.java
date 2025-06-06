package com.example.Projeto_Internato.controller;

import com.example.Projeto_Internato.dto.CheckinRequestDTO;
import com.example.Projeto_Internato.dto.CheckinResponseDTO;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/checkins")
public class CheckinController {

    @PostMapping
    public CheckinResponseDTO criarCheckin(@RequestBody CheckinRequestDTO dto) {
        return null;
    }

    @GetMapping
    public List<CheckinResponseDTO> listarCheckins() {
        return List.of();
    }

    @GetMapping("/{id}")
    public CheckinResponseDTO buscarCheckin(@PathVariable Long id) {
        return null;
    }

    @PutMapping("/{id}")
    public CheckinResponseDTO atualizarCheckin(@PathVariable Long id, @RequestBody CheckinRequestDTO dto) {
        return null;
    }

    @DeleteMapping("/{id}")
    public void deletarCheckin(@PathVariable Long id) {
    }
}
