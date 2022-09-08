package encapsulations;

public class Student {

	private int age ;
	 private String name ;
	 private String userName ; 
	 private String password ; 

	
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		if(password.equals("1234")&& userName.equals("admin")) {
			this.password = password;
			System.out.println("Welcome");
		}else {
			System.out.println("wrong password");
		}
		
		
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		if(userName.equals("admin")) {
			this.userName = userName;
			System.out.println("Enter your password");
		}else {
			System.out.println("Wrong user name");
		}
		
	}
	 
	
	
	
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		if(age>12) {
			System.out.println("you are too old to join this class " + age);
		}else {
			this.age = age;	
		}
		
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	} 
	 

}
