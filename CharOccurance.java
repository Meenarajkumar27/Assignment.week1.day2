package assignment.week1.day2;

public class CharOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "welcome to chennai";
		char searchchar='c';
		int count=0;
		char[] str1=str.toCharArray();
				for(int i=0;i<str1.length;i++) {
							if((str1[i]==searchchar)) {
					count++;
					//str1[j]=(Character) null;
				}
			}
			

	System.out.println(count);
	}
	}

