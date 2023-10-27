/* 
WAP TO FIND A PAILNDROME NUMBER FROM AND ARRAY AND RETURN ITS INDEX.
*/

import java.io.*;
import java.util.*;
class PalindromeIndex{
    public static void main(String[] args)throws IOException{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.print("Enter the size of array :- ");
        int size = Integer.parseInt(br.readLine());

        System.out.print("Enter the Elements (Seperated by space) :- ");
        String numStr = br.readLine();

        StringTokenizer st = new StringTokenizer(numStr, " ");
        int arr[] = new int[size];
        int palindromeIndex[] = new int[size];
        int index = 0;
        int i = 0;
        while(st.hasMoreTokens()){
            int num = Integer.parseInt(st.nextToken());
            arr[i] = num;
            int rev = 0;
            while(num != 0){
                int rem = num % 10;
                rev = rev * 10 + rem;
                num = num / 10;
            }
            if(rev == arr[i]){
                palindromeIndex[index] = i;
                index++;
            }
            i++;
        }


        System.out.println("Palindrome Numbers are found at index :- ");
        for(int j = 0; j < palindromeIndex.length; j++){
            if(j == 0 && palindromeIndex[0] == 0){
                System.out.print(palindromeIndex[0] + "  ");
            }
            else if(palindromeIndex[j] != 0){
                System.out.print(palindromeIndex[j] + "  ");
            }
        }
    }
}