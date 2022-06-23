package com.example.user.repository;

import com.example.user.model.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {

    public User getUser(){
        User user=new User("Basanta", "Scarborugh ON",30,"https://scontent.fyto1-1.fna.fbcdn.net/v/t39.30808-6/288877097_10221878948349978_3159069861996885400_n.jpg?_nc_cat=104&ccb=1-7&_nc_sid=0debeb&_nc_ohc=_yluQnBTGfcAX9oVph1&_nc_oc=AQm_93a6CUFCUagJrDpYJm7UPQFuPa217Mjby2H17KSg8S2cqVTnmZs_EEzxR1E7E-6cmkC6zM8baE8NSpSNfyC9&_nc_ht=scontent.fyto1-1.fna&oh=00_AT-H3WV2_vpvqB9WUnDKSRy58dq6JjrclESVc5KN4O6NsQ&oe=62B9F28B");

        return user;
    }
}
