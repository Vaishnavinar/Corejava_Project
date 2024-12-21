package Test;

import java.util.Scanner;

import Daoimpl.Userdaoimpl;
import Pojo.UserPojo;

public class UserTest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true) {
		System.out.println("1.register 2.login");
		Userdaoimpl userdaoimpl=new Userdaoimpl();
		int choice=sc.nextInt();
		if(choice==1) {
			System.out.println("--------------------register here-------------");
			System.out.println("enter username");
			String username=sc.next();
			System.out.println("enter email");
			String email=sc.next();
			System.out.println("enter password");
			String password=sc.next();
			
			UserPojo userPojo=new UserPojo(username, email, password);
			if(userdaoimpl.register(userPojo)) {
				System.out.println("register asuccessfully!!");
			}
			else {
				System.out.println("something went wrong!!");
			}
			
		}
		else {
			System.out.println("---------------login here--------");
			System.out.println("enter email");
			String email=sc.next();
			System.out.println("enter password");
			String password=sc.next();
			if(userdaoimpl.login(email, password)) {
				System.out.println("login suuceessfully!!");
				
				
				
				
				
				
				
			}
			else {
				System.out.println("go and first register!!");
			}
			
		}
		}

	}

}
