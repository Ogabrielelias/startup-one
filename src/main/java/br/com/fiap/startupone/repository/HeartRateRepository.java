package br.com.fiap.startupone.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.startupone.model.HeartRate;

public interface HeartRateRepository extends JpaRepository<HeartRate, Integer> {

}