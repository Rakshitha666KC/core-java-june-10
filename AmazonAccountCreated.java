class AmazonAccountCreated{
        
	    static String givenName ;
		static String surName ;
		static long phoneNumber ;
		static String mailId ;
		static String password ;
		static String confirmPassword ;
		
    public static boolean createUserAccount(String firstName, String lastName, long mobileNumber, String email, String pwd, String confirmPwd){
	
	     boolean isAmazonAccountCreated = false ;
		 /*boolean isFirstNameValid = false ;
		 boolean isLastNameValid = false ;
		 boolean isMobileNumberValid = false ;
		 boolean isEmailValid = false ;
		 boolean isPwdValid = false ;
		 boolean isConfirmPwdValid = false ;
		 
		 if(firstName != null){
		    givenName = firstName ;
            isFirstNameValid = true ;			
		 }
		 else
			 System.out.println("First Name is Invalid");
		 
		 if(lastName != null){
			surName = lastName;
			isLastNameValid = true ; 
		 }
		 else
			System.out.println("Last Name is Invalid");
		 
		if(mobileNumber != 0.0){
			 phoneNumber = mobileNumber ;
			 isMobileNumberValid = true ;
		}
		else
			System.out.println("Mobile Number is Invaid");
		
		if(email != null){
			 mailId = email ;
			 isEmailValid = true ;
		}
		else
			System.out.println("Email Invalid");
		
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
			System.out.println("Confirm Password Invalid");
		 
        if(isFirstNameValid == true && isLastNameValid == true && isMobileNumberValid == true && isEmailValid == true && isPwdValid == true && isConfirmPwdValid == true) 
		isAmazonAccountCreated = true ;*/
	
	    isAmazonAccountCreated = validatingAmazonAccountUserDetails(firstName, lastName, mobileNumber, email, pwd, confirmPwd);
		 
		 return isAmazonAccountCreated ;
	
	}
    
	public static boolean validatingAmazonAccountUserDetails(String firstName, String lastName, long mobileNumber, String email, String pwd, String confirmPwd){
		boolean isAllFieldValidated = false ;
		boolean isFirstNameValid = false ;
		 boolean isLastNameValid = false ;
		 boolean isMobileNumberValid = false ;
		 boolean isEmailValid = false ;
		 boolean isPwdValid = false ;
		 boolean isConfirmPwdValid = false ;
		 
		 if(firstName != null){
		    givenName = firstName ;
            isFirstNameValid = true ;			
		 }
		 else
			 System.out.println("First Name is Invalid");
		 
		 if(lastName != null){
			surName = lastName;
			isLastNameValid = true ; 
		 }
		 else
			System.out.println("Last Name is Invalid");
		 
		if(mobileNumber != 0.0){
			 phoneNumber = mobileNumber ;
			 isMobileNumberValid = true ;
		}
		else
			System.out.println("Mobile Number is Invaid");
		
		if(email != null){
			 mailId = email ;
			 isEmailValid = true ;
		}
		else
			System.out.println("Email Invalid");
		
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
			System.out.println("Confirm Password Invalid");
		 
        if(isFirstNameValid == true && isLastNameValid == true && isMobileNumberValid == true && isEmailValid == true && isPwdValid == true && isConfirmPwdValid == true) 
		isAllFieldValidated = true ;
	
	return isAllFieldValidated ;
		
		
	}
	public static void readUserAccountDetails(){
	
	    System.out.println("fetching... Student Details...");
		System.out.println("The User First Name is :" + givenName);
		System.out.println("The User Last Name is :" + surName);
		System.out.println("The User Phone Number is :" + phoneNumber);
		System.out.println("The User email Id is :" + mailId);
		System.out.println("The User Password is :" + password);
		System.out.println("The User Confirm Password is :" + confirmPassword);
	
	}
}