package test;


public class Test02 {
	public static void main(String[] args) {
		// TODO : ���⿡ �ڵ带 �Է��ϼ���.
	}
}

/////////////////////////// import
//
//�����ϱ� 1-1 : Dog Ŭ������ �����ϰ�, Animal�� ��ӹ޽��ϴ�.
//			-> Animal�� Answer��Ű���� ���ԵǾ� �ֽ��ϴ�.
//
//�����ϱ� 1-2 : ���� ������ �Ǿ��ִ� ���� ���� ���������� Ŀ���� �ű��
//ctrl + alt�� ���� �ڵ����� import Answer.Animal�� �߰��ǵ��� �մϴ�.
//
//�����ϱ� 1-3 : �����ڴ� String name�� String voice�� ���ڷ� �����ϴ�.
//super(), setVoice() �޼ҵ带 �̿��մϴ�.
//
//�����ϱ� 1-4 : Dog�ν��Ͻ� bulldog�� �����մϴ�. new Dog("�ҵ�", "����");
//
//�����ϱ� 1-5 : bulldog.crying(); �� �����մϴ�.


/////////////////////////// protected vs default ���ϱ�
//
//�����ϱ� 2-1 : setVoice() �޼ҵ��� Protected�� �����ϰ� �����غ��ϴ�.


/////////////////////////// Override
//
//�����ϱ� 3-1 : crying() �޼ҵ��� Override�մϴ�.
//-> �ҵ��� �����ϰ� ¢���ϴ�.


/////////////////////////// interface �����ϱ�
//
//�����ϱ� 4-1 : Animal�� ��� ���� Birds Ŭ������ �����մϴ�.
//
//�����ϱ� 4-2 : interface flyable�� �����մϴ�.
//default�� �޼��� 2���� �����մϴ�.
//-> flying(...)�� "...�� ���ư��ϴ�."�� ����մϴ�.
//-> landing(...)�� "...�� �����մϴ�."�� ����մϴ�.
//
//�����ϱ� 4-3 : Birds�� flyable�� implements �մϴ�.
//
//�����ϱ� 4-4 : BirdsŬ������ chicken�� �����մϴ�. �Ʒ��� ���� main���� ȣ���մϴ�.
//chicken.flying(chicken.getName());
//chicken.landing(chicken.getName());

/////////////////////////// default vs. abstract
//
//�����ϱ� 5-1 : interface runalbe�� �����մϴ�.
//
//�����ϱ� 5-2 : running(...)�� "...�� �޸��ϴ�." �� ����մϴ�.
//
//�����ϱ� 5-3 : stop�� abstract�� ����ϴ�.
//
//�����ϱ� 5-4 : Dog�� runable�� ����մϴ�.
//Bird���� runalbe�� ���(�߰�)�մϴ�.
//
//�����ϱ� 5-5 : �߻�޼ҵ�� ������ �ؾ��մϴ�.
//������ ���� ���� �����ʿ��� ctrl+space�� ���� �ڵ带 �߰��մϴ�.
//
//�����ϱ� 5-6 : �߰��� �Լ��� main���� ȣ���մϴ�.
//chicken.running(chicken.getName());
//chicken.stop();

/////////////////////////// static
//
//�����ϱ� 6-1 : runable�� sprint �޼��带 static���·� �߰��մϴ�.
//-> System.out.println(name + "�� �������ָ� �մϴ�.");
//
//�����ϱ� 6-2 : main���� sprint()�� �̿��Ͽ� 
//-> "ǥ���� �������ָ� �մϴ�."�� ����غ��ϴ�.



