//HERE WE WILL TALK ABOUT CLASSES AND OBJECT ORIENTED PROGRAMMING
//CREATING A CLASS
class Calculator
{

    //int a;  this is how we add variable to the class
    int num =5;// THIS IS AN INSTANCE VARIABLE
    public int add(int a,int b)
    {
        int r=a+b;
        return r;
    }
}
public class OOP
{
  public static void main(String a[])
  {
     int num1=4;
     int num2=5;
     //IF WE DIRECTLY TYPE add() IT WILL NOT RECOGNIZE IT
      // SO WE NEED AN OBJECT FOR CALLING THIS METHOD
      Calculator obj1 = new Calculator();//OBJ 1 IS A REFERENCE VARIABLE
      int result=obj1.add(num1,num2);
      System.out.println(result);

      //EVERY OBJECT CREATES AN HEAP MEMORY OF THE CALCULATOR CLASS
      //WE CAN CREATE AS MANY OBJECTS AS POSSIBLE AND ALL ARE NOT INTER CONNECTED
      //MOW IF WE CHANGE THE VALE OF INSTANCE VARIABLE(num) FOR OBJECT1 THEN
      // IT WILL NOT CHANGE THE VALUE OF INSTANCE VARIABLE FOR OBJECT
      Calculator obj=new Calculator();
      obj1.num=10;
      System.out.println(obj1.num);
      System.out.println(obj.num);
  }
}


