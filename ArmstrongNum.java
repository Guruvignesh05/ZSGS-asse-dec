import java.util.Scanner;

public class ArmstrongNum {
    static boolean isArmstrong(int num)
    {
        int str, digit=0, last=0, sum=0;
       str = num;
        for(; str > 0; str = str/10)
        {
            digit++;
        }
        str = num;
        for(; str > 0; str= str/10)
        {
            last = str % 10;
            sum +=  (Math.pow(last, digit));
        }
        if(num == sum)
            return true;
        else
            return false;
    }

    public static void main(String args[])
    {
        int n;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number : ");
        n = sc.nextInt();
        if ( isArmstrong(n) )
            System.out.println(n + " is an Armstrong number.");
        else
            System.out.println(n + " is not an Armstrong number.");
    }
}
