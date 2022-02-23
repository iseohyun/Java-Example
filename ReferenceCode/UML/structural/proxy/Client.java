package structural.proxy;

/**
 *	��ó : https://ko.wikipedia.org/wiki/%ED%94%84%EB%A1%9D%EC%8B%9C_%ED%8C%A8%ED%84%B4
 * 
 * @author Seohyun Jung
 *
 *		���Ͻ� ���� : ����ڰ� ü���ϱ⿡ �ε��� ���, ���� �Һ�ð��� �ɸ����� �����ٰ� �Ǵ� �� �� �ֽ��ϴ�.
 *			���Ͻ� ������ ��������� �߰��� ����(proxy)�Ͽ� ������ ��Ȱ�ϰ� �� �� �ֽ��ϴ�.
 *
 *		�ڵ� �ؼ�)
 *			RealImage <- Proxy <- client(main)
 */

class Client {
	public static void main(String[] args) {
		System.out.println("> �ε� ��...");
		Image image1 = new ProxyImage("HiRes_10MB_Photo1");
		Image image2 = new ProxyImage("HiRes_10MB_Photo2");
		Image image3 = new RealImage("HiRes_10MB_Photo3"); // ����� �ε�

		System.out.println("> �ý��� �غ� �Ϸ�");
		image1.displayImage(); // �ʿ�� �ε�
		image2.displayImage(); // �ʿ�� �ε�
		image3.displayImage();

		System.out.println("> ����");
		image1.displayImage();
		image2.displayImage();
		image3.displayImage();
	}
}

interface Image {
	public void displayImage();
}

//on System A
class RealImage implements Image {
	private String filename;

	public RealImage(String filename) {
		this.filename = filename;
		loadImageFromDisk();
	}

	private void loadImageFromDisk() {
		System.out.println("Loading	 " + filename);
	}

	@Override
	public void displayImage() {
		System.out.println("Displaying " + filename);
	}
}

//on System B
class ProxyImage implements Image {
	private String filename;
	private Image image;

	public ProxyImage(String filename) {
		this.filename = filename;
	}

	@Override
	public void displayImage() {
		if (image == null)
			image = new RealImage(filename);

		image.displayImage();
	}
}