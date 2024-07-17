class Addition {
    public static void add(byte num1, byte num2) {
        System.out.println( + (num1 + num2));
    }

    public static void add(short age, short num2, short num3, short num4) {
        short sum = (short) (age + num2 + num3 + num4);
		 if (age >= 18) {
            System.out.println("You are eligible to vote");
        } else {
            System.out.println("You are not eligible to vote");
        }
        System.out.println( + sum);
    }

   
