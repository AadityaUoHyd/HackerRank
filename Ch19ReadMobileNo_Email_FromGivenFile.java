/* Java program to read all mobile numbers present in given file.
   #Mobile Number validation criteria :
   		- The first digit should contain number between 7 to 9.
   		- The rest 9 digit can contain any number between 0 to 9.
   		- The mobile number can have 11 digits also by including 0 at the starting.
   		- The mobile number can be of 12 digits also by including 91 at the starting.
   #Email validation criteria :
   		- A-Z characters allowed
 		- a-z characters allowed
 		- 0-9 numbers allowed
 		- First character must be alpha-numeric
 		- Domain name & top-level domain name shouldn't contain special character
 		- Must be one @ and one dot(.)
*/

package com.aadi.codingChallenges;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ch19ReadMobileNo_Email_FromGivenFile {
	
	public static void main(String[] args) throws IOException {
		
		PrintWriter printwriter = new PrintWriter("C:\\Users\\abcha\\OneDrive\\Documents\\output.txt");  //Kindly provide your own path

		// Regular expression for mobile number.
		Pattern mobilePattern = Pattern.compile("(0|91)?[7-9][0-9]{9}");
		Pattern mailPattern = Pattern.compile("[a-zA-Z0-9][a-zA-Z0-9_.]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+");

		// BufferedReader for reading from input file.
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\abcha\\OneDrive\\Documents\\taj.txt"));    //Kindly provide your own path
		
		String line = br.readLine();
			
		while (line != null) {
		
			Matcher mobileMatcher = mobilePattern.matcher(line);
			Matcher mailMatcher = mailPattern.matcher(line);

			while (mobileMatcher.find()) {
				// Write the mobile number to output file.				
				printwriter.println(mobileMatcher.group());
				
			}
			
			while (mailMatcher.find()) {
				// Write the mail number to output file.				
				printwriter.println(mailMatcher.group());
				
			}
			
			line = br.readLine();
		}
		printwriter.flush();
	}
}
