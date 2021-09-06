package Interpreter;

import java.util.ArrayList;
import java.util.List;

/**
 * 	출처 : https://ko.wikipedia.org/wiki/%EC%9D%B8%ED%84%B0%ED%94%84%EB%A6%AC%ED%84%B0_%ED%8C%A8%ED%84%B4
 * 
 * @author Seohyun Jung
 *
 *		인터프리터 패턴 : 같은 형식으로 된 개체라고 할 지라도 종단으로 지정된 개체의 역할과 종단이 아닌 개체의 동작이 달라야 합니다.
 *			비종단 개체는 당연히 자식 개체를 가지고 있어야 합니다.
 *
 *		코드해설)
 *			인터프리터_패턴(출처)의 클레스 다이어그램을 코드화 하였습니다.(아래)
 *
 *				┌ Node 10
 *				↓			┌---- Node 30
 *			Node1 <----- Node2 <- Node 40
 *				↑			└---- Node 50
 *				└ Node 20
 *
 */

public class Client {
	public static void main(String[] args) {
		Node ntExpr1 = new Nonterminal(1);
		Node ntExpr2 = new Nonterminal(2);
		Node tExpr1 = new Terminal(10);
		Node tExpr2 = new Terminal(20);
		Node tExpr3 = new Terminal(30);
		Node tExpr4 = new Terminal(40);
		Node tExpr5 = new Terminal(50);
		
		ntExpr1.addN(ntExpr2);
		ntExpr1.addN(tExpr1);
		ntExpr1.addN(tExpr2);
		ntExpr2.addN(tExpr3);
		ntExpr2.addN(tExpr4);
		ntExpr2.addN(tExpr5);
		
		ntExpr1.ShowAll();
    }
}

interface Abstract {
    public void ShowAll();
    public void addN(Node N);
}

abstract class Node implements Abstract {
	int ID;
	List<Node> N = new ArrayList<>();
	public void addN(Node N) {
		this.N.add(N);
	}
	public void ShowAll() {
		System.out.println(ID);
		for(Node n : N)
			n.ShowAll();
	}
}

class Terminal extends Node{
	Terminal(int i) { ID = i; }

	@Override
	public void ShowAll() {
		System.out.println("종단점 : " + (ID+1));
	}
}

class Nonterminal extends Node{
	Nonterminal(int i) { ID = i; }

	@Override
	public void ShowAll() {
		System.out.print("비종단점 : ");
		super.ShowAll();
	}
}
