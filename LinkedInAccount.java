class LinkedInAccount{
	static String firstName;
	static String lastName;
	static String perAddress;
	static String curtAddress;
	static long contactNumber;
	static String mailId;
	static String dateOfBirth;
	static String qualy;
	static String eduType;
	static String awards;
	static String password;
	static String securePwd;
		public static boolean createLinkedInAccount(String givenName , String surName , String permanetAddress , String currentAddress , long phoneNumber , String emailID , String dob , String qualification , String educationType , String achivements , String pwd , String confirmPwd){
			boolean isLinkedInAccountCreated = false;
			/*boolean isFirstNameValid = false;
			boolean isLastNameValid = false;
			boolean isPermentAddressValid = false;
			boolean isCurrentAddressValid = false;
			boolean isContactNumberValid = false;
			boolean isMailIdValid = false;
			boolean isDateOfBirthValid = false;
			boolean isQualificationValid = false;
			boolean isEducationValid = false;
			boolean isAwardsValid = false;
			boolean isPasswordValid = false;
			boolean isSecurePwdValid = false;
			
			if(givenName != null){
				firstName=givenName;
				isFirstNameValid = true;
			}
			else
				System.out.println("The user name is invalid");
			
			if(surName != null){
				lastName=surName;
				isLastNameValid=true;
			}
			else
				System.out.println("The user last name is invalid");
			
			if(permanetAddress != null){
				perAddress=permanetAddress;
				isPermentAddressValid =true;
			}
			else
				System.out.println("The permanet address is invalid");
			
			if(currentAddress != null){
				curtAddress=currentAddress;
				isCurrentAddressValid=true;
			}
			else
				System.out.println("The user current address is invalid");
			
			if(phoneNumber != 0.0){
				contactNumber=phoneNumber;
				isContactNumberValid=true;
			}
			else
				System.out.println("The user contact number is invalid");
			
			if(emailID != null){
				mailId=emailID;
				isMailIdValid=true;
			}
			else
				System.out.println("The user mail id is invalid");
			
			if(dob != null){
				dateOfBirth=dob;
				isDateOfBirthValid=true;
			}
			else
				System.out.println("The user date of birth is invalid");
			
			if(qualification != null){
				qualy=qualification;
				isQualificationValid=true;
			}
			else
				System.out.println("The user qualification is invalid");
			
			if(educationType != null){
				eduType=educationType;
				isEducationValid=true;
			}
			else
				System.out.println("The education type is invalid");
			
			if(achivements != null){
				awards=achivements;
				isAwardsValid=true;
			}
			else
				System.out.println("The user award is invalid");
			
			if(pwd != null){
				password=pwd;
				isPasswordValid=true;
			}
			else
				System.out.println("The user password is invalid");
			
			if(confirmPwd != null){
				securePwd=confirmPwd;
				isSecurePwdValid=true;
			}
			else
				System.out.println("The User confirm password is invalid");
			
			if(isFirstNameValid == true && isLastNameValid == true && isPermentAddressValid == true && isCurrentAddressValid == true && isContactNumberValid == true && isMailIdValid==true && isDateOfBirthValid==true && isQualificationValid==true && isEducationValid==true && isAwardsValid==true && isPasswordValid==true && isSecurePwdValid==true)
				isLinkedInAccountCreated = true;*/
			
			isLinkedInAccountCreated = validatingLinkedInAccountUserDetails(givenName, surName, permanetAddress, currentAddress, phoneNumber, emailID, dob, qualification, educationType, achivements, pwd, confirmPwd);
				
		return isLinkedInAccountCreated;
		}
		
		public static boolean validatingLinkedInAccountUserDetails(String givenName , String surName , String permanetAddress , String currentAddress , long phoneNumber , String emailID , String dob , String qualification , String educationType , String achivements , String pwd , String confirmPwd){
			boolean isAllFieldValidated = false;
			boolean isFirstNameValid = false;
			boolean isLastNameValid = false;
			boolean isPermentAddressValid = false;
			boolean isCurrentAddressValid = false;
			boolean isContactNumberValid = false;
			boolean isMailIdValid = false;
			boolean isDateOfBirthValid = false;
			boolean isQualificationValid = false;
			boolean isEducationValid = false;
			boolean isAwardsValid = false;
			boolean isPasswordValid = false;
			boolean isSecurePwdValid = false;
			
			if(givenName != null){
				firstName=givenName;
				isFirstNameValid = true;
			}
			else
				System.out.println("The user name is invalid");
			
			if(surName != null){
				lastName=surName;
				isLastNameValid=true;
			}
			else
				System.out.println("The user last name is invalid");
			
			if(permanetAddress != null){
				perAddress=permanetAddress;
				isPermentAddressValid =true;
			}
			else
				System.out.println("The permanet address is invalid");
			
			if(currentAddress != null){
				curtAddress=currentAddress;
				isCurrentAddressValid=true;
			}
			else
				System.out.println("The user current address is invalid");
			
			if(phoneNumber != 0.0){
				contactNumber=phoneNumber;
				isContactNumberValid=true;
			}
			else
				System.out.println("The user contact number is invalid");
			
			if(emailID != null){
				mailId=emailID;
				isMailIdValid=true;
			}
			else
				System.out.println("The user mail id is invalid");
			
			if(dob != null){
				dateOfBirth=dob;
				isDateOfBirthValid=true;
			}
			else
				System.out.println("The user date of birth is invalid");
			
			if(qualification != null){
				qualy=qualification;
				isQualificationValid=true;
			}
			else
				System.out.println("The user qualification is invalid");
			
			if(educationType != null){
				eduType=educationType;
				isEducationValid=true;
			}
			else
				System.out.println("The education type is invalid");
			
			if(achivements != null){
				awards=achivements;
				isAwardsValid=true;
			}
			else
				System.out.println("The user award is invalid");
			
			if(pwd != null){
				password=pwd;
				isPasswordValid=true;
			}
			else
				System.out.println("The user password is invalid");
			
			if(confirmPwd != null){
				securePwd=confirmPwd;
				isSecurePwdValid=true;
			}
			else
				System.out.println("The User confirm password is invalid");
			
			if(isFirstNameValid == true && isLastNameValid == true && isPermentAddressValid == true && isCurrentAddressValid == true && isContactNumberValid == true && isMailIdValid==true && isDateOfBirthValid==true && isQualificationValid==true && isEducationValid==true && isAwardsValid==true && isPasswordValid==true && isSecurePwdValid==true)
				isAllFieldValidated = true;
			return isAllFieldValidated ;
		}
		public static void readUserLinkedInAccountDetails(){
			System.out.println("The user First Name is " +firstName);
			System.out.println("The user Last Name is " +lastName);
			System.out.println("The user permanetAddress is " +perAddress);
			System.out.println("The user currentAddress is " +curtAddress);
			System.out.println("The user contact number is " +contactNumber);
			System.out.println("The user Email-Id is " +mailId);
			System.out.println("The user's Date-Of-Birth is " +dateOfBirth);
			System.out.println("The user's qualification is " +qualy);
			System.out.println("The user's educationType is " +eduType);
			System.out.println("The user's awards is " +awards);
			System.out.println("The user's Password is " +securePwd);
			System.out.println("The user's Date-Of-Birh is " +dateOfBirth);
		}
}