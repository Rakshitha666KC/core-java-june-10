class SpeakerRunner{
	
     public static void main(String[] jbl){
		 
      System.out.println("Main Started");
 boolean Connect = Speaker.onOrOff();
 System.out.println("is Speaker Connected :"+ Connect);
 Connect = Speaker.onOrOff();
 System.out.println("is Speaker Connected :"+ Connect);
       System.out.println("Main Ended");
      }
}