package genericAndInterfaces; //https://techvidvan.com/tutorials/functional-interface-in-java/

@FunctionalInterface
interface Square {
    int calculateSquare(int x);
}
public class NumberSquare implements TextPrint {
    public static void main(String args[]) {
        int num = 111;
        Square lambda = (int x) -> (x * x);
        int answer = lambda.calculateSquare(num);
        System.out.println("Answer is " + answer);
    }

    // override default method from interface.
    TextPrint a = new TextPrint() {
        @Override
        public void printText(String text) {
            System.out.println(text + "overriden");
        }
    };
}