package com.avinash.datastructure.list;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Test {

	public static void main(String[] args) throws IOException {
		int Pencount = 0;
		Map<Integer,String> mapP = new HashMap<>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        String line = br.readLine();
	        int T = Integer.parseInt(line);
	        for (int i = 0; i < T; i++) {
	        	String str=line = br.readLine();
	        	String strA[]=str.split(" ");
	        	int N =Integer.parseInt(strA[0]);
	        	int P = Integer.parseInt(strA[1]);
	        	int M = Integer.parseInt(strA[2]);
	        	String strP = br.readLine();
	        	String strPA[] = strP.split(" ");
	        	for(String s : strPA){
	        		Integer x = Integer.parseInt(s);
	        		mapP.put(x, s);
	        	}
	        	String strM = br.readLine();
	        	String strMA[] = strM.split(" ");
	        	for(String s : strMA){
	        	Integer x = Integer.parseInt(s);
	        	mapP.put(x, s);
	        	Pencount++;
	        	}
	        	if(N==mapP.size()){
	        		//System.out.println(mapP.size());
	        		System.out.println("They can");
	        	}
	        	else 
	        		System.out.println("They can't");
	        	mapP.clear();
	        }
	        

	}

}
