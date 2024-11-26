package ttinh._1.baitap.service;


import ttinh._1.baitap.entity.User;
import ttinh._1.baitap.repository.UserRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User createUser(String fullname, String email, String password, String phone) {
        User user = new User();
        user.setFullname(fullname);
        user.setEmail(email);
        user.setPassword(password);
        user.setPhone(phone);
        return userRepository.save(user);
    }

    public User updateUser(Long id, String fullname, String email, String password, String phone) {
        Optional<User> userOpt = userRepository.findById(id);
        if (userOpt.isPresent()) {
            User user = userOpt.get();
            user.setFullname(fullname);
            user.setEmail(email);
            user.setPassword(password);
            user.setPhone(phone);
            return userRepository.save(user);
        }
        return null;
    }

    public boolean deleteUser(Long id) {
        userRepository.deleteById(id);
        return true ;
    }
}
