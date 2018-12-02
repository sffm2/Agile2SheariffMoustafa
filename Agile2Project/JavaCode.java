import java.util.Scanner;
public class javaproject {
	

	private static Scanner in;
	static   double length,width,hieght,area,celling,area2,paint,totalarea;
    static double firstcost = 0 ; 
    static  double costnovat,costvat,cost;
	public static void main(String[] args) {
		// TODO Auto-generated method stub



		
		
		in = new Scanner(System.in);
		
		System.out.print("Please enter your name: ");
		String Name = in.next();
		System.out.print("Please enter your mobile number: ");
		double Mobile = in.nextInt();
		System.out.print("Are you a new customer \n 1 for yes\n 2 for no\n");
		int New = in.nextInt();
	    double value;
	    boolean newCustomer;
	       if (New ==1){
	    	  
	        	newCustomer  = true;
	          newCustomer();
	        	}
	        else { newCustomer = false;
	        oldCustomer();
	        }
	    
       
	   
	   }
	
	
	
	
	public static void newCustomer() {
		
		
		
		int i = 0;
		
		System.out.print("Please enter how many rooms you have: ");
	    int Rooms = in.nextInt();
	    double total = 0;
		for (i=0;i<=Rooms;i++)
	    {
		   
		  System.out.print("enter the room type from the following:  L (living room), K (kitchen) or B (bedroom): ");  
		  String roomtype = in.next();
		  System.out.print("enter the width: "); 
		  width = in.nextDouble();
		  System.out.print("enter the length: "); 
		  length = in.nextDouble();
		  System.out.print("enter the hieght: "); 
		  hieght = in.nextDouble();
          System.out.print("How many coats paint 1 or 2: ");  
		  paint = in.nextInt();
		  
		  area = length*width*hieght;
		  area2 = (area*.15)-area;
		  celling = width*width;
		  totalarea = celling+area2;
		  
		  if (roomtype == "L") {
			     firstcost = totalarea*1.55;
		  } 
		  else if (roomtype ==" K") {
				 firstcost = totalarea*1.65;
			  }
		  else if (roomtype == "B") {
				 firstcost = totalarea*1.50;
			  }
		
		  if (paint==2) {
			     firstcost = firstcost*2;
		  }
		  
		  costnovat =  firstcost*Rooms;
		  
			
		  costnovat = (costnovat*.10)-costnovat;
		       
		  costvat = (costnovat*0.23)+costnovat;
		  
		  System.out.println("price: €"+costnovat);  
		  System.out.print("price: €"+costvat+"\n");  
		  
	    }	
			
		
		
	}
	public static void oldCustomer() 
	{   	int i = 0;
	       
	        
	        System.out.print("Please enter how many rooms you have: ");
		    int Rooms = in.nextInt();
		
		for (i=0;i<=Rooms;i++)
	    {
			 
		  System.out.print("enter the room type from the following:  L (living room), K (kitchen) or B (bedroom): ");  
		  String roomtype = in.next();
		  System.out.print("enther the width: "); 
		  width = in.nextDouble();
		  System.out.print("enter the length: "); 
		  length = in.nextDouble();
		  System.out.print("enter the hieght: "); 
		  hieght = in.nextDouble();
          System.out.print("How many coats paint 1 or 2: ");  
		  paint = in.nextInt();
		  
		  area = length*width*hieght;
		  area2 = (area*.15)-area;
		  celling = width*width;
		  totalarea = celling+area2;
		  
		  if (roomtype == "L") {
			     firstcost = totalarea*1.55;
			     
		  }
		  else if (roomtype ==" K") {
				 firstcost = totalarea*1.65;
				
			  }
		  else if (roomtype == "B") {
				 firstcost = totalarea*1.50;
				
			  }
		
		  if (paint==2) {
			     firstcost = firstcost*2;
			     
		  }
		  
		 
	    }
		

	}
	}