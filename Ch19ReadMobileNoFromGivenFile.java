/* Java program to read all mobile numbers present in given file.
   #Mobile Number validation criteria :
   		- The first digit should contain number between 7 to 9.
   		- The rest 9 digit can contain any number between 0 to 9.
   		- The mobile number can have 11 digits also by including 0 at the starting.
   		- The mobile number can be of 12 digits also by including 91 at the starting.
*/

package com.aadi.codingChallenges;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ch19ReadMobileNoFromGivenFile {
	
	public static void main(String[] args) throws IOException {
		
		PrintWriter pw = new PrintWriter("C:\\Users\\abcha\\OneDrive\\Documents\\output.txt");  //provide your own path.

		// Regular expression for mobile number.
		Pattern pt = Pattern.compile("(0|91)?[7-9][0-9]{9}");

		// BufferedReader for reading from input file.
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\abcha\\OneDrive\\Documents\\taj.txt")); //provide your own path & text file.
		
		String line = br.readLine();
			
		while (line != null) {
		
			Matcher m = pt.matcher(line);

			while (m.find()) {
				// Write the mobile number to output file.				
				pw.println(m.group());
			}
			
			line = br.readLine();
		}
		pw.flush();
	}
}
