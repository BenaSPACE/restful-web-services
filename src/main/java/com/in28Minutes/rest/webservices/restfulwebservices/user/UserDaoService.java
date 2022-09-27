package com.in28Minutes.rest.webservices.restfulwebservices.user;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.function.Predicate;

@Component
public class UserDaoService {
    private static List<User> users = new ArrayList<>();

    private static int usersCount=0;

    static{
        users.add(new User(++usersCount, "Adam", LocalDate.now().minusYears(30)));
        users.add(new User(++usersCount, "Eve",  LocalDate.now().minusYears(25)));
        users.add(new User(++usersCount, "Jack",  LocalDate.now().minusYears(999)));
    }

    public List<User> findAll(){
        return users;
    }

    public User save(User user){
        if (user.getId()==null){
            user.setId(++usersCount);
        }
        users.add(user);
        return user;
    }

    public User findUser(int id){
        Predicate<? super User> predicate = user -> user.getId().equals(id);
        return users.stream().filter(predicate).findFirst().orElse(null);

//        for (User users:users)
//            if(users.getId()==id)
//                return users;
//        return null;
    }

    public void deleteById(int id){
        Predicate<? super User> predicate = user -> user.getId().equals(id);
        users.removeIf(predicate);
    }
}
