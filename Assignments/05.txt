import java.util.*;

public class Voc{

    public static void main( String[] args ){

        String result ;

        Scanner sc = new Scanner ( System.in );
        System.out.println("Enter the alphabet : ");
        result = sc.nextLine();

       switch(result){

           case "a" :
           case "A" :
                System.out.println(result + " is a Vowel");
                break;
            case "e" :
            case "E" :
                System.out.println(result + " is a Vowel");
                break;
            case "i" :
            case "I" :
                System.out.println(result + "is a Vowel");
                break;
            case "o" :
            case "O" :
                 System.out.println(result + " is a Vowel");
                 break;
             case "u":
             case "U":
                System.out.println(result + " is a Vowel");
                break;
           default :
                System.out.println(result + " is a Consonant");
       }
    }
}