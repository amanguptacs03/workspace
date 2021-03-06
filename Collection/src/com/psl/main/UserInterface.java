package com.psl.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.prefs.BackingStoreException;

import com.psl.util.Aadhar;
import com.psl.util.BankAccount;
import com.psl.util.BankAccountFullNameComparator;
import com.psl.util.DBConnection;



public class UserInterface {
	
static	Map<Aadhar, List<BankAccount>> data;
public static void main(String[] args) throws IOException, SQLException {
	
	List<String> str;
	
	str =new ArrayList<String>();
	str.add("New");
	str.add("Day");
	str.add("Everyday");

	System.out.println(str.get(2));
	System.out.println(str.size());
	System.out.println(str.remove(0));
	
	
	for(String s:str){
		System.out.println(s);
	}
	
	
	Iterator<String> itr=str.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	
	
	
	ListIterator<String> lst_itr=str.listIterator();
	while(lst_itr.hasPrevious())
	{
		System.out.println(lst_itr.hasPrevious());
	}
	
	
	
	
	
	
	if(str.contains("Everyday")){    //internally call equals method
		
	}
	if(str.indexOf("Everyday")!=-1){
		
	}
	
	Set<BankAccount> acs;
	
	acs=new HashSet<BankAccount>();
	acs.add(new BankAccount("231",55.22));
	acs.add(new BankAccount("123",2355.22));
	acs.add(new BankAccount("123",45545.22));
	acs.add(new BankAccount("2545",6755.22));
	
	System.out.println(acs.size());
	
	
	for(BankAccount ac:acs){
		System.out.println(ac);
	}
	
//	System.out.println("==========+==========+===========+===================");
	SortedSet<BankAccount> sortedBankAccounts;
//	sortedBankAccounts =new TreeSet<BankAccount>();
//	sortedBankAccounts.add(new BankAccount("768", 6436));
//	sortedBankAccounts.add(new BankAccount("12768", 7636));
//	sortedBankAccounts.add(new BankAccount("34768", 7636));
//	sortedBankAccounts.add(new BankAccount("56768", 436436));
	
	
//	for(BankAccount ac :sortedBankAccounts)
//	{
//		System.out.println(ac);
//	}
	System.out.println("==========+==========+===========+===================");
	//COMPARATOR CONCEPT
	//sortedBankAccounts=new TreeSet<BankAccount>(new BankAccountFullNameComparator());
	sortedBankAccounts =new TreeSet<BankAccount>();
	sortedBankAccounts.add(new BankAccount("aman gupta","768", 6436));
	sortedBankAccounts.add(new BankAccount("mangesh","12768", 7636));
	sortedBankAccounts.add(new BankAccount("akshansh","34768", 7636));
	sortedBankAccounts.add(new BankAccount("aditya","56768", 436436));
	
	for(BankAccount ac :sortedBankAccounts)
	{
		System.out.println(ac.getFullName()+","+ac);
	}
	System.out.println("==========================================================");
	
	Set<BankAccount> accountobjects=new LinkedHashSet<BankAccount>();
	accountobjects.add(new BankAccount("qqq","2358",34346));
	accountobjects.add(new BankAccount("WWW","342358",341346));
	accountobjects.add(new BankAccount("ABC","235438",89346));
	accountobjects.add(new BankAccount("PQR","1358",3746));
	
	for(BankAccount ac :accountobjects)
	{
		System.out.println(ac.getFullName()+","+ac);
	}
	
	System.out.println("==========================================================");
	
	
	//
	
	
	
	Map<String,BankAccount> m;
	
	
	m=new HashMap<String, BankAccount>();
	m.put("2425", new BankAccount());
	m.put("4342425", new BankAccount());
	m.put("7882425", new BankAccount());
	m.put("2425", new BankAccount());  //this will overwrite the previous content of key="2425"
	
	//System.out.println(m.get("2425"));
	
	for(Map.Entry<String, BankAccount> ac:m.entrySet()){
		
		System.out.println(ac.getKey());
		System.out.println(ac.getValue());
	}
	
	System.out.println("===========================jai ho===================================");
	
	
	data=readFromFile("src/aadhar.txt");
	fetchAccountDetailsFromDB(data);
	
	double total=0;
	for(Map.Entry<Aadhar, List<BankAccount>> d:data.entrySet()){
		System.out.println("\n Aadhar : " +d.getKey().getNumber());
		List<BankAccount> al=d.getValue();
		for(BankAccount acc:al)
			total+=acc.getAmount();
		System.out.println(d.getValue());
		System.out.println("black money   : "+total);
		
	}
	
	
}

public static void fetchAccountDetailsFromDB(Map<Aadhar,List<BankAccount>> data) throws SQLException{
	Connection conn=DBConnection.getConnection();
	PreparedStatement ps=null;
	ResultSet rs=null;
	
	for(Aadhar a:data.keySet())
	{
		ps=conn.prepareStatement("select * from bank where aadhar=?");
		ps.setString(1, a.getNumber());
		rs=ps.executeQuery();
		
		String acc;
		String fullName;
		double amount;
		while(rs.next()){
			acc=rs.getString("account");
			fullName=rs.getString("fullName");
			amount=rs.getDouble("amount");
			 data.get(a).add(new BankAccount(fullName, acc, amount));
		}
	}
	
	
}

public static Map<Aadhar, List<BankAccount>> readFromFile(String filename) throws IOException{
	FileReader fr=new FileReader(new File(filename));
	BufferedReader br=new BufferedReader(fr);
	String s;
	Map<Aadhar, List<BankAccount>> m=new HashMap<Aadhar, List<BankAccount>>();
	while((s=br.readLine())!=null){
				Aadhar aadhar=new Aadhar(s);
				m.put(aadhar, new ArrayList<BankAccount>());
				
	}
	return m;
}
}



















