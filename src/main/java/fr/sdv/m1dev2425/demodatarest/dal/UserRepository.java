package fr.sdv.m1dev2425.demodatarest.dal;

import fr.sdv.m1dev2425.demodatarest.bo.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByLogin(String login);
}
