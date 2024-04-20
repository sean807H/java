import java.util.Scanner;
public class Kim
{
	public static void main(String[] args){
		int a=50,b=10;
		String yeon;
		Scanner sc = new Scanner(System.in,"EUCKR");
		System.out.println("(+-*/)중 하나를 입력하시오.");
		yeon = sc.next();
//		char seo = yeon.charAt(0);
//		if(seo=='+') System.out.println(a+"+"+b+"="+(a+b));
//		else if(seo=='-') System.out.println(a+"-"+b+"="+(a-b));
//		else if(seo=='*') System.out.println(a+"*"+b+"="+(a*b));
//		else if(seo=='/') System.out.println(a+"/"+b+"="+(a/b));
		if(yeon.equals("+")) System.out.println(a+"+"+b+"="+(a+b));
	}
}