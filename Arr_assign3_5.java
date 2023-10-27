/* 
WAP TO FIND PERFECT NUMBER IN AN ARRAY AND RETUREN THEIR INDEX.
*/

import java.io.*;
import java.util.*;
class PerfectNumber{
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
        int PerfectNumberIndex[] = new int[size];
        int index = 0;
        while(st.hasMoreTokens()){
            int num = Integer.parseInt(st.nextToken());
            arr[i] = num;
            int sum = 0;
            for(int j = 1; j < num; j++){
                if(num % j == 0){
                    sum += j;
                }
            }
            if(sum == num){
                PerfectNumberIndex[index] = i;
                index++;
            }
            i++;
        }

        System.out.print("Array of Preferct number index :- ");
        for(int k = 0; k < PerfectNumberIndex.length; k++){
            if(k == 0 && PerfectNumberIndex[0] == 0){
                System.out.print(PerfectNumberIndex[0] + " ");
            }
            else if(PerfectNumberIndex[k] != 0){
                System.out.print(PerfectNumberIndex[k] + " ");
            }
        }
    }
}
