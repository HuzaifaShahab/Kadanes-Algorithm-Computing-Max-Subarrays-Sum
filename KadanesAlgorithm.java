public class KadanesAlgorithm {
    public static void kadanesAlgorithm (int[]numbers){
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i=0 ; i< numbers.length ; i++){
                currentSum = currentSum + numbers[i] ;

            if (currentSum == -1)
                currentSum = 0 ;

            maxSum = Math.max(currentSum,maxSum) ;
        }
        System.out.println("The Largest Sub Array Sum Is : "+maxSum);
    }
    public static void main(String[] args) {
        int []numbers ={0,-1,5,7,-5,-4} ;
            kadanesAlgorithm(numbers);
    }
}
