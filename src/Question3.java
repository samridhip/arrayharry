public class Question3 {
    public static void main(String[] args) {
        int[] numbers={44,82,93,68,50};
        int sum=0;
        for(int element:numbers){
            sum=sum+element;
        }
        System.out.println("The average is :"+sum/ numbers.length);
    }
}
