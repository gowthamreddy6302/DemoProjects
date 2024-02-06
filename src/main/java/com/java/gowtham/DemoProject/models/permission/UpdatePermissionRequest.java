package com.java.gowtham.DemoProject.models.permission;

public class UpdatePermissionRequest {
    String description;
    String type;

    public UpdatePermissionRequest() {
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
