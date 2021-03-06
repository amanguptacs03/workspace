package com.psl.main;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
	// exception and all its sub class exception come under checked exception
	// expect RUNTIME eXception
	// RUNTIME exception and all it subclass come in "unchecked exception"
	public static void main(String[] args) throws FileNotFoundException,
			IOException {
		 try {
		 searchProduct("Code--001");
		 FileReader fr=new FileReader("some file");
		 } catch (ProductNotFoundException|FileNotFoundException ex) {
		 // TODO: handle exception
		 }
		 /* try with resources
		 * in this we need not to call the close method,it will call bydefault
		 at the end try block ,no matter how try is end
		 *IN try with resource we can pass only those object that implement
		 "auto closable interface"
		 * */
		
		 try(FileReader fr=new FileReader("any file")){
		
		 }catch(IOException ex){
		
		 }
		
		 finally{
		 //the thread in which the exception occur,if unhandled then it
		 //terminate the current thread not the whole program--->IMPORTANT
		
		 }
		System.out.println(calculateSpeed(55, 12));
	}

	public static void searchProduct(String productCode)
			throws ProductNotFoundException {
		throw new ProductNotFoundException("not found!!");
	}


	private static double calculateSpeed(double distance, double time) {
		assert distance > 0 : "distance should be greatre than zero";
		
	/*If assertion	 fail then it will give assertion error.At normal flow assertion is avoided we need to enable the assertion by command line	" -ea"*/
		assert time > 0 : "timeshould be greatre than zero";// for disablingn write "-da"
															
		return distance / time;
	}

}