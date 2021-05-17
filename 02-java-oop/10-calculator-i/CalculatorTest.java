public class CalculatorTest {
    public static void main(String[] args) {
		Calculator test = new Calculator();
		test.setNum1(10.5);
		test.setNum2(5.2);
		test.setOperator('+');
		test.performOperation();
		test.getResults();
	}
}

