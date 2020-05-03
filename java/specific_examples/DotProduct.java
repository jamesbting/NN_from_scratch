package specific_examples;

import java.util.Arrays;

public class DotProduct {
    private double[] inputs = {1.0,2.0,3.0,2.5};

    private double[][] weights = {{0.2,0.8,-0.5,1.0},
                                  {0.5,-0.91,0.26,-0.5},
                                  {-0.26,-0.27,0.17,0.87}};

    private double[] biases = {2.0,3.0,0.5};

    public double[] dotProduct() {
        double[] outputs = new double[weights.length];
        for(int i = 0; i < weights.length; i++) {
            double output = 0;
            for (int j = 0; j<inputs.length; j++) {
                output += weights[i][j] * inputs[j];
            }
            outputs[i] = output;
        }
        return outputs;
    }

    public double[] addBiases(double[] input) {
        assert biases.length != input.length;

        double[] output = new double[biases.length];
        return output;
    }

    public static void main(String args[]) {
        DotProduct layer = new DotProduct();
        System.out.println(Arrays.toString(layer.dotProduct()));
    }
} 