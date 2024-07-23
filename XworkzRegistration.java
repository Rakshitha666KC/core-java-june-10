class XworkzRegistration{

    static String firstName ;
	static long phoneNumber ;
	static String mailId ;
	static String usn ;
	static int yOPO ;
	static String clgName ;
	static String branch ;
	static String education ;
	
	public static boolean createXworkzRegistration(String fullName, long contactNumber, String emailId, String uSN, int yearOfPassedOut, String collegeName, String stream, String qualification){
	
	    boolean isXworkzRegistrationCreated = false ;
		/*boolean isFullNameValid = false ;
		boolean isContactNumberValid = false ;
		boolean isEmailIdValid = false ;
		boolean isUSNValid = false ;
		boolean isYearOfPassedOutValid = false ;
		boolean isCollegeNameValid = false ;
		boolean isStreamValid = false ;
		boolean isQualificationValid = false ;
		
		//validation  //  null check 
		    if(fullName != null){
			    firstName = fullName ;
				isFullNameValid = true ;
			}
			else
			    System.out.println("Full Name Invalid");
				
			if(contactNumber != 0.0){
			    phoneNumber = contactNumber ;
				isContactNumberValid = true ;
			}
			else
			    System.out.println("Contact Number Invalid");
				
			if(emailId != null){
			    mailId = emailId ;
				isEmailIdValid = true ;
			}
			else
			    System.out.println("Email Id Invalid");
				
			if(uSN != null){
			    usn = uSN ;
				isUSNValid = true ;
			}
			else
			    System.out.println("USN Invalid");
				
			if(yearOfPassedOut != 0.0){
			    yOPO = yearOfPassedOut ;
				isYearOfPassedOutValid = true ;
			}
			else
			    System.out.println("Year of Passed out Invalid");
				
			if(collegeName != null){
			    clgName = collegeName ;
				isCollegeNameValid = true ;
			}
			else
			    System.out.println("College Name Invalid");
				
			if(stream != null){
			    branch = stream ;
				isStreamValid = true ;
			}
			else
			    System.out.println("Stream Invalid");
				
			if(qualification != null){
			    education = qualification ;
				isQualificationValid = true ;
			}
			else
			    System.out.println("Qualification Invalid");
				
			
			
			if(isFullNameValid == true && isContactNumberValid == true && isEmailIdValid == true && isUSNValid == true && isYearOfPassedOutValid == true && isCollegeNameValid == true && isStreamValid == true && isQualificationValid == true)
			isXworkzRegistrationCreated = true ;*/
		
		isXworkzRegistrationCreated = validatingXworkzRegisteredDetails(fullName, contactNumber, emailId, uSN, yearOfPassedOut, collegeName, stream, qualification);
		
		
		
		
		return isXworkzRegistrationCreated;
	}
    
	public static boolean validatingXworkzRegisteredDetails(String fullName, long contactNumber, String emailId, String uSN, int yearOfPassedOut, String collegeName, String stream, String qualification){
		boolean isAllFieldValidated = false ;
		boolean isFullNameValid = false ;
		boolean isContactNumberValid = false ;
		boolean isEmailIdValid = false ;
		boolean isUSNValid = false ;
		boolean isYearOfPassedOutValid = false ;
		boolean isCollegeNameValid = false ;
		boolean isStreamValid = false ;
		boolean isQualificationValid = false ;
		
		//validation  //  null check 
		    if(fullName != null){
			    firstName = fullName ;
				isFullNameValid = true ;
			}
			else
			    System.out.println("Full Name Invalid");
				
			if(contactNumber != 0.0){
			    phoneNumber = contactNumber ;
				isContactNumberValid = true ;
			}
			else
			    System.out.println("Contact Number Invalid");
				
			if(emailId != null){
			    mailId = emailId ;
				isEmailIdValid = true ;
			}
			else
			    System.out.println("Email Id Invalid");
				
			if(uSN != null){
			    usn = uSN ;
				isUSNValid = true ;
			}
			else
			    System.out.println("USN Invalid");
				
			if(yearOfPassedOut != 0.0){
			    yOPO = yearOfPassedOut ;
				isYearOfPassedOutValid = true ;
			}
			else
			    System.out.println("Year of Passed out Invalid");
				
			if(collegeName != null){
			    clgName = collegeName ;
				isCollegeNameValid = true ;
			}
			else
			    System.out.println("College Name Invalid");
				
			if(stream != null){
			    branch = stream ;
				isStreamValid = true ;
			}
			else
			    System.out.println("Stream Invalid");
				
			if(qualification != null){
			    education = qualification ;
				isQualificationValid = true ;
			}
			else
			    System.out.println("Qualification Invalid");
				
			
			
			if(isFullNameValid == true && isContactNumberValid == true && isEmailIdValid == true && isUSNValid == true && isYearOfPassedOutValid == true && isCollegeNameValid == true && isStreamValid == true && isQualificationValid == true)
			isAllFieldValidated = true ;
		return isAllFieldValidated ;
	}
	public static void readXworkzRegistrationDetails(){
		
		 
		System.out.println("fetching... User Details...");
		System.out.println("The Xworkz Registered Student Name is :" + firstName);
        System.out.println("The Xworkz Registered Contact Number is :" + phoneNumber);
		System.out.println("The Xworkz Registered Student Email Id is :" + mailId);
		System.out.println("The Xworkz Registered Student USN is :" + usn);
        System.out.println("The Xworkz Registered Student Year of Passed out is :" + yOPO);
        System.out.println("The Xworkz Registered Student college Name is :" + clgName);
        System.out.println("The Xworkz Registered Student Stream is :" + branch);
        System.out.println("The Xworkz Registered Student Qualification is :" + education);

	
	
	
	
	
	
		
		
	}
}