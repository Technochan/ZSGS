package Day_1;

import java.util.Scanner;

class Coordinates {

	public static void main(String[] args) {

		String str1 = "bb";
		String str2 = "zz";

		int result = str1.compareTo(str2);
		System.out.println(result);
		System.out.println(userCompare("bb", 5, "bb", 1) );
//		System.out.println(sumHeights2(new int[] {1, 2, 3, 4, 5, 4, 3, 2, 10},7,8));
	}
	public static int userCompare(String aName, int aId, String bName, int bId) {
		if(aName.compareTo(bName) > 0) return 1;
		else if (aName.compareTo(bName) < 0) return -1;
		else if (aName.compareTo(bName) == 0) {
			if(aId < bId) return -1;
			else if(aId > bId) return 1;
			else return 0;
		}
		return 0;
	}




}
