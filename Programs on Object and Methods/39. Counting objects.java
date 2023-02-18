public class Counts_No_Objects {
    static int count=0;
    Counts_No_Objects(){
        count++;
    }
    public static void main(String[] args){
        Counts_No_Objects obj1 = new Counts_No_Objects();
        Counts_No_Objects obj2 = new Counts_No_Objects();
        Counts_No_Objects obj3 = new Counts_No_Objects();
        System.out.println("Number of objects created : "+count);
    }
}
