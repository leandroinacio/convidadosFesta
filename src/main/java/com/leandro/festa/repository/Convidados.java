package com.leandro.festa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.leandro.festa.model.Convidado;

public interface Convidados extends JpaRepository<Convidado, Long>{

}
