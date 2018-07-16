package com.project.kweater.domain;

import org.springframework.security.core.GrantedAuthority;

/**
 * Created by igor on 7/3/18
 *
 * @author Yovkhomishch I.A.
 */
public enum  Role implements GrantedAuthority {
    USER,
    ADMIN;

    @Override
    public String getAuthority() {
        return name();
    }
}
