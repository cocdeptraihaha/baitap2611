package ttinh._1.baitap.repository;

import ttinh._1.baitap.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}