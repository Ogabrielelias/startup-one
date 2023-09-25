package br.com.fiap.startupone.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.startupone.model.Sleep;

public interface SleepRepository extends JpaRepository<Sleep, Integer> {}

