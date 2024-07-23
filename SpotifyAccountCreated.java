class SpotifyAccountCreated{
        
	    static String givenName ;
		static String password ;
		static String emailId ;
		static String confirmEmailId ;
		static String dateOfBirth ;
		
    public static boolean createSpotifyAccount(String userName, String pwd, String email, String confirmEmail, String dob){
	
	    boolean isSpotifyAccountCreated = false ;
		/*boolean isUserNameValid = false ;
		boolean isPwdValid = false ;
		boolean isEmailValid = false ;
		boolean isConfirmEmailValid = false ;
		boolean isDobValid = false ;
		
		//validation  //  null check 
		    if(userName != null){
			    givenName = userName ;
				isUserNameValid = true ;
			}
			else
			    System.out.println("User Name Invalid");
				
			if(pwd != null){
			    password = pwd ;
				isPwdValid = true ;
			}
			else 
			    System.out.println("Password Invalid");
				
			if(email != null){
			    emailId = email ;
				isEmailValid = true ;
			}
			else 
			    System.out.println("Email Id Invalid");
				
			if(confirmEmail != null){
			    confirmEmailId = confirmEmail ;
				isConfirmEmailValid = true ;
			}
			else
			    System.out.println("Confirm Email Id Invalid");
				
			if(dob != null){
			    dateOfBirth = dob ;
				isDobValid = true ;
			}
			else
			    System.out.println("Date of Birth is Invalid");
		    
			
			if(isUserNameValid == true && isPwdValid == true && isEmailValid == true && isConfirmEmailValid == true && isDobValid == true)
			isSpotifyAccountCreated = true ;*/
		
		isSpotifyAccountCreated = validatingSpotifyAccountUserDetails(userName, pwd, email, confirmEmail, dob);
		
		
		
		return isSpotifyAccountCreated;
	}
    
	public static boolean validatingSpotifyAccountUserDetails(String userName, String pwd, String email, String confirmEmail, String dob){
		boolean isAllFieldValidated = false ;
		boolean isUserNameValid = false ;
		boolean isPwdValid = false ;
		boolean isEmailValid = false ;
		boolean isConfirmEmailValid = false ;
		boolean isDobValid = false ;
		
		//validation  //  null check 
		    if(userName != null){
			    givenName = userName ;
				isUserNameValid = true ;
			}
			else
			    System.out.println("User Name Invalid");
				
			if(pwd != null){
			    password = pwd ;
				isPwdValid = true ;
			}
			else 
			    System.out.println("Password Invalid");
				
			if(email != null){
			    emailId = email ;
				isEmailValid = true ;
			}
			else 
			    System.out.println("Email Id Invalid");
				
			if(confirmEmail != null){
			    confirmEmailId = confirmEmail ;
				isConfirmEmailValid = true ;
			}
			else
			    System.out.println("Confirm Email Id Invalid");
				
			if(dob != null){
			    dateOfBirth = dob ;
				isDobValid = true ;
			}
			else
			    System.out.println("Date of Birth is Invalid");
		    
			
			if(isUserNameValid == true && isPwdValid == true && isEmailValid == true && isConfirmEmailValid == true && isDobValid == true)
			isAllFieldValidated = true ;
		return isAllFieldValidated ;
		
	}
	public static void readSpotifyAccountDetails(){
		
		 
		System.out.println("fetching... User Details...");
		System.out.println("The Spotify userName is :" + givenName);
		System.out.println("The Spotify User Password is :" + password);
		System.out.println("The Spotify User Email is :" + emailId);
		System.out.println("The Spotify User Confirm Email  is :" + confirmEmailId);
		System.out.println("The Spotify User Date of Birth is :" + dateOfBirth);
	
		
		
	}
}