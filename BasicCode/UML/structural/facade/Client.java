package structural.facade;

/**
 *	Ï∂úÏ≤ò : https://ko.wikipedia.org/wiki/%ED%8D%BC%EC%82%AC%EB%93%9C_%ED%8C%A8%ED%84%B4
 * @author Seohyun Jung
 *
 *	?çº?Ç¨?ìú ?å®?Ñ¥ (?çº?Ç¨?ìú : Í±¥Î¨º?ùò ?ïûÎ©?, ?îÑ?ûë?ä§?ñ¥)
 *		Î≥µÏû°?ïú Íµ¨Ï°∞Î•? Í∞ÑÎã®?ïòÍ≤? ?Ç¨?ö©?ï† ?àò ?ûà?èÑÎ°? ?ù∏?Ñ∞?éò?ù¥?ä§Î•? ?ã®?àú?ôî?ïú Íµ¨Ï°∞
 *
 */

public class Client {
	public static void main(String[] args) {
		Computer facade = new Computer();
		System.out.println("Boot Start.");
		facade.startComputer();
	}
}

class Computer {
	private static final long BOOT_ADDRESS = 0x40000000;
	private long BOOT_SECTOR = 0x41000000;
	private int SECTOR_SIZE = 0x800000;

	public void startComputer() {
		CPU cpu = new CPU();
		Memory memory = new Memory();
		HardDrive hardDrive = new HardDrive();
		cpu.freeze();
		memory.load(BOOT_ADDRESS, hardDrive.read(BOOT_SECTOR, SECTOR_SIZE));
		cpu.jump(BOOT_ADDRESS);
		cpu.execute();
		System.out.println("Boot Finished.");
	}
}

class CPU {
	public void freeze() {
	}

	public void jump(long position) {
	}

	public void execute() {
	}
}

class Memory {
	public void load(long position, byte[] data) {
	}
}

class HardDrive {
	public byte[] read(long lba, int size) {
		byte[] bytes = new byte[size];
		return bytes;
	}
}