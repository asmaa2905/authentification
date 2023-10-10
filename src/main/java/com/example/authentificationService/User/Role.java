package com.example.authentificationService.User;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.Collections;
import java.util.List;
import java.util.Set;

import static com.example.authentificationService.User.Permission.*;
import static com.example.authentificationService.User.Permission.CLIENT_DELETE;

@RequiredArgsConstructor
public enum Role {
    USER(Collections.emptySet()),
    ADMIN(Set.of(
            ADMIN_READ,
            ADMIN_CREATE,
            ADMIN_UPDATE,
            ADMIN_DELETE,
            CLIENT_READ,
            CLIENT_CREATE,
            CLIENT_UPDATE,
            CLIENT_DELETE
    )),
    CLIENT(Set.of(
            CLIENT_READ,
            CLIENT_CREATE,
            CLIENT_UPDATE,
            CLIENT_DELETE
    ));

    @Getter
    private final Set<Permission> permissions;

    public List<SimpleGrantedAuthority> getAuthorities(){
         return null;
    }
}
