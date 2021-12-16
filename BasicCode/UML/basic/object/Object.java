package basic.object;

public abstract class Object {
	public Object getThis() {
		return this;
	}
	
	protected abstract int getHash();
}
