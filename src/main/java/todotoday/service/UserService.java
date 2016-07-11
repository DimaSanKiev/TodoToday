package todotoday.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import todotoday.model.User;

public interface UserService extends UserDetailsService {

    User findByUsername(String username);
}
