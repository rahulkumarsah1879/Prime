import java.util.Scanner;
class Prime {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number");
        int num= scan.nextInt();
        int i=1;
        int count=0;
        while (i<=num){
            if(num%i==0)
            {
                count++;
            }
            i++;
        }
        if(count==2){
            System.out.println(num + " is prime number");
        }
        else{
            System.out.println(num+" is not prime number");
        }
    }
}
