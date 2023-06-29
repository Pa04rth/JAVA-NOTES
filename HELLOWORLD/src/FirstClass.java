public class FirstClass {
    public static void main(String[] args) {
        System.out.println("Hello Parth"); //print your name
        System.out.println("OUR NEW JOURNEY OF JAVA BEGINS");

        //ADDITION SIMPLE USING VARIABLES
        int num1 = 4;
        float num2 = 5;
        float  result = num1 + num2;
        System.out.println(result);
        char c='p';
        System.out.println(c);

        //LITERALS
        int num3=0b101; //BINARY UNDER INTEGER
        System.out.println(num3);
        int num4=0x4F;  //HEXADECIMAL UNDER INTEGER
        System.out.println(num4);
        char g ='a'; //INCREMENTING A LITERAL
        g++;
        System.out.println(g);

        //TYPE CONVERSION AND CASTING
        //CONVERSION
        byte num5=126;
        int num6= 12;
        num6=num5;
        System.out.println(num6);

        //CASTING
        byte num7=126;
        int num8=145;
        num7=(byte)num8;
        System.out.println(num7);

         //ASSIGNMENT OPERATORS
        int num9=7;
        result=num9++;      //FIRST FETCH THE VALUE THEN INCREMENT THE VALUE OF SUM
        //result=++num9;    //TRY THIS ALSO SEPERATELY
        System.out.println(result);

        //RELATIONAL OPERATOR
        double x=10;
        double y=7;
        int a=8;
        int b=9;
        boolean result2=x<y;
        System.out.println(result2);

        //LOGICAL OPERATORS
        boolean result1 = x >= y && a<=b ;
        System.out.println(result1);

        //CONDITIONAL STATEMENT
        if(x>5 && x<10 ) {
            System.out.println("a comes under this range");
            System.out.println("This is the second line");
        }
        //PROGRAM FOR GREATEST OF ALL THE THREE
        int z=9;
        if (x>y && x>z){
            System.out.println("x is greatest");
        }
        else if(y>z){
            System.out.println("y is greatest");
        }
        else{
            System.out.println("z is greatest");
        }

        //SWITCH STATEMENT
        int n=27;
        switch(n)
        {
            case 1:
                System.out.println("MONDAY");
                break;
            case 2:
                System.out.println("TUESDAY");
                break;
            case 3:
                System.out.println("WEDNESDAY");
                break;
            case 4:
                System.out.println("THURSDAY");
                break;
            case 5:
                System.out.println("FRIDAY");
                break;
            case 6:
                System.out.println("SATURDAY");
                break;
            case 7:
                System.out.println("SUNDAY");
                break;
            //USE DEFAULT STATEMENT FOR ANY OTHER VALUE THAN THESE
            default:
                System.out.println("Dhyan se pad laude ");

        }
        //LOOPS
        //NOW SEE THE OUTPUT IN BOTH THE CASES
        //CASE 1
        int num10=6;
        while(num10<=5)
        {
            System.out.println("THIS IS THE OUTPUT OF FIRST CASE");
            num10++;
        }
        //CASE 2
        do
        {
           System.out.println("THIS IS THE OUTPUT OF SECOND STATEMENT");
           num10++;
        }while(num10<=5);






    }
}
