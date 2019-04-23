package teclaa;
import java.util.Scanner;
public class TeclaA {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int tempo=0;
        tempo=sc.nextInt(); 
        if (tempo>=5 && tempo<=7){
           System.out.println("madrugada");
        }
        if (tempo>=8 && tempo<=12){
           System.out.println("manha");
        }
        if (tempo>=13 && tempo<=19){
           System.out.println("tarde");
        }
        if (tempo>=20 && tempo<=4){
           System.out.println("noite");
        }
	Baguette32 
}