public class Question8 {
    public static void main(String[] args) {
        boolean isSorted = true;
        int[] arr = {4, 87, 55, 80, 199};
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i]>arr[i+1]){
                isSorted=false;
                break;
            }
        }
        if(isSorted){
            System.out.println("The array is sorted");
        }
        else{System.out.println("Not sorted");}
    }
}
