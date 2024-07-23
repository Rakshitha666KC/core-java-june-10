class LoanApplicationCreated{
        
	    static int credit;
		static String type ;
		static String applicantName ;
		static String bankNa ;
		static int rOI ;
		static int yOL ;
		
    public static boolean createLoanApplication(int creditScore, String loanType, String loanApplicantName, String bankName, int rateOfInterest, int yearsOfLoan){
	
	    boolean isLoanApplicationCreated = false ;
		/*boolean isCreditScoreValid = false ;
		boolean isLoanTypeValid = false ;
		boolean isLoanApplicantNameValid = false ;
		boolean isBankNameValid = false ;
		boolean isRateOfInterestValid = false ;
		boolean isYearsOfLoanValid = false ;
		
		//validation  //  null check 
		    if(creditScore != 0){
			    credit = creditScore ;
				isCreditScoreValid = true ;
			}
			else
			    System.out.println("Credit Score Invalid");
				
			if(loanType != null){
			    type = loanType ;
				isLoanTypeValid = true ;
			}
			else 
			    System.out.println("Loan Type Invalid");
				
			if(loanApplicantName != null){
			    applicantName = loanApplicantName ;
				isLoanApplicantNameValid = true ;
			}
			else 
			    System.out.println("Loan Applicant Name Invalid");
				
			if(bankName != null){
			    bankNa = bankName ;
				isBankNameValid = true ;
			}
			else
			    System.out.println("Bank Name Invalid");
				
			if(rateOfInterest != 0){
			    rOI = rateOfInterest ;
				isRateOfInterestValid = true ;
			}
			else
			    System.out.println("Rate of Interest is Invalid");
		    
			if(yearsOfLoan != 0){
			    yOL = yearsOfLoan ;
				isYearsOfLoanValid = true ;
			}
			else
			    System.out.println("Years of Loan is Invalid");
			
			if(isCreditScoreValid == true && isLoanTypeValid == true && isLoanApplicantNameValid == true && isBankNameValid == true && isRateOfInterestValid == true && isYearsOfLoanValid == true)
			isLoanApplicationCreated = true ;*/
		
		isLoanApplicationCreated = validatingLoanApplicationDetails(creditScore, loanType, loanApplicantName, bankName, rateOfInterest, yearsOfLoan);
		
		
		
		
		return isLoanApplicationCreated;
	}
    
	public static boolean validatingLoanApplicationDetails(int creditScore, String loanType, String loanApplicantName, String bankName, int rateOfInterest, int yearsOfLoan){
		boolean isAllFieldValidated = false ;
		boolean isCreditScoreValid = false ;
		boolean isLoanTypeValid = false ;
		boolean isLoanApplicantNameValid = false ;
		boolean isBankNameValid = false ;
		boolean isRateOfInterestValid = false ;
		boolean isYearsOfLoanValid = false ;
		
		//validation  //  null check 
		    if(creditScore != 0){
			    credit = creditScore ;
				isCreditScoreValid = true ;
			}
			else
			    System.out.println("Credit Score Invalid");
				
			if(loanType != null){
			    type = loanType ;
				isLoanTypeValid = true ;
			}
			else 
			    System.out.println("Loan Type Invalid");
				
			if(loanApplicantName != null){
			    applicantName = loanApplicantName ;
				isLoanApplicantNameValid = true ;
			}
			else 
			    System.out.println("Loan Applicant Name Invalid");
				
			if(bankName != null){
			    bankNa = bankName ;
				isBankNameValid = true ;
			}
			else
			    System.out.println("Bank Name Invalid");
				
			if(rateOfInterest != 0){
			    rOI = rateOfInterest ;
				isRateOfInterestValid = true ;
			}
			else
			    System.out.println("Rate of Interest is Invalid");
		    
			if(yearsOfLoan != 0){
			    yOL = yearsOfLoan ;
				isYearsOfLoanValid = true ;
			}
			else
			    System.out.println("Years of Loan is Invalid");
			
			if(isCreditScoreValid == true && isLoanTypeValid == true && isLoanApplicantNameValid == true && isBankNameValid == true && isRateOfInterestValid == true && isYearsOfLoanValid == true)
			isAllFieldValidated = true ;
		
		return isAllFieldValidated ;
	}
	public static void readLoanApplicantsDetails(){
		
		 
		System.out.println("fetching... User Details...");
		System.out.println("The Loan Applicant give a creditScore is :" + credit);
		System.out.println("The Loan Type is :" + type);
		System.out.println("The Applicant Name is :" + applicantName);
		System.out.println("The Loan Bank Name is :" + bankNa);
		System.out.println("The Rate Of Interest is :" + rOI);
		System.out.println("The Years of Loan is :" + yOL);
	
		
		
	}
