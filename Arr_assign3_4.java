/* 
WAP  to find the prime number from an array and return its index.
*/

import java.io.*;
import java.util.*;
class FindPrimeEle{
    public static void main(String[] args)throws IOException{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.print("Enter the size of array :- ");
        int size = Integer.parseInt(br.readLine());
        int arr[] = new int[size];

        System.out.print("Enter the Elements:- ");
        String numStr = br.readLine();
        StringTokenizer st = new StringTokenizer(numStr, " ");

        int i = 0;
        int primeEleIndex[] = new int[size];
        int index = 0;
        while(st.hasMoreTokens()){
            int fact = 0;
            int num = Integer.parseInt(st.nextToken());
            arr[i] = num;
            for(int j = 1; j <= num; j++){
                if(num % j == 0){
                    fact++;
                }

                if(fact > 2){
                    break;
                }
            }
            if(fact == 2){
                primeEleIndex[index] = i;
                index++;
            }
            
            i++;
        }
        
        System.out.print("Array of index of Prime Element :- ");
        for(int k = 0; k < primeEleIndex.length; k++){
            if(k == 0 && primeEleIndex[0] == 0){
                System.out.print(primeEleIndex[0] + " ");
            }
            else if(primeEleIndex[k] != 0){
                System.out.print(primeEleIndex[k] + " ");
            }
        }
    }
}