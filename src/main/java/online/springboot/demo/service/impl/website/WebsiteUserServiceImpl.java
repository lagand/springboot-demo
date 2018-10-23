package online.springboot.demo.service.impl.website;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import online.springboot.demo.dao.website.WebsiteUserDao;
import online.springboot.demo.service.website.WebsiteUserService;

@Service
public class WebsiteUserServiceImpl implements WebsiteUserService{
	
	@Autowired
	private WebsiteUserDao websiteUserDao;

	public Boolean validating(String name, String password) {
		return websiteUserDao.validating(name, password);
	}

}
