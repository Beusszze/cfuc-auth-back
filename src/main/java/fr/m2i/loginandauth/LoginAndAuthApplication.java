package fr.m2i.loginandauth;

import fr.m2i.loginandauth.models.Role;
import fr.m2i.loginandauth.models.User;
import fr.m2i.loginandauth.repository.RoleRepository;
import fr.m2i.loginandauth.repository.UserRepository;
import fr.m2i.loginandauth.service.UserService;
import fr.m2i.loginandauth.service.UserServiceImplementation;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.ArrayList;

@SpringBootApplication
public class LoginAndAuthApplication {

    public static void main(String[] args) {
        SpringApplication.run(LoginAndAuthApplication.class, args);
    }

    @Bean
    PasswordEncoder passwordEncoder () {
        return new BCryptPasswordEncoder();
    }



    @Bean
    CommandLineRunner run(UserService userService, RoleRepository repo, UserRepository userRepository){
        return args -> {
            userService.saveRole(new Role(null, "ROLE_USER"));
            userService.saveRole(new Role(null, "ROLE_ADMIN"));

            userService.saveUser(new User(null, "ben", "1234", null));
            userService.saveUser(new User(null, "xxtotodu59xx", "1234", null));

            userService.addRoleToUser("ben", "ROLE_USER");
            userService.addRoleToUser("xxtotodu59xx", "ROLE_ADMIN");
        };
    }
}
