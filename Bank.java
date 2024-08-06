class Bank{
	
	int id;
	String name;
	 static String branchName;
	int noOfWorkers;
	String bankmanager;
	   String ifscCode;
		 String  swiftCode;
		 
		 public Bank(int id,String name, String branchName,int noOfWorkers,String bankmanager,String ifscCode,String swiftCode){
			 this.id=id;
			 this.name=name;
			 this.branchName=branchName;
			 this.noOfWorkers=noOfWorkers;
			 this.bankmanager=bankmanager;
			 this.ifscCode=ifscCode;
			 this.swiftCode=swiftCode;
			 
		 }

/*public void displayDetails(){
	
System.out.println("bank id: " +id);
System.out.println("bank name: " +name);
System.out.println("bank branchName: " +branchName);
System.out.println("no of workers: " +noOfWorkers);
System.out.println("bank manager: " +bankmanager);
System.out.println("bank ifsc Code: " +ifscCode);
System.out.println("bank swift Code: " +swiftCode);
}*/


}