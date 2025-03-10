class PassportGeneration{
        
	    static String cpvLoc ;
		static String dcdrLoc ;
		static String firstName ;
		static String lastName ;
		static String dateOfBirth ;
		static String emailId ;
		static boolean isLoginSame ;
		static String Id ;
		static String password ;
		static String confirmPassword ;
		static String hintQuestion ;
		static String hintAnswer ;
		static String confirmCaptcha ;
		
		
	//Create Operation
    public static boolean createUserPassport(String cpvLocation, String dcdrLocation, String givenName, String surName, String dob, String email, boolean isEmailLoginSame, String loginId, String pwd, String confirmPwd,String hintQues, String hintAns, String captcha){
	
	    boolean isPassportCreated = false ;
		boolean isCpvLocationValid = false ;
		boolean isDcdrLocationValid = false ;
		boolean isGivenNameValid = false ;
		boolean isSurNameValid = false ;
		boolean isDobValid = false ;
		boolean isEmailValid = false ;
		boolean isisEmailLoginSameValid = false ;
		boolean isLoginIdValid = false ;
		boolean isPwdValid = false ;
		boolean isConfirmPwdValid = false ;
		boolean isHintQuesValid = false ;
		boolean isHintAnsValid = false ;
		boolean isCaptchaValid = false ;
		
		//validation  //  null check 
		    if(cpvLocation != null){
				cpvLoc = cpvLocation ;
				isCpvLocationValid = true ;
            }
			else
				System.out.println("CPV Location is InValid");
		    
			if(dcdrLocation != null){
			    dcdrLoc = dcdrLocation ;
				isDcdrLocationValid = true ;
			}
			else
				System.out.println("DCDR Location is Invalid");
			
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
			
			if(hintQues != null){
				hintQuestion = hintQues ;
				isHintQuesValid = true ;
			}
			else
				System.out.println("Hint Question is Invalid");
			
			if(hintAns != null){
				hintAnswer = hintAns ;
				isHintAnsValid = true ;
			}
			else
				System.out.println("Hint Answer is Invalid");
			
			if(captcha != null){
				confirmCaptcha = captcha ;
				isCaptchaValid = true ;
			}
			else
				System.out.println("Captcha Invalid");
			
		    
			
			if(isCpvLocationValid == true && isDcdrLocationValid == true && isGivenNameValid == true && isSurNameValid == true && isDobValid == true && isEmailValid == true && isisEmailLoginSameValid == true && isLoginIdValid == true && isPwdValid == true && isConfirmPwdValid == true && isHintQuesValid == true && isHintAnsValid == true && isCaptchaValid == true)
			isPassportCreated = true ;
		
		
		
		
		
		
		return isPassportCreated;
	}
    
	public static void readUserPassportDetails(){
		
		 
		System.out.println("fetching... User Details...");
		System.out.println("The User CPV Location is :" + cpvLoc);
		System.out.println("The User DCDR Location is :" + dcdrLoc);
        System.out.println("The User Given Name is :" + firstName);
        System.out.println("The User Sur Name is :" + lastName);		
		System.out.println("The User Date of Birth is :" + dateOfBirth);
		System.out.println("The User Email Address is :" + emailId);
		System.out.println("The User Email Login Same is :" + isLoginSame);
		System.out.println("The USer Login ID is:" + emailId);
		System.out.println("The USer Password is:" + password);
		System.out.println("The User will Confirm the Password is :" + confirmPassword);
		System.out.println("The User Hint Question is :" + hintQuestion);
		System.out.println("The User Hint Answer is :" + hintAnswer);
		System.out.println("THe User Passport Captcha is :" + confirmCaptcha);
		
		
	}
}