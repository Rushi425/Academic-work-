import java.util.Scanner;
public class ExceptionHandling{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        int a;
        int b = 5;
        int c;
        System.out.println("Start");
        for(int i = 0 ; i < 5 ; i++ )
        {
        try
        {
            System.out.println("Enter value of a :");
            a = sc.nextInt();
            c = a / b;
            System.out.println("Division :" +c);
        }


        catch (Exception e)
        {
            // System.out.println("Divisor should not be zero ");
            System.out.println(e);
            
        }
        System.out.println("end");
    }
}
}


        
    
