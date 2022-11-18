package com.coderscampus.base;

public class User {
    private String username;
    private String password;
    private String name;
    private Boolean readAccess;
    private Boolean writeAccess;
    private Boolean superUser;

    public User() {
        this.readAccess = true;
        this.writeAccess = false;
        this.superUser = false;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getReadAccess() {
        return readAccess;
    }

    public void setReadAccess(Boolean readAccess) {
        this.readAccess = readAccess;
    }

    public Boolean getWriteAccess() {
        return writeAccess;
    }

    public void setWriteAccess(Boolean writeAccess) {
        this.writeAccess = writeAccess;
    }

    public Boolean getSuperUser() {
        return superUser;
    }

    public void setSuperUser(Boolean superUser) {
        this.superUser = superUser;
    }
}
