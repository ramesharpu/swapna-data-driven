package test;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pom.Login;
import utils.RadFiles;

public class LoginValidationUsingYamlFile extends BaseTest{
	Map<String, Object> map;
	
	@BeforeClass
	public void beforeClass() {
		RadFiles obj = new RadFiles();
		map = obj.readYamlFiles("user.yaml");
		
	}
	
	@Test
	public void elaineUserTest() {
		HashMap<String, String> user = (HashMap<String, String>) map.get("user2");
		String username = user.get("username");
		String password = user.get("password");		
		Login login = new Login(driver);
		login.loginWithCredentials(username, password);
	}
	
	@Test
	public void danUserTest() {
		HashMap<String, String> user = (HashMap<String, String>) map.get("user1");
		String username = user.get("username");
		String password = user.get("password");		
		Login login = new Login(driver);
		login.loginWithCredentials(username, password);
	}
}
