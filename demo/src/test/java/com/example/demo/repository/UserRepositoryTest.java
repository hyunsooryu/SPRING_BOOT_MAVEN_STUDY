package com.example.demo.repository;
import com.example.demo.DemoApplicationTests;
import com.example.demo.model.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.transaction.Transactional;
import java.time.LocalDateTime;
import java.util.Optional;


public class UserRepositoryTest extends DemoApplicationTests {

    @Autowired
    private UserRepository userRepository;


    @Test
    public void create(){
        User user = new User();
        user.setAccount("RYUHYUNSU");
        user.setEmail("raptopcpt@nate.com");
        user.setPassword("100825asa!");
        user.setPhoneNumber("010-7499-8045");
        user.setCreatedAt(LocalDateTime.now());
        user.setCreatedBy("Admin");
        user.setStatus("GREAT");
        User newUser = userRepository.save(user);
        System.out.println(newUser);

    }
    @Test
    public void read(){
        Optional<User> user = userRepository.findById(2L);
        user.ifPresent(selectUser->{
            System.out.println("USER : " + selectUser);
        });

    }


}
