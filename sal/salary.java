import java.util.*;
public class salary {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the manager salary:");
        int a = scan.nextInt();
        System.out.println("enter the developer salary:");
        int devsalary=scan.nextInt();
        int c=a*20/100;
        int salary=devsalary*10/100;
        System.out.println("the manager salary :"+(a+c));
        System.out.println("the developer salary:"+(devsalary+salary));
    }
}