package equality;

public class City {

	private String name;
	private String state;

	public City(String name, String state) {
		this.name = name;
		this.state = state;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj == null) {
			return false;
		}
		if(!(obj instanceof City)) {
			return false;
		}
		City other = (City) obj;
		return other.name.equals(name) && other.state.equals(state);
	}

}
