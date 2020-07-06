package test.spring.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import test.spring.app.entity.Role;
import test.spring.app.entity.enums.RoleEnumeration;


import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface RoleRepository extends JpaRepository<Role, UUID> {
    public Optional<Role> findByName(RoleEnumeration name);
    public List<Role> findAllByName(RoleEnumeration name);
}
