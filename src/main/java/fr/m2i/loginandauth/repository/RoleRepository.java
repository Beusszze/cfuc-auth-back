package fr.m2i.loginandauth.repository;

import fr.m2i.loginandauth.models.Role;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RoleRepository extends MongoRepository <Role, String> {
    Role findByName(String name);
}
