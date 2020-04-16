import java.util.Scanner;
public class PrimeFactorDecomposition {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter a integer.");
        int number=input.nextInt();
        int isPrime=2;
        System.out.print(number+"=");
        while(isPrime<=number){
            if(isPrime==number){
                System.out.print(number);
                break;
            }else if(number%isPrime==0){
                System.out.print(isPrime+"*");
                number=number/isPrime;
            }else{
                isPrime++;
            }
        }
    }
}

