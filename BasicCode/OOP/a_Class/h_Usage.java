package a_Class;

class Handler {
	Stored getData(Data c) {
		return new Stored(c.data);
	}
}

class Stored {
	String str;

	Stored(String str) {
		this.str = str;
	}
}

class Data {
	String data;

	Data(String str2) {
		this.data = str2;
	}
}

public class h_Usage {
	public static void main(String[] args) {
		Handler h = new Handler();
		System.out.println(h.getData(new Data("String")).str);
	}
}