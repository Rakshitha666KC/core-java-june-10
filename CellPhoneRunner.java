class CellPhoneRunner{
	
     public static void main(String[] phone){
		 
      System.out.println("Main Started");
boolean Connect =  CellPhone.onOrOff();
System.out.println("is CellPhone Connected :" + Connect);
 Connect =  CellPhone.onOrOff();
System.out.println("is CellPhone Connected :" + Connect);
       System.out.println("Main Ended");
      }
}