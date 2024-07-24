package Array;

public class _2darray {
    public static void main(String[] args) {
        char matrix[][]=new char[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                    if((i+j)%2==0){
                     System.out.print('X'+" ");}
                    else{

                    System.out.print('0'+" ");
                    }

            }
            System.out.println();
        }

    }
}
