package vn.com.java.context;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

import vn.com.java.entity.AppUser;

public class ApplicationUserContext {

	public static String getLoggedinUser() {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		String currentPrincipalName = ((AppUser)authentication.getPrincipal()).getUsername();
		return currentPrincipalName;
	}
	
}
