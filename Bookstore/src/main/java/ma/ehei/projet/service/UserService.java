package ma.ehei.projet.service;

import java.util.Set;

import ma.ehei.projet.model.User;
import ma.ehei.projet.model.security.PasswordResetToken;
import ma.ehei.projet.model.security.UserRole;

public interface UserService {
	PasswordResetToken getPasswordResetToken(final String token);
	
	void createPasswordResetTokenForUser(final User user, final String token);
	
	User findByUsername(String username);
	
	User findByEmail (String email);
	
	User createUser(User user, Set<UserRole> userRoles) throws Exception;
	
	User save(User user);
}
