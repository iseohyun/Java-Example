package Tarot;

enum InfoType{
	Name, Represent, Image, Love
}

enum Time{
	Past, Current, Future
}

class Cardinfo {
	final String[][] card = { 
/* 0*/	{"The Fool",          	"�ٺ�",		"����, ����",       	"���, �����"},
/* 1*/	{"The Magician",      	"������",		"â��, ����",       	"�̸���, �⸸"},
/* 2*/	{"The High Priestess",	"���� ������",	"����, �Ѹ�",       	"��Ȥ, ������"},
/* 3*/	{"The Empress",       	"����",		"ǳ��, ��",       	"����, �㿵"},
/* 4*/	{"The Emperor",       	"Ȳ��",		"å��, �μ�",       	"����, ����"},
/* 5*/	{"The Hierophant",    	"��Ȳ",		"����ħ, ������",    	"����, ����"},
/* 6*/	{"The Lovers",        	"����",		"����, ���",       	"����, ���, �ǿ�"},
/* 7*/	{"The Chariot",       	"����",		"����, �¸�",       	"����, ����, �й�"},
/* 8*/	{"Strength",          	"��",		"��, ���",        	"����, �ڸ�"},
/* 9*/	{"The Hermit",        	"������",		"Ž��, �������",    	"����, �����, Ž��"},
/*10*/	{"Wheel of Fortune",  	"õ��",		"��ȸ, �Ͻ����� ���",	"����, �ҿ�"},
/*11*/	{"Justice",	          	"����",		"����, ������",     	"�ұ���, ���, ����"},
/*12*/	{"The Hanged Man",    	"������",		"�ڱ����, �γ�",   	"���ǹ��� ���, �͸�"},
/*13*/	{"Death",             	"����",		"�ݺ�, �̺�",       	"��ȭ�� ����, ����"},
/*14*/	{"Temperance",        	"�Ǹ�",		"��ȭ, �߽�",       	"����, �Ҿ���"},
/*15*/	{"The Devil",         	"����",		"���, �ӹ�, Ÿ��",  	"�Ǽ�ȯ���κ����� ����"},
/*16*/	{"The Tower",         	"Ÿ��",		"�ı�, �ĸ�",       	"�ʿ�� �ϴ� �ı�"},
/*17*/	{"The Star",          	"��",		"���, ����",       	"ȯ��, ���"},
/*18*/	{"The Moon",          	"��",		"�Ҿ�, �ָ���, ȥ��",	"�Ҿ� �ؼ�, �����, ȥ���� ��"},
/*19*/	{"The Sun",           	"�¾�",		"���� �̷�, ����",   	"����, ����"},
/*20*/	{"Judgement",         	"����",		"��Ȱ, ����",       	"���Ҵ�, ��ȸ"},
/*21*/	{"The World",         	"����",		"�ϼ�, ����",       	"�̿ϼ�, ���߰���"}
	};
	
	final String[] image= {
		"�� �ٺ��� ������ ���·Ӱ� ���ֽ��ϴ�.",					// 0
		"�����簡 �������� ��� ������ ����Ϸ��� �մϴ�.",			// 1
		"�������� �ɾ��ְ�, �¿쿡 ������հ� ������ ���Դϴ�.",	// 2
		"��Ȳ���� �ɾ��ְ�, ������ ���� ���̺��Դϴ�.",			// 3
		"Ȳ���� ���θ��� ���¿� �ɾ��ֽ��ϴ�.",					// 4
		"��Ȳ�� �� �������� ����ħ�� �ְ� �ֽ��ϴ�.",				// 5
		"õ�� ���Ŀ��� �ƴ�� �̺갡 �ֽ��ϴ�.",					// 6
		"�������� ���ڰ� �ְ�, �� ���� ����� ����ũ���� �ֽ��ϴ�.",	// 7
		"������ �ʿ����� ���ڸ� ����̰� �ֽ��ϴ�.",				// 8
		"������ �꿡�� �������� Ȧ�� ��ҷ� ����� �̱�� �ֽ��ϴ�.",	// 9
		"�˼����� ������ ��ħ���� ����� �������� �ѷ��ΰ� �ֽ��ϴ�.", // 10
		"������ ���� ���ɰ� �˰� õĪ�� ��� �ɾ� �ֽ��ϴ�.",		// 11
		"�������� �Ųٷ� �Ŵ޷� �ֽ��ϴ�.",						// 12
		"�ذ��簡 �Ͼ� ���� Ÿ�� ���� �ִ� ������� �ٶ󺾴ϴ�.",	// 13
		"��� �Ǹ��� �ְ�, ���ʿ� ���ڿ� ���ڰ� �����ֽ��ϴ�.",		// 14
		"�¸��� õ�� ��ī���� �� ���� ���� �������� �ű�� �ֽ��ϴ�.",	// 15
		"ž�� ������ �¾� ��Ÿ�� �ְ�, ������� �߶��ϰ� �ֽ��ϴ�.",	// 16
		"��ü�� ������ ȣ������ ���� ������ ���� ��� �ֽ��ϴ�.",		// 17
		"���� ���밡 ���� ���� ������ ��� �ֽ��ϴ�.",				// 18
		"�鸶���� �ƱⰡ Ÿ�� ������, �¾��� ���⸦ �հ� �ֽ��ϴ�.",	// 19
		"õ�簡 ������ �Ҹ� ���� ��ü�� õ�縦 ���� ���� ���� ��ø� �޽��ϴ�.",	// 20
		"������ ��տ� ���� ��� �ְ�, ����� ���� ������ �θ��� �ֽ��ϴ�.", 	// 21
	};
	
	final String[][] love = {
		{	"�������� ����, ������, ����",				"�����ϴ�, �Ҽ���, �Ǽ��� �׸�ġ��" },		// 0
		{	"�ڱ�ְ� ����, �ɷ��� ����, ���� ���ϴ�",	"�������� ����, ���, �̼���" },			// 1
		{	"��������, ��н�����, ¦����ϴ�",			"������, �ҵ�������, ������" },			// 2
		{	"�����, ���ؽ� ����, ����������, ��������",	"����ģ, ������ ����ġ�� �ǽ��ϴ�" },		// 3
		{	"��������, ��������, ü��ġ���ϴ�",			"�������, �����ϴ�, �����ϴ�" },			// 4
		{	"������ ����, ��������, ����� �� ��Ű��",	"��������, ���� �� ����, ������" },		// 5
		{	"�θ�ƽ��, ��ü����, ��������",			"�����ϴ�, �ǿ�, �ٽ��� �����" },			// 6
		{	"������, �ٶ��� �ִ�, ȭ����, ���°�",		"����Ǵ�, ������, ��¿ �� ����" },		// 7
		{	"��븦 ������, �������� �ʴ�, �����ϴ�",	"�����ٴϴ�, ��ġ��, �ܰ�������" },			// 8
		{	"���ɽ�����, Ȧ�� �����ϴ�, ������ ���� �ʴ�",	"����� �ռ���, ������, ������" },			// 9
		{	"�������, �ٽ� �����ϴ�, ��ȭ�ؾ� �ϴ�",		"�쿬��, ��������, �������� �ʴ�" },		// 10
		{	"�����, ��������, ������ ġ��ġ�� �ʴ�",		"�� Ǯ���� �ʴ�, �����ϴ�, �ǽ��ϴ�" },		// 11
		{	"�������, ����, ��ü��, �ߵ��",			"�㹫��, ����� �ǹ̰� ����" },			// 12
		{	"�־��� ��Ȳ, �����, ��ȥ",				"�̺�Ʈ�� ���� ��, ��ٸ�, ����" },		// 13
		{	"Ÿ������, ���� ��Ű��, ���� �����ʴ�",		"���� �� �� ����, �Ҿ���" },				// 14
		{	"�ҷ�, �߸��� ���, �ߵ�����, ��� �� ����","���� ������ Ǯ��, �����" },			// 15
		{	"���۽����� �̺�/���� ��ȭ, ���ذ� ����",		"�ذ��ؾ߸� �ϴ� ������ ������ �� ����" },	// 16
		{	"�̻���, �޲ٴ� ���� ����, ȲȦ��, ¦���",	"�ܷο�, ������ ���ְ� �η���" },			// 17
		{	"�ٶ��� �ǿ��, �ҷ�",					"��������, ���Ծ���, �����" },			// 18
		{	"����ϴ�, ��������, ��������",			"���� ������ �ʴ�, ������ ����" },			// 19
		{	"��ȸ, ������ ����޴�, ��ٸ��� �ҽ�",		"��ȸ�ϴ�, �ٽ� ���� �� ����, ��������" },	// 20
		{	"����� ��ġ, �ϼ��� ���, ��ȥ�� �����ϴ�",	"�̼��� ���, ��� ������, �ƽ���" }		// 21
	};
	final int NumberOfCase = 22 * 21 * 20 * 8; //  2^6 * 3 * 5 * 7 * 11
	private int lang = 1; // 0 : English, 1: �ѱ���
	
	public String getName(int index) {
		if(lang == 0) {
			return card[index][0];
		}else {
			return card[index][1];
		}
	}
	
	public String getInfo(int index, Boolean dir) {
		if(dir) {
			return card[index][2];
		}else {
			return card[index][3];
		}
	}
	
	public String getImageStr(int index) {
		return image[index];
	}
	
	public String getComment(int index, Boolean dir) {
		if(dir) {
			return love[index][0];
		}else {
			return love[index][1];
		}
	}
}

class Card{
	int index;
	Boolean dir;
	
	public Card(int index, Boolean dir) {
		this.index = index;
		this.dir = dir;
	}
}

class pickUp{
	Card past;
	Card current;
	Card future;
	
	public void setPast(int index, Boolean dir) {
		this.past = new Card(index%22, dir);
	}
	
	public void setCurrent(int index, Boolean dir) {
		index %= 21;
		if(past.index <= index)
			index++;
		this.current = new Card(index, dir);
	}
	
	public void setFuture(int index, Boolean dir) {
		index %= 20;
		if(past.index <= index)
			index++;
		if(current.index <= index)
			index++;
		this.future = new Card(index, dir);
	}
	
	public Card getCard(Time time) {
		switch(time) {
		case Past:
			return past;
		case Current:
			return current;
		case Future:
			return future;
		default:
			return past;
		}
	}
}

public class Tarot extends pickUp{
	Cardinfo info = new Cardinfo();
	/**
	 * @param card1 = 0 ~ 21
	 * @param card2 = 0 ~ 20
	 * @param card3 = 0 ~ 19
	 * @param dir1 = true : front, false : tail (=dir2, dir3)
	 */
	
	Tarot(int card1, Boolean dir1, int card2, Boolean dir2, int card3, Boolean dir3) {
		setPast(card1, dir1);
		setCurrent(card2, dir2);
		setFuture(card3, dir3);
	}
		
	public String getString(Time time, InfoType type) {
		String str = "";
		int index = getCard(time).index;
		
		switch(type) {
		case Name:
			str = info.getName(index);
			break;
		case Represent:
			str = info.getInfo(index, getCard(time).dir);
			break;
		case Image:
			str = info.getImageStr(index);
			break;
		case Love:
			str = info.getComment(index, getCard(time).dir);
			break;
		}
		
		return str;
	}
}