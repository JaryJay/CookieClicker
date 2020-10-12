package interfacetest;

public interface MyInterface {
	
	public default String getName() {
		return this.getClass().getName();
	}

}
