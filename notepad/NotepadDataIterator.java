package com.mahait.notepad;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class NotepadDataIterator {
	 public static void main(String[] args) {
	        // Specify the path to your text file
	        String filePath = "F:\\home\\CMPTEMP\\573708475412300156_262_840577800.txt";

	        try {
	            // Create a Scanner to read the file
	            Scanner scanner = new Scanner(new File(filePath));

	            // Read and process each line of the file
	            while (scanner.hasNextLine()) {
	                String line = scanner.nextLine();
	                System.out.println(line);
	            }
	            // Close the scanner when done
	            scanner.close();
	        } catch (FileNotFoundException e) {
	            System.err.println("File not found: " + e.getMessage());
	        }
	    }
}
