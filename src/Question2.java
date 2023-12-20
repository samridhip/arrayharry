public class Question2 {
    public static void main(String[] args) {
        int[] marks={45,55,92,836,66};
        int number=92;
        boolean isInArray=false;
        for (int element:marks){
         if (number==element){
             isInArray=true;
             break;
            }
        }
        if(isInArray){
            System.out.println("The value is present in the array");
        }
        else{
            System.out.println("The value is not present in the array");
        }
    }
}
