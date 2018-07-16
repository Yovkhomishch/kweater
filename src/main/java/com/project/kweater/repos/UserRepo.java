package com.project.kweater.repos;

import com.project.kweater.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by igor on 7/3/18
 *
 * @author Yovkhomishch I.A.
 */
public interface UserRepo extends JpaRepository<User, Long> {
    User findByUsername(String username);

    User findByActivationCode(String code);
}
