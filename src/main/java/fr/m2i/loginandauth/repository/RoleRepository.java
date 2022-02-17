package fr.m2i.loginandauth.repository;

import fr.m2i.loginandauth.models.Role;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends MongoRepository <Role, String> {
    Role findByName(String name);
}
