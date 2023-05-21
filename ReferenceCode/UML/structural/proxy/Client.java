package structural.proxy;

/**
 * 출처 :
 * https://ko.wikipedia.org/wiki/%ED%94%84%EB%A1%9D%EC%8B%9C_%ED%8C%A8%ED%84%B4
 * 
 * @author Seohyun Jung
 *
 *         프록시 패턴 : 사용자가 체감하기에 로딩이 길면, 같은 소비시간이 걸리더라도 느리다고 판단 할 수 있습니다.
 *         프록시 패턴은 직접출력의 중간에 존재(proxy)하여 구동을 원활하게 할 수 있습니다.
 *
 *         코드 해설)
 *         RealImage <- Proxy <- client(main)
 */

class Client {
    public static void main(String[] args) {
        System.out.println("> 로딩 중...");
        Image image1 = new ProxyImage("HiRes_10MB_Photo1");
        Image image2 = new ProxyImage("HiRes_10MB_Photo2");
        Image image3 = new RealImage("HiRes_10MB_Photo3"); // 선언시 로딩

        System.out.println("> 시스템 준비 완료");
        image1.displayImage(); // 필요시 로딩
        image2.displayImage(); // 필요시 로딩
        image3.displayImage();

        System.out.println("> 재사용");
        image1.displayImage();
        image2.displayImage();
        image3.displayImage();
    }
}

interface Image {
    public void displayImage();
}

// on System A
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

// on System B
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