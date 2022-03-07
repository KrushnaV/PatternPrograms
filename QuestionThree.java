
public class QuestionThree{

	public static void main(String[] args) {
		System.out.println("Arguments passed at runtime. "+	args.length);

		for(int i = 0; i < args.length; i++) {
			System.out.println("Argument " + i + " = "
							+ args[i]);
		}
	}
}

