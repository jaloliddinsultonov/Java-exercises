public class SumOfNumbers {
    public static void main(String[] args){
        System.out.println("This program is gonna find sum of even numbers from 1 to 100");
        int sum = 0;
        for(int i = 1; i<=100; i++){
            if(i % 2 != 0){
                continue;
            } else{
                sum += i;
            }
        }
        System.out.println("Sum = " + sum);
    }
}
