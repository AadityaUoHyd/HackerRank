/*
*
* Write a java program for Capitalisation where convert your first letter of each word from lower case to upper case letter.
* Input : aaditya bachchu chatterjee
* Output : Aaditya Bachchu Chatterjee
*
*/

public class Capitalisation{

     public static void main(String []args){
         
         String givenStr = "aaditya bachchu chatterjee";
         
         char charArr[] = givenStr.toCharArray();
         int size = charArr.length;
         
         charArr[0] = (char) (charArr[0] - 32);
         int i =1;
         
         while(i != size){
             if(charArr[i]==' '){
                charArr[i+1] = (char) (charArr[i+1] - 32);
             }
             i++;
         }
         
        System.out.println(givenStr);
        System.out.println(charArr);
     }
}
