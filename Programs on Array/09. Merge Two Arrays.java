/*Syntax : arraycopy(Object source_arr, int sourcePos, Object dest_arr, int destPos, int len)
Parameters : 
source_arr : array to be copied from
sourcePos : starting position in source array from where to copy
dest_arr : array to be copied in
destPos : starting position in destination array, where to copy in
len : total no. of components to be copied.*/
import java.util.Arrays;
public class MergeArray {
    public static void main(String[] args){
        int[] a = {10, 20, 30, 40, 50};
        int[] b = {60, 70, 80, 90, 100};
        int a1 = a.length;
        int b1 = b.length;
        int c1 = a1 + b1;
        int[] c = new int[c1];
        System.arraycopy(a, 0, c, 0, a1);
        System.arraycopy(b, 0, c, a1, b1);
        System.out.println(Arrays.toString(c));
    }
}
