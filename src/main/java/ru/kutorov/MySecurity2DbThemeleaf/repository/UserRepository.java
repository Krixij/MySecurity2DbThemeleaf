package ru.kutorov.MySecurity2DbThemeleaf.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.kutorov.MySecurity2DbThemeleaf.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);
}
