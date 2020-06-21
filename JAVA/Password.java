package OppsAssignment;
import java.util.*;

public class Password {
	public static void main(String [] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Password");
		String pass = s.next();
		boolean cPass = true;
		try {
			boolean pLength =false;
			if(pass.length()<6) {
				pLength = true;
			}
			if(pLength) {
				throw new MyException("Password Length should be greater than 5!!");
			}
			if(pass.length()>15) {
				pLength =  true;
			}
			if(pLength) {
				throw new MyException("Password length should be less than 16!!");
			}
		}
		catch (MyException e){
			cPass = false;
			System.out.println(e.getMessage());
		}
		try {
			boolean isUpperCase = true;
			for(int i=0;i<pass.length();i++) {
				if(pass.charAt(i)>=65 && pass.charAt(i)<=90) {
					isUpperCase =  true;
					break;
				}
				else {
					isUpperCase =  false;
				}
			}
			if(!isUpperCase) {
				throw new MyException("Upper Case Letter is Required!!");
			}
		}
		catch (MyException e) {
			cPass = false;
			System.out.println(e.getMessage());
		}
		try {
			boolean isLowerCase = true;
			for(int i=0;i<pass.length();i++) {
				if(pass.charAt(i)>=97 && pass.charAt(i)<=122) {
					isLowerCase =  true;
					break;
				}
				else {
					isLowerCase =  false;
				}
			}
			if(!isLowerCase) {
				throw new MyException("Lower Case Letter is Required!!");
			}
		}
		catch (MyException e) {
			cPass = false;
			System.out.println(e.getMessage());
		}
		try {
			boolean num =  false;
			for(int i=0;i<pass.length();i++) {
				if(pass.charAt(i)>=48 && pass.charAt(i)<=57) {
					num = true;
					break;
				}
			}
			if(!num) {
				throw new MyException("Number is Required!!");
			}
		}
		catch (MyException e) {
			cPass = false;
			System.out.println(e.getMessage());
		}
		try {
			boolean specialChar = false;
			for(int i=0;i<pass.length();i++) {
				if(pass.charAt(i)>=33 && pass.charAt(i)<=64) {
					specialChar =  true;
					break;
				}
			}
			if(!specialChar) {
				throw new MyException("Special Character Required!!");
			}
			
		}
		catch (MyException e) {
			cPass = false;
			System.out.println(e.getMessage());
		}
		if(cPass) {
			System.out.println("Password Is Correct");
		}
	
	
	}
}

class MyException extends Exception {
	MyException(String s) {
		super(s);
	}
}