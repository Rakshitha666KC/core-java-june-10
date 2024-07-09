class Bluetooth {
    public static void main(String[] bluetooth){
	System.out.println("main started");
	
	// invoke a method
	// call a method
	getFeatures();
	
	System.out.println("main ended");
	}
	
	public static void getFeatures()
	{
	System.out.println("getFeatures method started");
	//local variable
	String brand = "MicroPhone";
	String color = "black";
	int Price = 2000;
    int	Length = 7;
    int Width = 8;
    int Height = 3;
	String Place = "Bengalur";
	System.out.println("The Brand Name is "+ brand);
	System.out.println("The color is "+ color);
	System.out.println("The Price is"+ Price);
	System.out.println("The length is"+ Length);
	System.out.println("The Width is"+ Width);
	System.out.println("The Height is"+ Height);
	System.out.println("The Place is"+  Place);
	System.out.println("getFeatures method ended");
	return;
	}
	}