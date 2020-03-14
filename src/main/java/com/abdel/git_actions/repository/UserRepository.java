package com.abdel.git_actions.repository;

import com.abdel.git_actions.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author abdel-maliki
 * Date : 14/03/2020
 */
public interface UserRepository extends JpaRepository<User, Long> {
}
