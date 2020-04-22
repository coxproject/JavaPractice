
public class SenteceReverse {
	private int size;
	private String[] stackArray;
	private int top = 0;

	public SenteceReverse(int arraySize) {
		size = arraySize;
		stackArray = new String[size];
		top = -1;
	}

	public void push(String a) {
		String[] arr = a.split(" ");
		for (int i = 0; i < arr.length; i++) {
			if (top == size - 1) {
				System.out.println("Stack is full");
			} else {
				top++;
				stackArray[top] = arr[i];

			}
		}
	}

	public String pop() {
		String data;
		top--;
		data = stackArray[top];
		return data;

	}

	public void display() {
		for (int i = 0; i <= top; i++) {
			System.out.println(stackArray[i] + " ");
		}
		System.out.println();
	}
}
