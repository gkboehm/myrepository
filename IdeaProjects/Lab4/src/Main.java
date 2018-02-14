import java.util.Scanner;
//Grace Boehm
public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        String currentNum;
        int position = 0;
        long answer = 0;
        System.out.print("Enter a hexadecimal number: ");
        currentNum = scanner.next();

        if (currentNum.charAt(position) == '0' && currentNum.charAt(position + 1) == 'x'){
            position = 2;
        }

        while (position < currentNum.length()){
    //This is a comment for Lab 5!
            int realNum;

            switch (currentNum.charAt(position)){
                case ('A'):
                    realNum = 10;
                    break;
                case ('a'):
                    realNum = 10;
                    break;
                case ('B'):
                    realNum = 11;
                    break;
                case ('b'):
                    realNum = 11;
                    break;
                case ('C'):
                    realNum = 12;
                    break;
                case ('c'):
                    realNum = 12;
                    break;
                case ('D'):
                    realNum = 13;
                    break;
                case ('d'):
                    realNum = 13;
                    break;
                case ('E'):
                    realNum = 14;
                    break;
                case ('e'):
                    realNum = 14;
                    break;
                case ('F'):
                    realNum = 15;
                    break;
                case ('f'):
                    realNum = 15;
                    break;
                default:
                    realNum = currentNum.charAt(position) - 48;
                }
                long exponent = (long) Math.pow(16, currentNum.length() - position - 1);
                long newNum = realNum * exponent;
                answer += newNum;
                position ++;


        }

        System.out.println("Your number is " + answer + " in decimal");
    }
}
