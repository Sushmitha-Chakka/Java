
public class ArithmeticOperations {
		public static void main(String[] args) {
			int r=subtractNumbers(20,5);
			System.out.println(r);
			int r1=multiplyNumbers(4,5);
			System.out.println(r1);
			double r2=divideNumbers(20,4);
			System.out.printf("%.2f\n",r2);
			int r3=findRemainder(10,3);
			System.out.println(r3);
			
		}
		public static int subtractNumbers(int num1, int num2) {
			return num1-num2;
		}

		public static int multiplyNumbers(int num1, int num2) {
			return num1*num2;
		}

		public static double divideNumbers(int num1, int num2) {
			return num1/num2;
		}

		public static int findRemainder(int num1, int num2) {
			return num1%num2;
		}
	}

