package com.example.laboratornaya56.model;

import com.example.laboratornaya56.util.Generator;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

@Data
@Document(collection = "users")
@AllArgsConstructor
@Builder
public class User implements UserDetails {



    public User() {

    }

    public static User random() {
        return builder()
                .email(Generator.makeEmail())
                .name(Generator.makeName())
                .password(Generator.makePassword())
                .build();
    }
    @Id
    private String id;
    private String name;
    private String email;
    private String password;


    public User(String password, String email) {
        this.password = this.password;
        this.email = this.email;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getUsername() {
        return null;
    }

    @Override
    public boolean isAccountNonExpired() {
        return false;
    }

    @Override
    public boolean isAccountNonLocked() {
        return false;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return false;
    }

    @Override
    public boolean isEnabled() {
        return false;
    }
}
