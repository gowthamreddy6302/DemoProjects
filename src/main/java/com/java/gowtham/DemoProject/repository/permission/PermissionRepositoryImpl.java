package com.java.gowtham.DemoProject.repository.permission;

import com.java.gowtham.DemoProject.models.permission.Permission;
import com.java.gowtham.DemoProject.repository.PermissionDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PermissionRepositoryImpl implements PermissionRepository {
    @Autowired
    private PermissionDao permissionDao;

    @Override
    public Permission createPermission(Permission permission) {
        return permissionDao.save(permission);
    }

    @Override
    public Permission updatePermission(Permission permission) {
        return permissionDao.save(permission);
    }

    @Override
    public void deletePermission(Long id) {
        permissionDao.deleteById(id);
    }

    @Override
    public Permission getPermissionById(Long id) {
        return permissionDao.findById(id).orElse(null);
    }

    @Override
    public List<Permission> getAllPermissionRequest() {
        return permissionDao.findAll();
    }
}
