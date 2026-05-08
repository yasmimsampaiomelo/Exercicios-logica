import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, interruptor, num;
		a = 0;
		b =0;
		num = sc.nextInt();
		int x = 0;
		while(x < num){
		    x++;
		    interruptor = sc.nextInt();
		    if (interruptor == 1){
            if (a == 0){
                a = 1;
            }
            else if( a == 1){
                a = 0;
            }
        }
            else if (interruptor == 2){
                if (a == 0 ){
                    a = 1;
                
                }else if( a == 1){
                    a = 0;
                }
                if(b == 0){
                    b = 1;
                }else if(b==1){
                    b=0;
                }
            }   
       }
       System.out.println(a);
       System.out.println(b);
	}
}

