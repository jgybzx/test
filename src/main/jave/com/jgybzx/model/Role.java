package com.jgybzx.model;

public class Role {
    private String id;

    private String roleName;

    private Integer status;

    public Role(String id, String roleName, Integer status) {
        this.id = id;
        this.roleName = roleName;
        this.status = status;
    }

    public Role() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}