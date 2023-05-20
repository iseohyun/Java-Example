// 만약 ANSI형식으로 저장하지 않는다면 다음과 같은 에러가 발생합니다.
// : unmappable character (0xEB) for encoding x-windows-949

public class Main_EUCKR {
    public static void main(String[] args) {
        int i = 0;
        for(String arg : args){
            System.out.println(++i + ": " + arg);
        }
    }
}