public class Question7 {
    public static void main(String[] args) {
        int[]arr={100,2,7,44};
        int max=0;
        for(int e:arr){
            if(e>max){
                max=e;
            }
        }
        System.out.println(max);
    }
}
