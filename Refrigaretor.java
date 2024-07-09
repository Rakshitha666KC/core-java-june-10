class Refrigaretor{
	
   static boolean isConnected = false ;
 
  public static boolean onOrOff(){
	  
   System.out.println("start onOrOff");
   
       if (isConnected == false){
       isConnected = true ;
	   System.out.println("The Refrigaretor is Turned  on...");
	   } else if(isConnected == true){   
	   isConnected = false ;
	   System.out.println("The Refrigaretor is Turned off...");
	    System.out.println("end of onOrOff");
	   }
    return isConnected;
	   
  }
}
	   