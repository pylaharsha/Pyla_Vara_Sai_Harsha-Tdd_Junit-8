package com.epam.app;

public class Remove_A {
	public static String remove(String string) {
		// TODO Auto-generated method stub
		if(string.length()>0) {
			String str = string;
			String rst = "";
			if(str.charAt(0)=='A') {
				rst = str.replaceFirst("A","");
				if(rst.charAt(0)=='A') {
					 rst = rst.replaceFirst("A","");
				}
			}
			else if(str.charAt(1)=='A') {
				rst = str.replaceFirst("A","");
			}
			if(rst.length()>0) {
				return rst;
			}
			return str;
		}
		else {
			return "";
		}
	}
}
