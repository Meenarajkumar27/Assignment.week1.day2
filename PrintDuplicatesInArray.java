package assignment.week1.day2;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};

		
		// get the length of the array 
		// declare an int variable named count 
int count;
		for(int i=0;i<arr.length;i++)
			
		// iterate from 0 to the array length-1 (outer loop starts here)
		{
			count=1;
					// assign 0 to count 
		for(int j=i+1;j<arr.length;j++) {
			// iterate from i to the length of the array by adding 1 to it (inner loop starts here)
			if(arr[i]==arr[j]) {
				count++;
				
				//System.out.println(arr[i]);
                
              
			}
		}// compare both the loop variables & check they're equal
		if(count>1) {
		System.out.println(arr[i]);
		}
				
							// increase the count if both the arrays are equal
					
			// Out of the inner loop, check and print the first array variable if count is more than 0
		}

	}
}


