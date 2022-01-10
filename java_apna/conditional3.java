import java.util.*;
class conditional3
{
    public static void main(String agrs[])
   {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a first number:");
    int a=sc.nextInt();
    System.out.print("Enter a Second number:");
    int b=sc.nextInt();
    if(a==b){
      System.out.println("Its a equality type");
    }else if(a>b){
          System.out.println("First number is greater than second number");

    }else{
        System.out.println("First number is lesser than second number");
    }
 }
}

