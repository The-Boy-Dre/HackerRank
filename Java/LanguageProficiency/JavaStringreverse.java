



//Given a string A, print Yes if it is a palindrome, print No otherwise. 

import java.util.Scanner;
public class JavaStringreverse{


    static boolean isPalindrome(String str){

        int i = 0;                    // Pointers pointing to the beginning
        int j = str.length() - 1;   // and the end of the string
        while(i < j){
            i++; // Increment first pointer and
            j--; // decrement the other

            if(str.charAt(i) != str.charAt(j)) // Checking to see if there is a mismatch 
               return false;
        }

        return true; // returns true only if the string goes through the while loop and a match is found
    }



    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        /* Enter your code here. Print output to STDOUT. */
        if(A.length() <= 50){
                if(isPalindrome(A)){
                    System.out.println("Yes");
                } else{
                    System.out.println("No");
                }
        }else{
            System.out.println("Sorry too many characters");
        }

        sc.close();
    }
}

/*
abba
Yes
*/