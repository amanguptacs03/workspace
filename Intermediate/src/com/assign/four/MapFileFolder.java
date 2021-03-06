package com.assign.four;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapFileFolder {
static Map<File,List<File>> m=new HashMap<File ,List<File>>();
public static void main(String[] args) {
	mapContents("src");
	
	for(File f:m.keySet())
	{
		System.out.println(f);
		System.out.println(m.get(f));
	}
	
	
}
private static void mapContents(String string) {
	File f=new File(string);
	if(f.isDirectory()){
		ArrayList<File> arr=new ArrayList<File>();
		for(File fi:f.listFiles()){
			arr.add(fi);
			mapContents(fi.toString());
		}
		m.put(f, arr);	
	}
}
}
