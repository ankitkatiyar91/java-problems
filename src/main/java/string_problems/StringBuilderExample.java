package string_problems;

public class StringBuilderExample {
	public static void main(String[] args) {
		capacityTest();
	}

	private static void capacityTest() {
		StringBuilder bld = new StringBuilder();
		showSize(bld);
		bld.append("Ankit");
		showSize(bld);

		System.out.println("Creating new instance with content");
		bld = new StringBuilder("Ankit");
		showSize(bld);
		bld.append(" Katiyar");
		showSize(bld);

		bld.append("12345678");
		showSize(bld);

		bld.append("99");
		showSize(bld);

		bld.append("9");
		showSize(bld);

		bld.append("null");
		showSize(bld);
	}

	private static void showSize(StringBuilder bld) {
		System.out.printf("Length: %d Capacity:%d (Capacity-Length):%d Content:%s %n", bld.length(), bld.capacity(),
				(bld.capacity() - bld.length()), bld.toString());
	}
}
