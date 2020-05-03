package specific_examples;
import java.util.Random;
import java.util.Arrays;
public class DenseLayer {
    private double[][] weights;
    private double[] bias;

    public DenseLayer(int numOfInputs, int numOfNeurons) {
        Random r = new Random(0);
        weights = new double[numOfInputs][numOfNeurons];
        for(int i = 0; i < weights.length;i++) {
            for(int j = 0; j < weights[0].length; j++) {
                weights[i][j] = r.nextDouble();
            }
        }
        bias = new double[numOfNeurons];
    }
    private static double[][] dotProduct(double[][] input1, double[][] input2) {
        double[][] product = new double[input1.length][input2[0].length];
        for(int i = 0; i < input1.length; i++) {
            for (int j = 0; j < input2[0].length; j++) {
                for (int k = 0; k < input2.length; k++) {
                    product[i][j] += input1[i][k] * input2[k][j];
                }
            }
        }
        return product;
    }
    public double[][] forward(double[][] input){
        return dotProduct(input, weights);
    }


    
}