import java.util.*;

class PossitiveOrNegative
{
public static void main(String args[])
{
Scanner s = new Scanner(System.in);

System.out.println("Enter the Number: ");
int num = s.nextInt();

if(num >= 0)
{
System.out.println("Possitive Number");
}
else
{
System.out.println("Negative Number");
}
}
}