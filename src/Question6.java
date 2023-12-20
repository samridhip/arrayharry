public class Question6 {
    public static void main(String[] args) {
        int[] numbers={2,5,7,8,9,5};
        int l=numbers.length;
        int n= Math.floorDiv(numbers.length,2);
        for(int i=0;i<n;i++){
             int temp =numbers[i];
            numbers[i]=numbers[l-1-i];
            numbers[l-1-i]=temp;
        }
        for(int element:numbers){
            System.out.println(element);
        }
    }
}
