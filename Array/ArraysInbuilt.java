package Array;
import java.util.*;
public class ArraysInbuilt {

    public String reverse(String str){
        int len=str.length();
        String rev="";
        for(int i=len-1;i>=0;i--){
            rev+=str.charAt(i);
        }

        return rev;
    }
    public static void main(String[] args) {

        String sentence="Hello world ";
        String words="";
        String result="";
        ArraysInbuilt obj=new ArraysInbuilt();
        for(int i=0;i<sentence.length();i++){
            if(sentence.charAt(i)!=' '){
                words+=sentence.charAt(i);
            }
            else{
                result+= obj.reverse(words);
                result+=" ";
                words="";
            }
        }
        System.out.println(result);





    }
}
