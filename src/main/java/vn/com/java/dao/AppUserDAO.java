
package vn.com.java.dao;

import java.util.List;

import org.hibernate.criterion.Criterion;

import vn.com.java.entity.AppUser;

public interface AppUserDAO {

	public long save(AppUser appUser);

	public long update(AppUser appUser);

	public boolean delete(long id);
	
	public AppUser getById(long id);

	public List<AppUser> selectAll();

	public List<AppUser> select(Criterion condition);

	public int count(Criterion condition);
}
