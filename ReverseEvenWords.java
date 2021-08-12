package assignment.week1.day2;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "I am a software tester";
		String[] words=test.split("\\s");
		for(int i=0;i<words.length;i++) {
		//System.out.println(words[i]);
			if(i%2==0) {
				 int revlength=words[i].length();
				 for(int j=revlength-1;j>=0;j--) {
					 
				
				 
			        // print reversed String
			        System.out.print(words[i].charAt(j));
			}
				 
				 System.out.print(" ");
			
		}
			else {
				System.out.print(words[i] + " ");
			}
	}
	}
}

