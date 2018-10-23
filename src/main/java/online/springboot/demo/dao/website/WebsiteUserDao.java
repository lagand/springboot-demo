package online.springboot.demo.dao.website;

import org.springframework.data.repository.query.Param;

public interface WebsiteUserDao {

	/**
	 * µÇÂ¼ÈÏÖ¤
	 * @param name
	 * @param password
	 * @return
	 */
	Boolean validating(@Param("name")String loginName, @Param("password")String password);

}
