/* 
WAP to find a composite number from an array and return its index.
*/

import java.io.*;
import java.util.*;
class CompositeArrayIndex{
    public static void main(String[] args)throws IOException{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.print("Enter the Size of element :- ");
        int size = Integer.parseInt(br.readLine());
        int arr[] = new int[size];

        System.out.print("Enter the Element (Seperated by space) :- ");
        String numStr = br.readLine();
        StringTokenizer st = new StringTokenizer(numStr, " ");
        int i = 0;
        int compoIndexArr[] = new int[size];
        int index = 0;
        while(st.hasMoreTokens()){
            int num = Integer.parseInt(st.nextToken());
            arr[i] = num;
            int fact = 0;
            for(int j = 1; j <= num; j++){
                if(num % j == 0){
                    fact++;
                }
                if(fact > 2){
                    compoIndexArr[index] = i;
                    index++;
                    break;
                }
            }
            i++;
        }

        System.out.print("Array of Index of Composite Element :- ");
        for(int j = 0; j < compoIndexArr.length; j++){
            if(j == 0 && compoIndexArr[0] == 0){
                System.out.print(compoIndexArr[0] + " ");
            }
            else if(compoIndexArr[j] != 0){
                System.out.print(compoIndexArr[j] + " ");
            }
        }
    }
}
