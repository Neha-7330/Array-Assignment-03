/* 
Write a program to print the second max element in the array
*/

import java.io.*;
import java.util.*;
class SecondMaxEle{
    public static void main(String[] args)throws IOException{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.print("Enter the size of array :- ");
        int size = Integer.parseInt(br.readLine());

        System.out.print("Enter the Element (Seperated by space) :- ");
        String numStr = br.readLine();
        StringTokenizer st = new StringTokenizer(numStr, " ");

        int arr[] = new int[size];
        int i = 0;
        while(st.hasMoreTokens()){
            int num = Integer.parseInt(st.nextToken());
            arr[i] = num;
            i++;
        }

        Arrays.sort(arr);

        System.out.println("The Second maximun element in an array is : " + arr[arr.length - 2]);
        System.out.println("The Second minimum element in an array is : " + arr[1]);
    }
}