package io.github.VitorLopes.trabalho_seguranca_em_nuvem.service;

import io.github.VitorLopes.trabalho_seguranca_em_nuvem.dto.UsuarioDTO;
import io.github.VitorLopes.trabalho_seguranca_em_nuvem.entity.Usuario;
import io.github.VitorLopes.trabalho_seguranca_em_nuvem.repository.UsuarioRepository;
import io.github.VitorLopes.trabalho_seguranca_em_nuvem.security.AESUtil;
import io.github.VitorLopes.trabalho_seguranca_em_nuvem.security.HashUtil;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    private final UsuarioRepository repository;

    public UsuarioService(UsuarioRepository repository) {
        this.repository = repository;
    }

    public Usuario salvar(UsuarioDTO dto) throws Exception {
        Usuario usuario = new Usuario();
        usuario.setNomeCriptografado(AESUtil.encrypt(dto.getNome()));
        usuario.setEmailCriptografado(AESUtil.encrypt(dto.getEmail()));
        usuario.setSenhaHash(HashUtil.sha256(dto.getSenha()));
        return repository.save(usuario);
    }
}
