package com.java.gowtham.DemoProject.controller.permission;

import com.java.gowtham.DemoProject.exception.UserNotFoundException;
import com.java.gowtham.DemoProject.models.permission.CreatePermissionRequest;
import com.java.gowtham.DemoProject.models.permission.Permission;
import com.java.gowtham.DemoProject.models.permission.UpdatePermissionRequest;
import com.java.gowtham.DemoProject.service.permission.PermissionService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("")
public class PermissionController {
    @Autowired
    private PermissionService permissionService;

    @PostMapping("/permissions")
    public ResponseEntity<Permission> createPermission(@Valid @RequestBody CreatePermissionRequest createPermissionRequest) {
        Permission permission = permissionService.createPermission(createPermissionRequest);
        return new ResponseEntity<>(permission, HttpStatus.CREATED);
    }

    @PutMapping("/permissions/{id}")
    public ResponseEntity<Permission> updatePermission(@PathVariable Long id, @RequestBody UpdatePermissionRequest updatePermissionRequest) throws UserNotFoundException{
        Permission permission = permissionService.updatePermission(id, updatePermissionRequest);
        return new ResponseEntity<>(permission, HttpStatus.OK);
    }

    @DeleteMapping("/permissions/{id}")
    public ResponseEntity<String> deletePermission(@PathVariable Long id) {
        permissionService.deletePermission(id);
        String str = "SUCCESSFULLY DELETED";
        return new ResponseEntity<>(str, HttpStatus.OK);
    }

    @GetMapping("/permissions/{id}")
    public ResponseEntity<Permission> getPermissionById(@PathVariable Long id) throws UserNotFoundException {
        Permission permission = permissionService.getPermissionById(id);
        return new ResponseEntity<>(permission, HttpStatus.OK);
    }

    @GetMapping("/permissions")
    public ResponseEntity<List<Permission>> getAllPermissionRequest() {
        List<Permission> permission = permissionService.getAllPermissionRequest();
        return new ResponseEntity<>(permission, HttpStatus.OK);
    }
}
