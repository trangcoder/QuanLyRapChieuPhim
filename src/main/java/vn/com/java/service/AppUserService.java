
package vn.com.java.service;

import java.util.List;

import vn.com.java.entity.AppUser;

public interface AppUserService {

	public long save(AppUser appUser);
	
	public long update(AppUser appUser);
	
	public boolean delete(long id);
	
	public AppUser getById(long id);
	
	public List<AppUser> selectAll();
	
	public AppUser getUserByUserName(String username, String password);
	
	public AppUser getUserByEmail(String email);
	
	public int countUserByUsername(String username);
	
	public int countUserByEmail(String email);
	
}
