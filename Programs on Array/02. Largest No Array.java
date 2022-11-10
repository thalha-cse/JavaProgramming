public class LargestNoArray {
    public static void main(String[] args){
        int[] array = {23, 45, 78, 87, 45};
        int largest = array[0];
        for(int num:array){
            if(largest<num){
                largest=num;
            }
        }
        System.out.println("Largest Number is : "+largest);
    }
}
