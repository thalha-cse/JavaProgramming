public class PyramidAlphabet {
    public static void main(String[] args){
        char last='E', first='A';
        for(int i=1;i<=(last-'A'+1);i++){
            for(int j=1;j<=i;j++){
                System.out.print(first+" ");
            }
            first++;
            System.out.println();
        }

    }
}
