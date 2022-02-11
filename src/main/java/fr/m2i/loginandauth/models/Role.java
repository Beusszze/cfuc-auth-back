package fr.m2i.loginandauth.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.Collection;

@Data @NoArgsConstructor @AllArgsConstructor @Document
public class Role {
    @Id
    private String id;
    private String name;
  //  @DBRef
  //  private Collection<User> users = new ArrayList<>();
}
