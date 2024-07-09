class SmartWatch{
	
   static boolean isConnected = false ;
 
  public static boolean onOrOff(){
	  
   System.out.println("start of onOROff");
   
       if (isConnected == false){
       isConnected = true ;
	   System.out.println("The SmartWatch is Turned  on...");
	   }
	else   if(isConnected == true){   
	   isConnected = false ;
	   System.out.println("The SmartWatch is Turned off...");
	       System.out.println("end of onOrOff");
  }
    return isConnected;
	
	}     
}

	      



