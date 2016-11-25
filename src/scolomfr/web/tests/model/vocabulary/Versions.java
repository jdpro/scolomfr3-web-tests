package scolomfr.web.tests.model.vocabulary;

public enum Versions {
	V3_0("V3_0"), V3_1("V3_1");

	private static Versions current = Versions.V3_1;
	private String value;

	private Versions(String value) {
		this.value = value;
	}

	public static Versions getCurrentVersion() {
		return current;
	}

	public static void setCurrentVersion(Versions newCurrent) {
		current = newCurrent;
	}

	@Override
	public String toString() {
		return value;
	}

}