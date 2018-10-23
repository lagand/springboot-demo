package online.springboot.demo.service.website;

public interface WebsiteUserService {

	/**
	 * µÇÂ¼ÈÏÖ¤
	 * @param name
	 * @param password
	 * @return
	 */
	Boolean validating(String name, String password);

}
