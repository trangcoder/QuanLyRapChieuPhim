package vn.com.java.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import vn.com.java.context.ApplicationUserContext;
import vn.com.java.entity.AppUser;
import vn.com.java.service.AppUserService;

@Controller
@RequestMapping(value = "/user")
public class UserController {

	@Autowired
	private AppUserService appUserService;
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public String createUser(@ModelAttribute AppUser appUser) {
		return "create-user";
	}
	
	@RequestMapping(value = "", method = RequestMethod.POST)
	public String saveUser(@ModelAttribute AppUser appUser, Model model) {
		if(appUser != null && appUser.getId() > 0) {
			appUserService.update(appUser);
		} else if(appUser != null) {
			appUserService.save(appUser);
		}
		appUser = new AppUser();
		model.addAttribute("appUser", appUser);
		return "create-user";
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.GET)
	public String showUpdateUser(@RequestParam(value = "id") long id, Model model) {
		AppUser appUser = appUserService.getById(id);
		model.addAttribute("appUser", appUser);
		return "create-user";
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public String deleteUser(@RequestParam(value = "id") long id, Model model) {
		appUserService.delete(id);
		return "redirect:/user/list";
	}
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String listUser(Model model) {
		List<AppUser> list = appUserService.selectAll();
		model.addAttribute("users", list);
		model.addAttribute("loggedin", ApplicationUserContext.getLoggedinUser());
		return "list-user";
	}
}
