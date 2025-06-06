package com.example.Projeto_Internato.controller;

import com.example.Projeto_Internato.dto.UsuarioRequestDTO;
import com.example.Projeto_Internato.dto.UsuarioResponseDTO;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @PostMapping
    public UsuarioResponseDTO criarUsuario(@RequestBody UsuarioRequestDTO dto) {
        return null;
    }

    @GetMapping
    public List<UsuarioResponseDTO> listarUsuarios() {
        return List.of();
    }

    @GetMapping("/{id}")
    public UsuarioResponseDTO buscarUsuario(@PathVariable Long id) {
        return null;
    }

    @PutMapping("/{id}")
    public UsuarioResponseDTO atualizarUsuario(@PathVariable Long id, @RequestBody UsuarioRequestDTO dto) {
        return null;
    }

    @DeleteMapping("/{id}")
    public void deletarUsuario(@PathVariable Long id) {
    }
}
