
package vn.com.java.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import vn.com.java.dao.AppUserDAO;
import vn.com.java.entity.AppUser;

@Repository
public class  AppUserDAOImpl implements AppUserDAO {

	private static final long serialVersionUID = 1L;
	
	@Autowired
	private SessionFactory sessionFactory;

	public List<AppUser> select(Criterion condition) {
		return getCurrentSession().createCriteria(AppUser.class).add(condition).list();
	}
	
	protected Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}

	@Override
	public int count(Criterion condition) {
		List<AppUser> val = select(condition);
		if(val != null) {
			return val.size();
		}
		return 0;
	}

	@Override
	public long save(AppUser appUser) {
		if(appUser != null) {
			getCurrentSession().save(appUser);
			return appUser.getId();
		}
		return 0;
	}

	@Override
	public long update(AppUser appUser) {
		if(appUser != null) {
			getCurrentSession().update(appUser);
			return appUser.getId();
		}
		return 0;
	}

	@Override
	public boolean delete(long id) {
		if(id > 0) {
			getCurrentSession().delete(getCurrentSession().get(AppUser.class, id));
			return true;
		}
		return false;
	}

	@Override
	public List<AppUser> selectAll() {
		return getCurrentSession().createQuery("from AppUser a").list();
	}

	@Override
	public AppUser getById(long id) {
		return (AppUser) getCurrentSession().get(AppUser.class, id);
	}
}
