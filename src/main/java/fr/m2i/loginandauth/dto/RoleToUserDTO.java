package fr.m2i.loginandauth.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
public class RoleToUserDTO {
        private String username;
        private String roleName;
    }

