package Method;

public class Calculator {

    public int add(int input1, int input2) {
        int output = input1 + input2;
        return output;


    }

    public int sum(int input1, int input2) {

        int output = input1 - input2;
        return output;
    }

    public int mul(int input1, int input2)
    {
        int output = input1 * input2;
        return output;

    }

    public int div(int input1, int input2){
        int output = input1/input2;
        return output;
    }

    public int mod(int input1, int input2) {
        int output = input1 % input2;
        return output;

    }

    public void addReturn(int input1, int input2){
        int output = input1 + input2;
        System.out.println(output);
    }
}
