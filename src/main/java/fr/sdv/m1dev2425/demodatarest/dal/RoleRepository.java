package fr.sdv.m1dev2425.demodatarest.dal;

import fr.sdv.m1dev2425.demodatarest.bo.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
}
