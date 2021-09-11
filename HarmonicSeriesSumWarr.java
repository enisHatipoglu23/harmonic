public class HarmonicSeriesSumWarr {
    static double[] arr(double[] arr){
        double sum = 0;
        double harAv = 0;
        for (int i = 0; i < arr.length; i++){
            sum = sum + (1/arr[i]);
            harAv = (arr.length) / (sum);
        }
        System.out.println(harAv);
        return arr;
    }
}
