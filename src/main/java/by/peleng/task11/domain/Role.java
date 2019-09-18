package by.peleng.task11.domain;

import org.springframework.security.core.GrantedAuthority;

public enum Role implements GrantedAuthority {
    USER,ADMIN,BLOCK;

    @Override
    public String getAuthority() {
        return name();
    }
}
