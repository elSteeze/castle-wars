
public class Resource {
	String resource;
	
	public Resource(String resource){
		this.resource = resource;
	}

	public String getResource() {
		return resource;
	}

	public void setResource(String resource) {
		this.resource = resource;
	}

	@Override
	public String toString() {
		return "Resource [resource=" + resource + "]";
	}
	
	
}
