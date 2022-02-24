package a_Generic;

class W1 {
	void print(String str) {
		System.out.println(str + " > " + this);
	}
}

class W2 extends W1 {
}

class W3 extends W2 {
}

class G<T extends W1> {
	T t;

	G(T t) {
		this.t = t;
	}

	static void print(G<?> g) {
		g.t.print("Wild");
	}

	static void printSu(G<? super W2> g) {
		g.t.print("Super");
	}

	static void printEx(G<? extends W2> g) {
		g.t.print("Extends");
	}
}

public class D_WildCard {
	public static void main(String[] args) {
		G<W1> w1 = new G<W1>(new W1());
		G<W2> w2 = new G<W2>(new W2());
		G<W3> w3 = new G<W3>(new W3());
		G.print(w1);
		G.print(w2);
		G.print(w3);
		G.printSu(w1);
		G.printSu(w2);
//		G.showSu(w3);
//		G.showEx(w1);
		G.printEx(w2);
		G.printEx(w3);
	}
}