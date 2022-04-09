import java.util.Scanner;

class firstClass{
    public static void main(String args[]){
       // Scanner sc = new Scanner(System.in);
        //int num = sc.nextInt();
       // int num1 = sc.nextInt();
       int num =5;
       //for(int i=num;i>=1;i--){
       /*for(int i=1;i<=num;i++){
            for(int j=1;j<=num-i+1;j++){
                //if(i== 1||j==1||i==num||j==num1){
                System.out.print(j+" ");
                   }
                  // else{
                     //  System.out.print(" ");
                  // }
               // }
               //for(int j=1;j<=i;j++){
                   // System.out.print("*");
              // }
               System.out.println();
                }*/
                for(int i=1;i<=num;i++) {
                    for(int j=1;j<=num-1;j++) {
                        System.out.print(" ");
                    }
                    for(int j=1;j<=5;j++) {
                        System.out.print(i+" ");
                    }
                    System.out.println();
                }
            }
        }