package Chapter3;

public class OverloadedMethods {

	public static void main(String[] args) {
		System.out.println(personsName("Ansh", "Tandon"));
		System.out.println(personsName("Ansh", "Homer", "Tandon"));
		System.out.println(personsName("Ansh", "Homer", "Tandon", "Jr."));

	}

	public static String personsName(String firstname, String lastname) {
		int x = firstname.length();
		int y = lastname.length();
		String a = firstname.substring(0, x);
		String b = lastname.substring(0, y);
		String c = b + ", " + a;

		return c;
	}

	public static String personsName(String firstname, String middlename, String lastname) {

		System.out.print(personsName(firstname, lastname));
		int x = middlename.length();
		String y = middlename.substring(0, x);
		String c = " " + y;

		return c;

	}

	public static String personsName(String firstname, String middlename, String lastname, String sirname) {

		System.out.print(personsName(firstname, middlename, lastname));
		int x = sirname.length();
		String y = sirname.substring(0, x);
		String z = " " + y;

		return z;

	}

}
