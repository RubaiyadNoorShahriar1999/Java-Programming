import java.util.*;


public class Rev{

    public static void main(String[] args){
        int[] a = new int[6];
        int[] b = new int[6];
        int c = a.length;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values : ");
        for(int i = 0; i < c-1; i++){
            a[i] = sc.nextInt();
        }

        sc.close();

        for( int i = 0; i < c-1; i++ )
        {
            b[i] = a[c-i-2];
        }

        System.out.println("The required series :\n");

        for(int i = 0; i < c-1; i++){
            System.out.println( b[i]);
        }
    }
}