package ru.kutorov.MySecurity2DbThemeleaf.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.kutorov.MySecurity2DbThemeleaf.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
