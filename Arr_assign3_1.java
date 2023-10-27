/* 
write a program to print count of digit in elements of array.
*/

import java.io.*;
import java.util.*;
class CountDigitInEle{
    public static void main(String[] args)throws IOException{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.print("Enter the size of array :- ");
        int size = Integer.parseInt(br.readLine());
        int arr[] = new int[size];

        System.out.print("Enter the Elements (Seperated by space) :- ");
        String numStr = br.readLine();
        StringTokenizer st = new StringTokenizer(numStr, " ");
        int i = 0;
        int countArr[] = new int[size];
        while(st.hasMoreElements()){
            int count = 0;
            int num = Integer.parseInt(st.nextToken());
            arr[i] = num;
            while(num != 0){
                count++;
                num = num / 10;
            }
            countArr[i] = count;
            i++;
        }

        System.out.print("Count of digit in Elements of Array :- ");
        for(int j = 0; j < countArr.length; j++){
            System.out.print(countArr[j] + " ");
        }
    }
}