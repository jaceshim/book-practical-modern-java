package chapter2;

public class Worker implements Male, Female {
	public static final String MALE = "male";
	public static final String FEMALE = "female";

	private String name;
	private int age;
	private String sex;

	public Worker(String name, int age, String sex) {
		this.name = name;
		this.age = age;
		this.sex = sex;
	}

	@Override
	public int getAge() {
		return age;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getInformation() {
		return String.format("Name : %s is %d years old", this.name, this.age);
	}

	@Override
	public String getSex() {
		String returnValue = null;
		if (sex != null && "male".equals(sex)) {
			returnValue = Male.super.getSex();
		} else if (sex != null && "female".equals(sex)) {
			returnValue = Female.super.getSex();
		} else {
			returnValue = "N/A";
		}
		return returnValue;
	}
}
