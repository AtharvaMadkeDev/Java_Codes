package Basic_logical_programs;
import java.util.Scanner;

public class Armstrong_number_trial {

    public static void main(String[] args) {

        
    	
    	
    	
    	 
    	  String str;
    	  
    	  Scanner scan=new Scanner(System.in);
    	  
    	  str=scan.nextLine();
    	  
    			  
    	  
    	  int i=Integer.parseInt(str);
    	  int j=i;
    	  
    	  
    	  int sum=0;
//    	  int div=0;
    	  int rem;
//    	  int nem=0;
    	  
    	  
    	  while(i>0)
    	  {
    		  rem=i%10;   //3,5,1
    		  System.out.println("sum:"+sum);
    		  
    		 // sum=sum+rem*rem*rem*rem; //0+3*3*3
    		  int result=1;
    		  for(int z=1;z<=str.length();z++)
    		  {
    			  result=result*rem;
    		  }
    		  sum=sum+result;
//    		  //demo block
//    		  System.out.println(sum);
//    		  //demo block
    		   i=i/10; //15
    }
    	  System.out.println(sum);
    	  
    	  if(j==sum)
    	  {
    		  System.out.println("armstrong");
    	  }
}

}