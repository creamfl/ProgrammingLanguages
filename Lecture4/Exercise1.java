
public class exercise1 {

	public static void main(String[] args) {
		String word = "Computer";
		System.out.println("Og: " + word);
		System.out.println("In small letters: " + word.toLowerCase());
		System.out.println("In capital letters: " + word.toUpperCase());
		System.out.println("length : " + word.length());
		System.out.println("First letter: " + word.charAt(0));
		System.out.println("Last letter: " + word.charAt(word.length()- 1));
		System.out.println("Middle letter: " + word.charAt(word.length() / 2));
		boolean com = word.startsWith("Com");
		System.out.println("The word starts with " + "Com: " + com);
		boolean ion = word.endsWith("ion");
		System.out.println("The word ends with " + "ion: " + ion);
		String firstTwo = "Co";
		System.out.println("The first two letters are: " + firstTwo );
		System.out.println("Swapping 'e' with 'o': " + word.replace('e', 'o'));
		System.out.println("Swapping 'Comp' with 'Calcula' : " + word.replaceAll("Comp", "Calcula"));
	}

}
