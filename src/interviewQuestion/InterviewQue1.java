package interviewQuestion;

public class InterviewQue1 {

	public static void main(String[] args) {
		String input = "globale";

		for (int i = input.length(); i > 0; i--) {
			System.out.println(input.substring(0, i));
		}
	}
}
