import java.util.Scanner;
class Pallindrome
{
  public static void main(String[] args)
  {
    System.out.println("Enter the no: to be checked");
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    int rem=0,rev=0;
    int temp=num;
    while(num>0)
      rem=num%10;
      rev=(rev*10)+rem;
      num=num/10;
      if(rev==temp)
        System.out.println("The no: is a pallindrome");
      else
        System.out.println("The no: is not a pallindrome");
  }
}

       /*        OR      */

import java.util.Scanner;
public class Pallindrome 
{
	public static void main(String[] args)
	{
		int new_num=0,count=0;
		System.out.println("Enter the no: to be checked");
		Scanner sc =new Scanner(System.in);
		int num=sc.nextInt();
		
		for(int i=num;i>0;i=(i/10))
		{
			int rem=i%10;
			new_num=new_num*10+rem;
			
		}
		System.out.println(new_num);
		if(new_num==num)
		{
			System.out.println("The given no: is a pallindrome");
		}
		else
		{
			System.out.println("The given no: is not a pallindrome");
		}
																									
	}
}
