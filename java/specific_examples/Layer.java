package specific_examples;

import java.util.Arrays;

class Layer {
    private double[] inputs = {1.0,2.0,3.0,2.5};
    private double[][] weights = {{0.2,0.8,-0.5,1.0},{0.5,-0.91,0.26,-0.5},{-0.26,-0.27,0.17,0.87}};
    private double[] biases = {2.0,3.0,0.5};

    public double[] outputs() {
        double[] outputs = new double[biases.length];
        for(int i =0; i <biases.length; i++) {
            double neuronOutput = 0.0;
            for(int j = 0; j < inputs.length;j++) {
                neuronOutput += inputs[j]*weights[i][j];
            }
            neuronOutput += biases[i];
            outputs[i] = neuronOutput;
        }
        return outputs;
    }

    public static void main(String[] args) {
        Layer layer = new Layer();
        double[] outputs = layer.outputs();
        System.out.println(Arrays.toString(outputs));
    }
    
}