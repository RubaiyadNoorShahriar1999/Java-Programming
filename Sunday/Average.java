public class Average{
    public static void main (String[] args){

    int count = 0;
    int nums[] = new int[] { 23, 1, 5, 78, 22, 4};
    for (int i = 0; i<nums.length; ++i)
        count++;
    System.out.println("The number of elements"+count);

     }


double result = 0; //average will have decimal point
    {
    for(int i=0; i < nums.length; i++){
    result += nums[i];
    }
    System.out.println(result/count);
 }
}
