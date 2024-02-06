package com.java.gowtham.DemoProject.service.permission;

import com.java.gowtham.DemoProject.exception.UserNotFoundException;
import com.java.gowtham.DemoProject.models.permission.CreatePermissionRequest;
import com.java.gowtham.DemoProject.models.permission.Permission;
import com.java.gowtham.DemoProject.models.permission.UpdatePermissionRequest;

import java.util.List;

public interface PermissionService {
    Permission createPermission(CreatePermissionRequest createPermissionRequest);

    Permission updatePermission(Long id, UpdatePermissionRequest updatePermissionRequest) throws UserNotFoundException;

    void deletePermission(Long id);

    Permission getPermissionById(Long id) throws UserNotFoundException;

    List<Permission> getAllPermissionRequest();
}
