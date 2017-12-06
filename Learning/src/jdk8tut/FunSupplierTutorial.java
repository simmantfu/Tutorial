package jdk8tut;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class FunSupplierTutorial {

	public static void main(String...strings){
		
		List<LoginVo> listVo = new ArrayList<LoginVo>();
		listVo.add(new LoginVo("Simmant", "pass"));
		listVo.add(new LoginVo("Akshay", "pass4458"));
		
		LoginUtil loginUtil = new LoginUtil();
		
		loginUtil.append(listVo, loginUtil.getPassword(),loginUtil.getUser());
		listVo.forEach(k-> System.out.println(k.userName+" "+k.passWord));
	}
	
}

class LoginVo {

	String userName;
	String passWord;

	public LoginVo(String userName,String passWord){
		this.userName = userName;
		this.passWord = passWord;
	}

}

class LoginUtil {

	public Supplier<String> getPassword() {
		return () -> "123";
	}

	public Supplier<String> getUser() {
		return () -> "fu";
	}

	
	public List<LoginVo> append(List<LoginVo> logList, Supplier... supplier){
		
		logList.forEach(k-> {
			String s  = k.userName+""+supplier[0];
			String s2 = k.passWord+""+supplier[1];
			k.passWord = s2;
		k.userName = s;
		});
		
		return logList;
	}
	
}