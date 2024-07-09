class SmartWatchRunner{
	
     public static void main(String[] Watch){
		 
      System.out.println("Main Started");
boolean Connect =  SmartWatch.onOrOff();
System.out.println("is SmartWatch Connected :" + Connect);
 Connect =  SmartWatch.onOrOff();
System.out.println("is SmartWatch Connected :" + Connect);
       System.out.println("Main Ended");
      }
}