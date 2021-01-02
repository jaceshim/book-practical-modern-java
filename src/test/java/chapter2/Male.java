package chapter2;

public interface Male extends Human {
	public static final String SEX = "male";

	@Override
	default String getSex() {
		return Male.SEX;
	}
}
