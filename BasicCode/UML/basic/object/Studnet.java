package basic.object;

/**
 * 
 * 	+ : public
 * 	- : private
 *  # : protected
 *  ~ : default 
 *
 */

class Student {
	private String name;
	protected int age;
	public int Student_ID;
	
	public String getNmae() {
		return name; 
	}
	
	void setName(String name) {
		this.name = name;
	}
}