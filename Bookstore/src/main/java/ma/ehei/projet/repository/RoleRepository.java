package ma.ehei.projet.repository;

import org.springframework.data.repository.CrudRepository;

import ma.ehei.projet.model.security.Role;

public interface RoleRepository extends CrudRepository<Role, Long> {
	Role findByname(String name);
}
