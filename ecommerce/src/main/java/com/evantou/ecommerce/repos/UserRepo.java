package com.evantou.ecommerce.repos;

import com.evantou.ecommerce.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
