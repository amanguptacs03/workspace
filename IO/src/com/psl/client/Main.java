package com.psl.client;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Properties;
import java.util.Scanner;

public class Main {
public static void main(String[] args) throws Exception {
	char ch;
	
	File inputFile=new File("src/mangesh.txt");
	File outputFile=new File("src/aman.txt");
	
	FileInputStream fis=new FileInputStream(inputFile);
	FileOutputStream fos=new FileOutputStream(outputFile,true);
	
	InputStreamReader isr= new InputStreamReader(fis);
	OutputStreamWriter osw=new OutputStreamWriter(fos);
	
	fos.write('\n');
	
	while(isr.ready())
		osw.write((ch=(char) isr.read())==' '?'\n':ch);
	
	
	isr.close();
	osw.close();
	fis.close();
	fos.close();
	
	
	
	
	Properties p=new Properties();
	try {
		p.load(new FileReader("src/configuration.properties"));
		for(Object i:p.keySet()){
		
		System.out.println(i+" : "+p.getProperty((String) i));
		
	}
		
		//can use for CSV file (IMPORTANT)
//		Scanner scanFile =new Scanner(new File("a.csv"));
//	while(scanFile.hasNext()){
//		String line=scanFile.next();
//		Scanner token=new Scanner(line);
//		token.useDelimiter(",");
//		while(token.hasNext()){
//		String value=	token.next();
//		}
//	}
//	
//	//another approach
//	FileReader fr=new FileReader(new File("xyz.csv"));
//	BufferedReader br=new BufferedReader(fr);
//	String line;
//	while((line=br.readLine())!=null){
//		String[] data=line.split(line);
//		
//		
//	}
//	
//	
	} catch (IOException e) {
	e.printStackTrace();
	}
	
	
	
	
}
}
