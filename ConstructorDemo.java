package OOPS;


	class User
	{
	int userId;
	String userName;
	String emailId;

	//constructor -if add any return type,compiler will consider it as method,not as a constructor
	//no compilation error will be given
	//explicitely Constructor cann't have any return type
	// but implicitely it reaturns instance of class
	//if you write any constructor explicitely in your code,jvm will not provide default constructor
	//two type- 1.no-args cons/default 2.parameterized constructor
	//class name and constructor name will be same
	public User(int id,String name,String email)
	{

	 userId=id;
	userName=name;
	emailId=email;
	}

	@Override
	public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("User [userId=").append(userId).append(", userName=").append(userName).append(", emailId=")
	.append(emailId).append("]");
	return builder.toString();
	}


	}//end of class

 public class ConstructorDemo {

	 public static void main(String[] args) {
	User user=new User(301, "medha", "medha@gmail.com");
	System.out.println(user);
	}

	}

