class AmazonAccountCreatedRunner{

    public static void main(String[] args){
	
	    System.out.println("Main Started");
		boolean amazonAccountCreated = AmazonAccountCreated.createUserAccount("Rakshitha", "Rakshu", 8796751870L, "Rakshitha@gmail.com", "Rakshu@1234", "Rakshu@1234");
		
		if(amazonAccountCreated == true)
		AmazonAccountCreated.readUserAccountDetails();
		System.out.println("Main Ended");
	
	}
}