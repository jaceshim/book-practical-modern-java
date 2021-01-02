package chapter2;

public interface Female extends Human {
	public static final String SEX = "female";

	@Override
	default String getSex() {
		return Female.SEX;
	}
}
