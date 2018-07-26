package janani;
import java.util.Scanner;
public class Countstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str;
//int c=0,i;
System.out.println("enter the string");
Scanner ja=new Scanner(System.in);
str=ja.nextLine();
String s[]=str.split(" ");
int l=s.length;
/*for(i=0;i<s.length;i++){
	c=c+s[i].length();
}*/
System.out.println(l-1);
	}

}
