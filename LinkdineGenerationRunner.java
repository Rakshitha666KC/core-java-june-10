class LinkdineGenerationRunner{

    public static void main(String[] Linkdine){
	
	    System.out.println("Main Started");
		boolean LinkdineCreated = LinkdineGeneration.createUserLinkdine( "Rakshitha", "Abhi", null, "Rakshirakshitha@gmail.com", null, "Rakshirakshitha@gmail", "Rakshu@1234", "Rakshu@1234" "Rakshi.resume");
	    
		    if(LinkdineCreated == true)
		     LinkdineGeneration.readUserLinkdineDetails();
		 
		System.out.println("Main Ended");
		
	
	}




}