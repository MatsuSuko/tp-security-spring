package fr.sdv.m1dev2425.demodatarest.service;

import fr.sdv.m1dev2425.demodatarest.bo.CustomUserDetails;
import fr.sdv.m1dev2425.demodatarest.bo.User;
import fr.sdv.m1dev2425.demodatarest.dal.UserRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service("customUserDetailsServiceImpl")
public class CustomUserDetailsService implements UserDetailsService {

    private final UserRepository userRepository;

    public CustomUserDetailsService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByLogin(username)
                .orElseThrow(() -> new UsernameNotFoundException("Utilisateur non trouvé : " + username));
        return new CustomUserDetails(user);
    }
}