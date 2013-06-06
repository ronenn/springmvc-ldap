package com.ronenn.spring.security;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ldap.core.DirContextOperations;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.ldap.userdetails.LdapAuthoritiesPopulator;

import java.util.Collection;

public class UserDetailsAuthoritiesPopulator implements LdapAuthoritiesPopulator {

    private static Logger logger = LoggerFactory.getLogger(UserDetailsAuthoritiesPopulator.class);

    private UserDetailsService userDetailsService;

    public UserDetailsAuthoritiesPopulator(UserDetailsService userDetailsService) {
        setUserDetailsService(userDetailsService);
    }

    public Collection<? extends GrantedAuthority> getGrantedAuthorities(DirContextOperations userData, String username) {
        UserDetails ud = userDetailsService.loadUserByUsername(username);
        Collection<? extends GrantedAuthority> res = ud.getAuthorities();
        logger.debug("GrantedAuthorities for {}: {}", username, res);
        return res;
    }

    public void setUserDetailsService(UserDetailsService userDetailsService) {
        this.userDetailsService = userDetailsService;
    }

}