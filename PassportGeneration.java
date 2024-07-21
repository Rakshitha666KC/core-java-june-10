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
		    cpvLoc = cpvLocation ;
			dcdrLoc = dcdrLocation ;
			firstName = givenName ;
			lastName = surName ;
			dateOfBirth = dob ;
			emailId = loginId ;
			isLoginSame = isEmailLoginSame ;
			Id = loginId ;
			password = pwd ;
			confirmPassword = confirmPwd ;
			hintQuestion = hintQues ;
			hintAnswer = hintAns ;
		    confirmCaptcha = captcha ;
			isPassportCreated = true ;
		
		
		
		
		
		return isPassportCreated;
	}
    
	public static void readUserPassportDetails(){
		
		 
		System.out.println("fetching... User Details...");
		System.out.println("The User CPV Location is :" + cpvLoc);
		System.out.println("The User DCDR Location is :" + dcdrLoc);
        System.out.println("The User Given Name is :" + firstName);
        System.out.println("The User Sur NAme is :" + lastName);		
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