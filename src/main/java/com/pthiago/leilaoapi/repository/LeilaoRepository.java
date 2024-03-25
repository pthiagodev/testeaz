package com.pthiago.leilaoapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pthiago.leilaoapi.entity.Leilao;

@Repository
public interface LeilaoRepository extends JpaRepository<Leilao, Long> {

}
