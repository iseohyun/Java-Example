package A_Generic;

class W1 {
	void view() {
		System.out.println("view1");
	}
}

class W2 extends W1 {
	void view() {
		System.out.println("view2");
	}
}

class W3 extends W2 {
	void view() {
		System.out.println("view3");
	}
}

class G<T extends W1> {
	T t;

	G(T t) {
		this.t = t;
	}

	static void show(G<?> g) {
		g.t.view();
	}

	static void showSu(G<? super W2> g) {
		g.t.view();
	}

	static void showEx(G<? extends W2> g) {
		g.t.view();
	}
}

public class E_WildCard {
	public static void main(String[] args) {
		G<W1> w1 = new G<W1>(new W1());
		G<W2> w2 = new G<W2>(new W2());
		G<W3> w3 = new G<W3>(new W3());
		G.show(w1);
		G.show(w2);
		G.show(w3);
		G.showSu(w1);
		G.showSu(w2);
//		G.showSu(w3);
//		G.showEx(w1);
		G.showEx(w2);
		G.showEx(w3);
	}
}