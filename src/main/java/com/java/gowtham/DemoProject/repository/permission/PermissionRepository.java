package com.java.gowtham.DemoProject.repository.permission;

import com.java.gowtham.DemoProject.models.permission.Permission;

import java.util.List;

public interface PermissionRepository {
    Permission createPermission(Permission permission);
    Permission updatePermission(Permission permission);
    void deletePermission(Long id);
    Permission getPermissionById(Long id);
    List<Permission> getAllPermissionRequest();
}
