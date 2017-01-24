package main;

import java.util.Arrays;

public class IfArray {

	public static void main(String[] args) {
		int [] a = {1, 6, 7};
		int [] b = {1, 5, 7};
		
		if(Arrays.equals(a,b)) {
			System.out.println("massiivid a ja b on võrdsed");
		} else {
			System.out.println("massiivid a ja b ei ole võrdsed");
		}
	}

}
