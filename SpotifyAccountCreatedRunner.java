class SpotifyAccountCreatedRunner{

    public static void main(String[] spotify){
	
	    System.out.println("Main Started");
		boolean spotifyAccountCreated = SpotifyAccountCreated.createSpotifyAccount("Bhoomika", "bhumi@1234", "bhumika@gmail.com", "bhumika@gmail.com", "17/12/2002");
	    
		    if(spotifyAccountCreated == true)
		     SpotifyAccountCreated.readSpotifyAccountDetails();
		 
		System.out.println("Main Ended");
		
	
	}




}