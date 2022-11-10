public class NumberOfArray {
    public static void main(String[] args){
        int[] a = {1, 2, 3, 4, 5};
        int count = a.length;
        System.out.println("The number of elements in the array : "+count);
        System.out.println("The array elements are : ");
        for(int i=0;i<count;i++){
            System.out.print(a[i]+" ");
        }
    }
}
