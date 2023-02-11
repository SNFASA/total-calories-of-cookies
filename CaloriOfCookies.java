import java.util.Scanner;
public class CaloriOfCookies {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("number of cookies you ate ="  );
        int A = sc.nextInt();
        
        double TC;
        TC = A * 0.75 ;
        System.out.println("Total calories =" + TC  );
        
    }
}