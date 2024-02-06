package com.java.gowtham.DemoProject.repository;

import com.java.gowtham.DemoProject.models.permission.Permission;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PermissionDao extends JpaRepository<Permission, Long> {
}
