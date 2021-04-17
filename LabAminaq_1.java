package questionAnswerDiscord;
import java.util.Scanner;
public class LabAminaq_1 {
	

	    public static void main(String[] args) {

	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter your first number :");
	    int num=sc.nextInt();
	    System.out.println("enter next number: ");
	    int num1=sc.nextInt();
	    int largest, smallest;
	 
	        if(num>num1) {
	       largest =num; smallest=num1;
	        
	    }else {
	    	largest =num1; smallest=num;
	        
	    }


             do {
            	 System.out.println("do you want enter anotehr  0 for no,  1 for yes");
            	 int num3=sc.nextInt();
	        switch(num3){

	          case 0:	      
	              System.out.println("largest number is : "+largest);
	              System.out.println("smallest number is :"+smallest);
	              return;
	             
	          case 1:
	            System.out.println("enter next number");
	            int num4=sc.nextInt();
	            if(num4<smallest) {
	            	smallest=num4;
	            }else if(num4>largest) {
	            	largest=num4;
	            }

	        }
	    }while( true);

	    }
	    
	     
	    }
	