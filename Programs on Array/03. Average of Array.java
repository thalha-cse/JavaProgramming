public class Average_Array {
    public static void main(String[] args){
        double[] array = {23.23, 90.98, 67.987, 45,87, 23,765};
        double sum=0;
        for(double num:array){
            sum = sum+num;
        }
        int totalElement = array.length;
        double average = sum/totalElement;
        System.out.println("Average of Array is : "+average);
    }
}
