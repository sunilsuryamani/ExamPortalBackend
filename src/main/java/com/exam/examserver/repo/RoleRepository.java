package com.exam.examserver.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exam.examserver.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

}
