package br.com.fiap.startupone.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.startupone.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
