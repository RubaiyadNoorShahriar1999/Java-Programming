public class Puppy{

    int puppyAge[] = new int[]{5,7,8};
    String puppyName[] = new String[3];

    public Puppy(String name1, String name2, String name3){
       
             System.out.println("The name of the Puppy1 is : " + name1);
             System.out.println("The name of the Puppy2 is : " + name2);
             System.out.println("The name of the Puppy3 is : " + name3);
        
    }

    public  void  setName(String name1, String name2, String name3){
            int i= 0 ;
             puppyName[i] = name1 ;
             puppyName[i+1] = name2 ;
             puppyName[i+2] = name3 ;

    }

    public int[] getAge(){
        //System.out.println("The Age of the puppy is : " + puppyAge );
        return puppyAge;
    }

    public static void main(String[] args){


        Puppy myPuppy = new Puppy("Spike","Tom","Jerry");
        //int mp[] = new int myPuppy.getName;
        int mp[] = myPuppy.getAge();
        myPuppy.setName("Spike","Tom","Jerry");

        // myPuppy.getAge();
        //System.out.println("The Name of the Puppy is :"  + myPuppy.setName() );
        for(int i=0 ; i< mp.length ; i++){
            System.out.println("The Age of the Puppy is "  + (i+1) + " : "+ mp[i]);
        }

    }
}
