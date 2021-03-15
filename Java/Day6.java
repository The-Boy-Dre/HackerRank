

/*
Given a string, S , of length N that is indexed from 0 to N - 1, print its even-indexed and odd-indexed characters as 
2 space-separated strings on a single line (see the Sample below for more detail). 
*/

import java.util.Scanner;
public class Day6{

  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter the number of test cases you would like to display: ");
    int T = scan.nextInt();
    

    for(int i = 0; i < T; i++){
      System.out.print("Enter the word: ");
      String S = scan.next();

      char[] word = S.toCharArray();
     
      
      
          //int z = 0;
          for(int z = 0; z < word.length; z++){
            //z++; // The iterator is placed last to give each index enough space to be printed
            if(z % 2 == 0){
            System.out.print(word[z]);
            }
          }
      
    }

   scan.close();      
  }
}