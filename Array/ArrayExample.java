package Array;
import java.util.*;
public class ArrayExample {
    public static void main(String[] args) {

        int num1[]=new int[5];
        int num2[]=new int[5];
        int num3[]=new int[5];
        int k=0;
        Scanner s=new Scanner (System.in);
        System.out.println("array1 elements:");
        for(int i=0;i<5;i++){
            num1[i]=s.nextInt();
        }
        System.out.println("array2 elements:");
        for(int i=0;i<5;i++){
            num2[i]=s.nextInt();
        }
        System.out.print("Common elements:");
        for(int i=0;i<num1.length;i++){
            for(int j=0;j<num2.length;j++){
                if(num1[i]==num2[j]){
                    num3[k]=num1[i];
                    System.out.println(num3[k]);
                    k++;

                }
            }
        }




    }
}
