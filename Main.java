import java.util.Scanner; // Import the Scanner class



    class MyClass {
        public static void main(String[] args) {
       MyClass Calculator = new MyClass();


       int a;
       int b;
            Scanner myObj = new Scanner(System.in);
            System.out.println("WELCOME TO MY CALCULATOR!!!");
            System.out.println("WHAT DO  YOU WISH TO DO");

            System.out.println(
                    "1. Divide\n" +
                    "2. Subtract \n" +
                    "3. Multiply\n" +
                    "4. Addition\n");
            int option = myObj.nextInt();
            switch (option){
                case 1:
                    System.out.println("Enter 1st Number: ");
                    a = myObj.nextInt();
                    System.out.println("Enter 2nd Number: ");
                    b = myObj.nextInt();

                    int result = Calculator.Divide(a,b);
                    System.out.println("The answer for The Division of "+ a +" and " + b +" is: "+result);
                    break;
                case 2:
                    System.out.println("Enter 1st Number: ");
                    a = myObj.nextInt();
                    System.out.println("Enter 2nd Number: ");
                    b = myObj.nextInt();

                   int result1=   Calculator.subtract(a,b);
                    System.out.println("The answer for The difference of "+ a +" and " + b +" is: "+result1);
                    break;
                case 3:
                    System.out.println("Enter 1st Number: ");
                    a = myObj.nextInt();
                    System.out.println("Enter 2nd Number: ");
                    b = myObj.nextInt();

                     int result3 = Calculator.Multiply(a,b);
                    System.out.println("The answer for The Multiple of "+ a +" and " + b +" is: "+result3);
                    break;

                case 4:
                    System.out.println("Enter 1st Number: ");
                    a = myObj.nextInt();
                    System.out.println("Enter 2nd Number: ");
                    b = myObj.nextInt();

                    int result4 = Calculator.Add(a,b);
                    System.out.println("The answer for The Addition of "+ a +" and " + b +" is: "+result4);
                    break;



            }
        }

        public int Divide(int x, int y) {

            return x / y;
        }
            public int subtract( int x, int y) {

                return x - y;
            }
                public int Multiply (int x,int y) {

                    return x * y;

                }
                    public int Add (int x,int y) {

                        return x+y;
            }
        }
