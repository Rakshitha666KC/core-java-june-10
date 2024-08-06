class Bankrunner{

public static void main(String[] args){
	
Bank bank1 = new Bank(1,"State Bank of India","Main branch",100,"Rajesh kumar","SBIN000000001","SBININBBXXX");
System.out.println("Bank1 details=======");
bank1.displayDetails();
	
Bank bank2 = new Bank(2,"HDFC bank","Andheri Branch",75,"Sunita Mehta" ,"HDFC0000002","HDFCINBXXX");
System.out.println("bank2 details=======");
bank2.displayDetails();


Bank bank3 = new Bank(3,"ICIC BanK","jayanagar",50,"Anil reddy","ICICB0000003" ,"ICICINBB");
System.out.println("bank3 details=======");
bank3.displayDetails();

Bank bank4 = new Bank(4,"Axis Bank","Connaught place",60,"Pooja Sharma","UTIB0000004","AXISINBBXXX");
System.out.println("bank4 details=======");
bank4.displayDetails();

Bank bank5 = new Bank(5,"Punjab National Bank","Karol Bagh",80, "Vivek Gupta","PUNB0000005","PUNBINBBXXX");
System.out.println("bank5 details=======");
bank5.displayDetails();

Bank bank6 = new Bank(6,"Bank of Baroda","MG Road",70,"Kiran Joshi","BARBODBXXXX","BARBINBXXX");
System.out.println("bank6 details=======");
bank6.displayDetails();

Bank bank7 = new Bank(7,"Kotak Mahindra","Bandra west",65, "Pradeep Nair","KKBK0000006","KKBINBBXXX");
System.out.println("bank7 details=======");
bank7.displayDetails();

Bank bank8 = new Bank(8, "Canara Bank","MG road",90,"Latha rao","CNRB0000007","CNRBINBXXX");
System.out.println("bank8 details=======");
bank8.displayDetails();


}
}