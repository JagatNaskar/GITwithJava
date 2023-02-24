package Assignment1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class pinFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String re = "/^\\d{6}$/";
		//String re = "^[1-9]{1}[0-9]{2}\\\\s{0,1}[0-9]{3}$";
		String text;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your pin: ");
		text = sc.next();
		
		Pattern pt = Pattern.compile(re);
		if (text == null) {
            return;
        }
		Matcher mt = pt.matcher(text);
		boolean res = mt.matches();
		System.out.println(res);

	}

}
