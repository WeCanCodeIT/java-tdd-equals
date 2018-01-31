package equality;

public class City {

	private String name;

	public City(String name, String state) {
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj == null) {
			return false;
		}
		return ((City) obj).name.equals(name);
	}

}
