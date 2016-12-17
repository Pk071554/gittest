import java.util.Scanner;
public class 菱形
{
 public static void main(String[] args) 
 {
  Scanner sc = new Scanner(System.in);
  System.out.println("请输入菱形变长：");
  int num =sc.nextInt();
  for (int i=1;i<=num;i++)
  {
   for(int j=1;j<num-i+1;j++)
   {
    System.out.print(" ");
   }
   int count =2*i-1;
   for(int k=0;k<count;k++)
   {
    if(0==k||count-1==k)
     System.out.print("*");
    else
     System.out.print(" ");
   }
   System.out.println("");
  }
  for(int i=1;i<num;i++)
  {
   for(int j=1;j<=i;j++)
   {
    System.out.print(" ");
   }
   int count = 2*(num-i)-1;
   for(int k=0;k<count;k++)
   {
    if(k==0||k==count-1)
     System.out.print("*");
    else
     System.out.print(" ");
   }System.out.println("");
  }
 }
}
