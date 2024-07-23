class AmazonGeneration{
        
	    
		static String firstName ;
		static String lastName ;
		static String dateOfBirth ;
		static long mobilenumber;
		static String emailId ;
		static boolean isLoginSame ;
		static String Id ;
		static String password ;
		static String confirmPassword ;
		
		
		
	//Create Operation
    public static boolean createUserAmazon(  String givenName, String surName, String dob,long mobile number, String email, boolean isEmailLoginSame, String loginId, String pwd, String confirmPwd, ){
	
	    boolean isAmazonCreated = false ;
	
		 boolean isAmazonCreated = false 
		boolean isGivenNameValid = false ;
		boolean isSurNameValid = false ;
		boolean isDobValid = false ;
		boolean isEmailValid = false ;
		boolean isisEmailLoginSameValid = false ;
		boolean isLoginIdValid = false ;
		boolean isPwdValid = false ;
		boolean isConfirmPwdValid = false ;
		
	
		
		//validation  //  null check 
		    
			
			if(givenName != null){
				firstName = givenName ;
				isGivenNameValid = true ;
			}
			else
				System.out.println("The Given Name is Invalid");
			
			if(surName != null){
				lastName = surName ;
				isSurNameValid = true ;
			}
			else 
				System.out.println("The Sur Name is Invalid");
			
			if(dob != null){
				dateOfBirth = dob ;
				isDobValid = true ;
			}
			else
				System.out.println("Date of Birth is Invalid");
			
			if(email != null){
				emailId = email ;
				isEmailValid = true ;
			}
			else
				System.out.println("Email Invalid");
			
			if(isEmailLoginSame != null){
				isLoginSame = isEmailLoginSame ;
				isisEmailLoginSameValid = true ;
			}
			else
				System.out.println("IsEmailLoginSame Invalid");
			
			if(loginId != null){
				Id = loginId ;
				isLoginIdValid = true ;
			}
			else
				System.out.println("Login Id Invalid");
			
			if(pwd != null){
				password = pwd ;
				isPwdValid = true ;
			}
			else
				System.out.println("Password Invalid");
			
			if(confirmPwd != null){
				confirmPassword = confirmPwd ;
				isConfirmPwdValid = true ;
			}
			else
				System.out.println("Confirm Password is Invalid");
			
			
		
			
		    
			
			if( isGivenNameValid == true && isSurNameValid == true && isDobValid == true && isEmailValid == true && isisEmailLoginSameValid == true && isLoginIdValid == true && isPwdValid == true && isConfirmPwdValid == true )
			isAmazonCreated = true ;
		
		
		
		
		
		
		return isAmazonCreated;
	}
    
	public static void readAmazonUserDetails(){
		
		 
		System.out.println("fetching... User Details...);
        System.out.println("The User Given Name is :" + firstName);
        System.out.println("The User Sur Name is :" + lastName);		
		System.out.println("The User Date of Birth is :" + dateOfBirth);
		System.out.println("The User Email Address is :" + emailId);
		System.out.println("The User Email Login Same is :" + isLoginSame);
		System.out.println("The USer Login ID is:" + emailId);
		System.out.println("The USer Password is:" + password);
		System.out.println("The User will Confirm the Password is :" + confirmPassword);
		
		
		
	}
}	
