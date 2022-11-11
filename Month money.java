import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    //Data\\\\\\\\\\\\\\\\\\\\\\\\\\
        Scanner sc = new Scanner(System.in);
        int sum = sc.nextInt();
        int con = sum;
        int proc = 10;
        int t;
        int end;
        //Data\\\\\\\\\\\\\\\\\\\\\\\\\\
        
        System.out.println(sum + "\n");
        //For\\\\\\\\\\\\\\\\\\\\\\\\\\\
        for(int i = 0; i < 3; ++i){
            t = (con/proc);
            end = (con-t);
            System.out.println(end);
            con = end;
        }
        //For\\\\\\\\\\\\\\\\\\\\\\\\\\\
        
        
        
	}
}