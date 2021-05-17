
public class Calculator {
	private double num1;
	private double num2;
	private double results;
	private char operator;
	
	public Calculator() {}

	public void setNum1(double num1) {
		this.num1 = num1;
	}

	public void setNum2(double num2) {
		this.num2 = num2;
	}

	public void setOperator(char symbol) {
		this.operator = symbol;
	}
	public void performOperation() {
		if(this.operator == '+') {
			results = (num1) + (num2);
		}else if(this.operator == '-') {
			results = (num1) - (num2);
		}
	}
	public void getResults() {
		System.out.print(results);
	}
}
