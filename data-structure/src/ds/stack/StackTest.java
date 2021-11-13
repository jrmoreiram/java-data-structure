package ds.stack;

import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		Stacks stack = new Stacks();

		System.out.println("stackEmpty:" + stack.empty());

		stack.push("Mauricio");
		System.out.println("push('Mauricio'):" + stack);

		stack.push("Guilherme");
		System.out.println("push('Guilherme'):" + stack);

		System.out.println("stackEmpty:" + stack.empty());

		String r1 = stack.pop();
		System.out.println("pop:" + r1);

		String r2 = stack.pop();
		System.out.println("pop:" + r2);

		System.out.println("stack:" + stack);

		System.out.println("stackEmpty:" + stack.empty());

		// Implementação java para pilhas.
		Stack<String> javaStack = new Stack<String>();
		javaStack.push("Mauricio");
		javaStack.push("Marcelo");

		System.out.println("javaStack:" + stack);

		javaStack.pop();
		System.out.println("javaPop:" + stack);

		String name = javaStack.peek();
		System.out.println("javaPeek:" + name);
	}
}
