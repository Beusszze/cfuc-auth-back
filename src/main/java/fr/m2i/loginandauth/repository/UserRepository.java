package fr.m2i.loginandauth.repository;

import fr.m2i.loginandauth.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository <User, String> {
    User findByUsername(String username);
}
