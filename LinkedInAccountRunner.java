class LinkedInAccountRunner{
	public static void main(String[] args){
		System.out.println("Main Started");
			boolean LinkedInAccountCreated = LinkedInAccount.createLinkedInAccount("Rakshitha" , "K C" , "Tumkur" , "Bangalore" , 9019155050L , "Rakshitha@gmail.com" , "03-jul-2002" , "BE" , "VTU" , "Playing Volleyboll" , "Rakshu@2002" , "Rakshu@2002");
			
			if(LinkedInAccountCreated ==true)
			LinkedInAccount.readUserLinkedInAccountDetails();
		System.out.println("Main Ended");
	}
}