package io.github.VitorLopes.trabalho_seguranca_em_nuvem.controller;

import io.github.VitorLopes.trabalho_seguranca_em_nuvem.dto.UsuarioDTO;
import io.github.VitorLopes.trabalho_seguranca_em_nuvem.entity.Usuario;
import io.github.VitorLopes.trabalho_seguranca_em_nuvem.service.UsuarioService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {

    private final UsuarioService service;

    public UsuarioController(UsuarioService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<Usuario> cadastrar(@RequestBody UsuarioDTO dto) {
        try {
            return ResponseEntity.ok(service.salvar(dto));
        } catch (Exception e) {
            return ResponseEntity.internalServerError().build();
        }
    }
}