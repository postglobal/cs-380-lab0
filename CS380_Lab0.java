package packagetest;


public class CS380_Lab0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("First Lab CS 380");
		
    	int num = 12345; //initialize
    	int reversed = 0;
    	int digit = 0;
    	
    	System.out.println(num);
    	
        while(num != 0) {
            digit = num % 10; //get last digit
            reversed = reversed * 10 + digit; //add last digit to end
            num /= 10; // remove last digit
          }

          System.out.println(reversed);
        }
	

}
