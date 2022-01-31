package VarArgs;

public class RemoteCalculator implements Calculator {
		public int add(int...arr) {
			int sum=0;
			for(int a:arr) {
				sum=sum+a;
			}
			return sum;
			
		}

	
		public int subtract(int... a) {
			int sub=0;
			for(int a:arr) {
				sub=sub-a;
			}
			return sub;
		}

	
		public int multiply(int... a) {
			int mul=0;
			int[] arr;
			for(int a:arr) {
				mul=mul*a;
			}
			return mul;
		}
	}


