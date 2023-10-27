/* 
WAP to revrese each elemnt in an array.
*/

import java.io.*;
import java.util.*;
class ReverseEle{
    public static void main(String[] args)throws IOException{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.print("enter the size of Array :- ");
        int size = Integer.parseInt(br.readLine());
        int arr[] = new int[size];

        System.out.print("Enter the Elements (Seperated by space) :- ");
        String numStr = br.readLine();
        StringTokenizer st = new StringTokenizer(numStr, " ");
        int i = 0;
        int reverseArr[] = new int[size];
        while(st.hasMoreTokens()){
            int num = Integer.parseInt(st.nextToken());
            arr[i] = num;
            int rev = 0;
            while(num != 0){
                int rem = num % 10;
                rev = rev * 10 + rem;
                num = num / 10;
            }
            reverseArr[i] = rev;
            i++;
        }

        System.out.print("Reverese element Array = ");
        for(int j = 0; j < reverseArr.length; j++){
            System.out.print(reverseArr[j] + " ");
        }
    }
}