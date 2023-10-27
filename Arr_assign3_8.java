/* 
An Armstrong number is a number where the sum of the cubes of its 
individual digits equals the number itself. 
For example, 153 is an Armstrong number because 1^3 + 5^3 + 3^3 = 153.
*/

import java.io.*;
import java.util.*;
class ArmstrongArray {

    static int Count(int num){
        int count = 0;
        while(num > 0){
            count++;
            num /= 10;
        }
        return count;
    }

    static boolean isArmstrongnum(int number){
        int temp = number;
        int digitCount = Count(number);
        int sum = 0;
        while(number > 0){
            int rem = number % 10;
            int multi = 1;
            for(int i = 1; i <= digitCount; i++){
                multi *= rem;
            }
            sum += multi;
            number = number / 10;
        }
        if(temp == sum){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args)throws IOException{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.print("Enter the Size of array :- ");
        int size = Integer.parseInt(br.readLine());

        System.out.print("Enter the Element (Seperated by space) :- " );
        String numStr = br.readLine();
        StringTokenizer st = new StringTokenizer(numStr, " ");

        int i = 0;
        int arr[] = new int[size];
        int armstrongArr[] = new int[size];
        int index = 0;
        while(st.hasMoreTokens()){
            int num = Integer.parseInt(st.nextToken());
            arr[i] = num;
            if(isArmstrongnum(num)){
                armstrongArr[index] = i;
                index++;
            }
            i++;
        }

        System.out.print("Armstrong number are found at index :- ");
        for(int j = 0;  j < armstrongArr.length; j++ ){
            if(j == 0 && armstrongArr[0] == 0){
                System.out.print(armstrongArr[0] + " ");
            }
            else if(armstrongArr[j] != 0){
                System.out.print(armstrongArr[j] + " ");
            }
        }
    }
}
