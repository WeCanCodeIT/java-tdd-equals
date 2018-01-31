package equality;

public class City {

	public City(String name, String state) {
	}

	@Override
	public boolean equals(Object obj) {
		if(obj == null) {
			return false;
		}
		return true;
	}

}
