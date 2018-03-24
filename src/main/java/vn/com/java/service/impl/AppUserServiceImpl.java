
package  vn.com.java.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.criterion.Conjunction;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vn.com.java.dao.AppUserDAO;
import vn.com.java.entity.AppUser;
import vn.com.java.service.AppUserService;

@Service
@Transactional
public class AppUserServiceImpl implements AppUserService {

	private static final long serialVersionUID = 1L;
	@Autowired	
	private AppUserDAO appUserDAO;

	@Override
	public AppUser getUserByUserName(String username, String password) {
		Criterion condition = new Conjunction().add(Restrictions.eq("username", username))
				.add(Restrictions.eq("password", password)).add(Restrictions.eq("active", true));
		List<AppUser> list = appUserDAO.select(condition);
		if(list != null && !list.isEmpty()) {
			return list.get(0);
		}
		return null;
	}

	@Override
	public int countUserByUsername(String username) {
		Criterion condition = new Conjunction().add(Restrictions.eq("username", username));
		return appUserDAO.count(condition);
	}

	@Override
	public int countUserByEmail(String email) {
		Criterion condition = new Conjunction().add(Restrictions.eq("email", email));
		return appUserDAO.count(condition);
	}

	@Override
	public AppUser getUserByEmail(String email) {
		Criterion condition = new Conjunction().add(Restrictions.eq("email", email));
		List<AppUser> list = appUserDAO.select(condition);
		if(list != null && !list.isEmpty()) {
			return list.get(0);
		}
		return null;
	}

	@Override
	public long save(AppUser appUser) {
		return appUserDAO.save(appUser);
	}

	@Override
	public long update(AppUser appUser) {
		return appUserDAO.update(appUser);
	}

	@Override
	public boolean delete(long id) {
		return appUserDAO.delete(id);
	}

	@Override
	public List<AppUser> selectAll() {
		return appUserDAO.selectAll();
	}

	@Override
	public AppUser getById(long id) {
		return appUserDAO.getById(id);
	}
}
