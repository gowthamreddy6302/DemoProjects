package com.java.gowtham.DemoProject.service.permission;

import com.java.gowtham.DemoProject.exception.UserNotFoundException;
import com.java.gowtham.DemoProject.models.permission.CreatePermissionRequest;
import com.java.gowtham.DemoProject.models.permission.Permission;
import com.java.gowtham.DemoProject.models.permission.UpdatePermissionRequest;
import com.java.gowtham.DemoProject.repository.permission.PermissionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PermissionServiceImpl implements PermissionService {
    @Autowired
    private PermissionRepository permissionRepository;

    @Override
    public Permission createPermission(CreatePermissionRequest createPermissionRequest) {
        Permission permission = new Permission();
        permission.setName(createPermissionRequest.getName());
        permission.setDescription(createPermissionRequest.getDescription());
        permission.setType(createPermissionRequest.getType());
        permission.setCustomers(createPermissionRequest.getCustomers());
        return permissionRepository.createPermission(permission);
    }

    @Override
    public Permission updatePermission(Long id, UpdatePermissionRequest updatePermissionRequest)
            throws UserNotFoundException{
        Permission permission = permissionRepository.getPermissionById(id);
        if (permission == null){
            throw new UserNotFoundException("PERMISSION-ID NOT FOUND WITH ENTERED ID : " + id);
        }
        if (updatePermissionRequest.getDescription() != null) {
            permission.setDescription(updatePermissionRequest.getDescription());
        }
        if (updatePermissionRequest.getType() != null) {
            permission.setType(updatePermissionRequest.getType());
        }
        return permissionRepository.updatePermission(permission);
    }

    @Override
    public void deletePermission(Long id) {
        permissionRepository.deletePermission(id);
    }

    @Override
    public Permission getPermissionById(Long id) throws UserNotFoundException {
        Permission permission = permissionRepository.getPermissionById(id);
        if (permission == null) {
            throw new UserNotFoundException("PERMISSION-ID NOT FOUND WITH ENTERED ID : " + id);
        }
        return permissionRepository.getPermissionById(id);
    }

    @Override
    public List<Permission> getAllPermissionRequest() {
        return permissionRepository.getAllPermissionRequest();
    }
}
