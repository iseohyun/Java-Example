package Interpreter;

import java.util.ArrayList;
import java.util.List;

/**
 * 	��ó : https://ko.wikipedia.org/wiki/%EC%9D%B8%ED%84%B0%ED%94%84%EB%A6%AC%ED%84%B0_%ED%8C%A8%ED%84%B4
 * 
 * @author Seohyun Jung
 *
 *		���������� ���� : ���� �������� �� ��ü��� �� ���� �������� ������ ��ü�� ���Ұ� ������ �ƴ� ��ü�� ������ �޶�� �մϴ�.
 *			������ ��ü�� �翬�� �ڽ� ��ü�� ������ �־�� �մϴ�.
 *
 *		�ڵ��ؼ�)
 *			����������_����(��ó)�� Ŭ���� ���̾�׷��� �ڵ�ȭ �Ͽ����ϴ�.(�Ʒ�)
 *
 *				�� Node 10
 *				��			��---- Node 30
 *			Node1 <----- Node2 <- Node 40
 *				��			��---- Node 50
 *				�� Node 20
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
		System.out.println("������ : " + (ID+1));
	}
}

class Nonterminal extends Node{
	Nonterminal(int i) { ID = i; }

	@Override
	public void ShowAll() {
		System.out.print("�������� : ");
		super.ShowAll();
	}
}
