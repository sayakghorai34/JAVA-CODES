package p1;

public class Student implements Comparable {
	private int id;
	private String name;
	private int age;
	@Override
	public String toString() {
		return "[id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	public Student(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public int compareTo(Object o) {
		Student s=(Student)o;
		return name.compareTo(s.name);
	}
}
