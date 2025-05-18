package io.github.VitorLopes.trabalho_seguranca_em_nuvem.repository;

import io.github.VitorLopes.trabalho_seguranca_em_nuvem.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    Usuario findByEmailCriptografado(String emailCriptografado);
}