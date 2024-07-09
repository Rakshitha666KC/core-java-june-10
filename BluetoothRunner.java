class BluetoothRunner{
	
     public static void main(String[] bluetooth){
		 
      System.out.println("Main Started");
 boolean Connect = Bluetooth.onOrOff();
 System.out.println("is Bluetooth Connected :"+ Connect);
 Connect = Bluetooth.onOrOff();
 System.out.println("is Bluetooth Connected :"+ Connect);
       System.out.println("Main Ended");
      }
}