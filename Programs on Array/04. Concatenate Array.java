public class Concatenate_Array {
    public static void main(String[] args){
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {6, 7, 8, 9, 10};
        int concatLen = arr1.length + arr2.length;
        System.out.println("Length of Two Arrays are : "+concatLen);
        int[] concat = new int[concatLen];
        int i=0;
        for(int j:arr1){
            concat[i] = j;
            i++;
        }
        System.out.println("First Iteration : "+i);
        for(int j:arr2){
            concat[i] = j;
            i++;
        }
        System.out.println("Second Iteration : "+i);
        System.out.println("Array Elements");
        for(int element:concat){
            System.out.print(element+" ");
        }
    }
}
