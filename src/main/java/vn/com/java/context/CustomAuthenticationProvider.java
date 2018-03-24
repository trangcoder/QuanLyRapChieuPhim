package vn.com.java.context;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.authentication.encoding.Md5PasswordEncoder;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Component;

import vn.com.java.entity.AppUser;
import vn.com.java.service.AppUserService;

@Component("customAuthenticationProvider")
public class CustomAuthenticationProvider implements AuthenticationProvider{
 
    @Autowired
    private AppUserService userService;
    @Autowired
    private Md5PasswordEncoder encoder;
    
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
		String username = authentication.getName();
		String password = (String) authentication.getCredentials();

		AppUser user = userService.getUserByUserName(username, password);
 
        if (user == null) {
            throw new BadCredentialsException("User not found.");
		}
		return new UsernamePasswordAuthenticationToken(user, password, new ArrayList<>());
    }
 
    public boolean supports(Class<?> authentication) {
    	return authentication.equals(UsernamePasswordAuthenticationToken.class);
    }
 
}