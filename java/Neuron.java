public class Neuron {
    private double[] inputs = {1,2,3,2.5};
    private double[] weights = {0.2,0.8,-0.5,1.0};
    private double bias = 2.0;

    public double output() {
        double output = 0;
        for(int i =0; i < inputs.length;i++) {
            output += inputs[i]*weights[i];
        }
        return output + bias;
    }
    public static void main(String[] args) {
        Neuron neuron = new Neuron();
        System.out.println(neuron.output());
    }
}