package ttinh._1.baitap.graphql.resolvers;

import ttinh._1.baitap.entity.User;
import ttinh._1.baitap.repository.UserRepository;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserResolver {

    private final UserRepository userRepository;

    public UserResolver(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @QueryMapping
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
