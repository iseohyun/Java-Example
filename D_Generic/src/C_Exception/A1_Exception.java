package C_Exception;

import java.io.IOException;

public class A1_Exception {
	public static void main(String[] args) {
		byte[] list = {'a', 'b', 'c'};
		try {
			System.out.write(list);
		} catch (IOException e) {
			System.out.println("�ϳ���!");
		} catch (Exception e) {
			System.out.println("���̿�!");
		}
		System.out.println("���̿�!");
	}
}
