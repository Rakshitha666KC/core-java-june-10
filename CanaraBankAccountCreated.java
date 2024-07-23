class CanaraBankAccountCreated{
        
	    static String givenName ;
		static String midName ;
		static long aadhaarNo ;
		static String nation ;
		static long phoneNumber ;
		static String address ;
		
    public static boolean createBankAccount(String firstName, String middleName, long aadhaarNumber, String nationality, long mobileNumber, String permanentAddress){
	
	     boolean isBankAccountCreated = false ;
		 /*boolean isFirstNameValid = false ;
		 boolean isMiddleNameValid = false ;
		 boolean isAadhaarNumberValid = false ;
		 boolean isNationalityValid = false ;
		 boolean isMobileNumberValid = false ;
		 boolean isPermanentAddressValid = true ;
		 
		 if(firstName != null){
			givenName = firstName ;
			isFirstNameValid = true ;
		 }
		 else
			 System.out.println("First Name is Invalid");
		 
		 if(middleName != null){
			  midName = middleName ;
			  isMiddleNameValid = true ;
		 }
		 else
			System.out.println("Middle Name Invalid");
		
		if(AadhaarNumber != 0){
		 AadhaarNo = AadhaarNumber ;
		 isAadhaarNumberValid = true ;
		}
		else
			System.out.println("Aadhaar Number Invalid");
		
		if(nationality != null){
           nation = nationality ;
		   isNationalityValid = true ;
		}
		else
			System.out.println("Nationality is Invalid");
		 
        if(mobileNumber != 0.0){
		 phoneNumber = mobileNumber ;
		 isMobileNumberValid = true ;
		}
		else
			System.out.println("Mobile Number Invalid");
		
		if(permanentAddress != null){
		 address = permanentAddress ;
         isPermanentAddressValid = true ;		 
		}
		else
			System.out.println("Permanent Address Invalid");
		
		 isBankAccountCreated = true ;*/
		 
		 isBankAccountCreated = validatingBankAccountUserDetails(firstName, middleName, aadhaarNumber, nationality, mobileNumber, permanentAddress);
		 return isBankAccountCreated ;
	
	}
    
	public static boolean validatingBankAccountUserDetails(String firstName, String middleName, long aadhaarNumber, String nationality, long mobileNumber, String permanentAddress){
		boolean isAllFieldValidated = false ;
		 boolean isFirstNameValid = false ;
		 boolean isMiddleNameValid = false ;
		 boolean isAadhaarNumberValid = false ;
		 boolean isNationalityValid = false ;
		 boolean isMobileNumberValid = false ;
		 boolean isPermanentAddressValid = true ;
		 
		 if(firstName != null){
			givenName = firstName ;
			isFirstNameValid = true ;
		 }
		 else
			 System.out.println("First Name is Invalid");
		 
		 if(middleName != null){
			  midName = middleName ;
			  isMiddleNameValid = true ;
		 }
		 else
			System.out.println("Middle Name Invalid");
		
		if(aadhaarNumber != 0.0){
		 aadhaarNo = aadhaarNumber ;
		 isAadhaarNumberValid = true ;
		}
		else
			System.out.println("Aadhaar Number Invalid");
		
		if(nationality != null){
           nation = nationality ;
		   isNationalityValid = true ;
		}
		else
			System.out.println("Nationality is Invalid");
		 
        if(mobileNumber != 0.0){
		 phoneNumber = mobileNumber ;
		 isMobileNumberValid = true ;
		}
		else
			System.out.println("Mobile Number Invalid");
		
		if(permanentAddress != null){
		 address = permanentAddress ;
         isPermanentAddressValid = true ;		 
		}
		else
			System.out.println("Permanent Address Invalid");
		
		 isAllFieldValidated = true ;
		return isAllFieldValidated ;
	}
	public static void readBankAccountDetails(){
	
	    System.out.println("fetching... Student Details...");
		System.out.println("The Customer First Name is :" + givenName);
		System.out.println("The Customer Middle Name is :" + midName);
		System.out.println("The Customer Aadhaar Number is :" + aadhaarNo);
		System.out.println("The Customer Nationality is :" +nation);
		System.out.println("The Customer Mobile Number is :" + phoneNumber);
		System.out.println("The Customer Permanent Address is :" + address);
		
		
	
	}
}