package online.springboot.demo.service.user.entity;

/**
 * 用户抽象类
 * @author 51953
 *
 */
public abstract class User {

	public String loginname;
	
	public String username;
	
	public String password;

	public String getLoginname() {
		return loginname;
	}

	public void setLoginname(String loginname) {
		this.loginname = loginname;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
