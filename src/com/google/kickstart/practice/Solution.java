package com.google.kickstart.practice;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    // Complete the substrCount function below.
private static final int MAX_CHAR = 26; 

static long substrCount(int n, String s) {
        List<String> decompositionInProgress = new ArrayList<String>();
       return  decomposeString(s,0,decompositionInProgress);
}

  
  
    private static long decomposeString(String str, int buildPointer, List<String> decompositionInProgress) {
        if(buildPointer != str.length() ) {
        	 
    	for(int i = buildPointer ; i < str.length(); i++) {
        System.out.println("buildPointer : "+buildPointer+" i : "+i);
        String plaindromeSnippet  = str.substring(buildPointer,(i+1));
System.out.println("plaindromeSnippet :  "+ plaindromeSnippet+" "+ buildPointer +" "+(i+1));
            if(!plaindromeSnippet.isEmpty() && isPalindrome(plaindromeSnippet)) {
                decompositionInProgress.add(plaindromeSnippet);
                }

            }
            
            decomposeString(str,buildPointer+1,decompositionInProgress);

        
        System.out.println("decompositionInProgress : "+decompositionInProgress+" ");
        }
        return decompositionInProgress.size();
    }


    private static boolean isPalindrome(String str){
                int j = str.length()-1;
                int sameCounter = 0 ;
                int k = 0;
                for (int i = 0 ; i < str.length()/2 ; i++){
                    if(str.charAt(i) != str.charAt(j) ){
                    System.out.println("flag :  "+ false);

                        return false;
                    }
                    if(str.charAt(k) != str.charAt(k+1)){
                        sameCounter++;
                        k++;
                    }
                    j--;
                }
                System.out.println("sameCounter : "+sameCounter+"  "+str);
                if(sameCounter >= 2){
                System.out.println("flag :  "+ false);
                    return false;
                }
            System.out.println("flag :  "+ true);
                return true;
       
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
      //  BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        long result = substrCount(n, s);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

        scanner.close();
    }
}
