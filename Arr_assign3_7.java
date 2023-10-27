/* 
WAP to find Strong number from an array and returen its index.
a number whose sum of all digits factorial is equal to the number. 
For instance,
145 is a Strong Number as 1! + 4! + 5! = 1 + 24 + 120 = 145.
*/

import java.io.*;
import java.util.*;
class Arr_assign3_7 {

    static boolean isStrongNumber(int number) {
        int sum = 0;
        int temp = number;
    
        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }
    
        return sum == number;
    }
    
    static int factorial(int number) {
        if (number == 0 || number == 1) {
          return 1;
        }
    
        return number * factorial(number - 1);
    }
    public static void main(String[] args)throws IOException{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.print("Enter the size of array :- ");
        int size = Integer.parseInt(br.readLine());

        System.out.print("Enter the Elements (Seperated by Space) :- ");
        String numStr = br.readLine();

        StringTokenizer st = new StringTokenizer(numStr, " ");

        int arr[] = new int[size];
        int i = 0;
        int arr1[] = new int[size];
        int index = 0;
        while(st.hasMoreTokens()){
            int num = Integer.parseInt(st.nextToken());
            arr[i] = num;
            if(isStrongNumber(num)) {
                arr1[index] = i;
                index++;
            }
            i++;
        }

        System.out.print("Strong Numbers are found at index :- ");
        for(int j = 0; j < arr1.length; j++){
            if(j == 0 && arr1[0] == 0){
                System.out.print(arr1[0] + "  ");
            }
            else if(arr1[j] != 0){
                System.out.print(arr1[j] + "  ");
            }
        }
    }
}
