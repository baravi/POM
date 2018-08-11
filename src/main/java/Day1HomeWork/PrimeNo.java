package Day1HomeWork;

public class PrimeNo {

	public static void main(String[] args) {
				 int i,flag=0;      
		  int num=923;    
		      
		  if(num==0||num==1){  
		   System.out.println(num+" is not prime number");      
		  }else{  
		   for(i=2;i<num;i++){      
		    if(num%i==0){      
		     System.out.println(num+" is not prime number");      
		     flag=1;      
		     break;      
		    }      
		   }      
		   if(flag==0)  { System.out.println(num+" is prime number"); }  
		  }  
		}    
							
		}
		
