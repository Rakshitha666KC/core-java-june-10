class LoanApplicationCreatedRunner{

    public static void main(String[] loan){
	
	    System.out.println("Main Started");
		boolean loanApplicationCreated = LoanApplicationCreated.createLoanApplication(750, "Personal Loan", "Krithika", "Canara Bank", 20, 2);
	    
		    if(loanApplicationCreated == true)
		     LoanApplicationCreated.readLoanApplicantsDetails();
		 
		System.out.println("Main Ended");
		
	
	}




}