package Tarot;

enum InfoType{
  Name, Represent, Image, Love
}

enum Time{
  Past, Current, Future
}

class Cardinfo {
  final String[][] card = { 
/* 0*/	{"The Fool",          	"바보",		"모험, 무지",       	"경솔, 어리석음"},
/* 1*/	{"The Magician",      	"마법사",		"창조, 수완",       	"겁많음, 기만"},
/* 2*/	{"The High Priestess",	"고위 여사제",	"지식, 총명",       	"잔혹, 무례함"},
/* 3*/	{"The Empress",       	"여제",		"풍양, 모성",       	"과잉, 허영"},
/* 4*/	{"The Emperor",       	"황제",		"책임, 부성",       	"오만, 존대"},
/* 5*/	{"The Hierophant",    	"교황",		"가르침, 관대함",    	"협량, 나태"},
/* 6*/	{"The Lovers",        	"연인",		"연애, 쾌락",       	"질투, 배신, 실연"},
/* 7*/	{"The Chariot",       	"전차",		"전진, 승리",       	"폭주, 좌절, 패배"},
/* 8*/	{"Strength",          	"힘",		"힘, 용기",        	"본성, 자만"},
/* 9*/	{"The Hermit",        	"은둔자",		"탐색, 사려깊음",    	"음습, 폐쇄적, 탐욕"},
/*10*/	{"Wheel of Fortune",  	"천사",		"기회, 일시적인 행운",	"오산, 불운"},
/*11*/	{"Justice",	          	"정의",		"균형, 정당함",     	"불균형, 편견, 부정"},
/*12*/	{"The Hanged Man",    	"사형수",		"자기희생, 인내",   	"무의미한 희생, 맹목"},
/*13*/	{"Death",             	"죽음",		"격변, 이별",       	"변화의 유보, 고착"},
/*14*/	{"Temperance",        	"악마",		"조화, 견실",       	"낭비, 불안정"},
/*15*/	{"The Devil",         	"절제",		"사심, 속박, 타락",  	"악순환으로부터의 각성"},
/*16*/	{"The Tower",         	"타워",		"파괴, 파멸",       	"필요로 하는 파괴"},
/*17*/	{"The Star",          	"별",		"희망, 동경",       	"환멸, 비애"},
/*18*/	{"The Moon",          	"달",		"불안, 애매함, 혼돈",	"불안 해소, 명료함, 혼돈의 끝"},
/*19*/	{"The Sun",           	"태양",		"밝은 미래, 만족",   	"연기, 실패"},
/*20*/	{"Judgement",         	"심판",		"부활, 개선",       	"재기불능, 후회"},
/*21*/	{"The World",         	"세계",		"완성, 완전",       	"미완성, 어중간함"}
  };
  
  final String[] image= {
    "한 바보가 절벽에 위태롭게 서있습니다.",					// 0
    "마법사가 마법봉읃 들어 마법을 사용하려고 합니다.",			// 1
    "여사제가 앉아있고, 좌우에 검은기둥과 흰기둥이 보입니다.",	// 2
    "여황제가 앉아있고, 주위에 벼와 숲이보입니다.",			// 3
    "황제가 돌로만든 왕좌에 앉아있습니다.",					// 4
    "교황이 수 사제에게 가르침을 주고 있습니다.",				// 5
    "천사 라파엘과 아담과 이브가 있습니다.",					// 6
    "전차위에 남자가 있고, 양 옆에 흑백의 스핑크스가 있습니다.",	// 7
    "여성이 초원에서 사자를 길들이고 있습니다.",				// 8
    "눈덮인 산에서 노인으로 홀로 등불로 어둠을 이기고 있습니다.",	// 9
    "알수없는 문자의 나침반을 상상의 동물들이 둘러싸고 있습니다.", // 10
    "정의의 여신 디케가 검과 천칭을 들고 앉아 있습니다.",		// 11
    "사형수가 거꾸로 매달려 있습니다.",						// 12
    "해골기사가 하얀 말을 타고 빌고 있는 사람들을 바라봅니다.",	// 13
    "가운데 악마가 있고, 양쪽에 남자와 여자가 묶여있습니다.",		// 14
    "승리의 천사 미카엘이 두 컵의 물을 양쪽으로 옮기고 있습니다.",	// 15
    "탑이 번개에 맞아 불타고 있고, 사람들이 추락하고 있습니다.",	// 16
    "나체의 여성이 호숫가에 안자 물병을 물을 쏟고 있습니다.",		// 17
    "개와 늑대가 달을 보고 으르렁 대고 있습니다.",				// 18
    "백마위에 아기가 타고 있으며, 태양이 열기를 뿜고 있습니다.",	// 19
    "천사가 나팔을 불면 관속 시체가 천사를 향해 손을 뻗어 계시를 받습니다.",	// 20
    "여성이 양손에 봉을 들고 있고, 월계수 잎이 주위를 두르고 있습니다.", 	// 21
  };
  
  final String[][] love = {
    {	"집착하지 않은, 순수한, 밝은",				"집착하는, 불순한, 실수로 그르치는" },		// 0
    {	"자기애가 강한, 능력이 좋은, 말을 잘하는",	"자존감이 낮은, 어눌한, 미숙한" },			// 1
    {	"정신적인, 비밀스러운, 짝사랑하는",			"광적인, 불도저같은, 무모한" },			// 2
    {	"편안한, 이해심 많은, 여성스러운, 엄마같은",	"지나친, 남들을 지나치게 의식하는" },		// 3
    {	"남성적인, 유희적인, 체면치레하는",			"헌신적인, 존경하는, 존대하는" },			// 4
    {	"믿음이 가는, 정신적인, 약속을 잘 지키는",	"변덕적인, 믿을 수 없는, 거짓의" },		// 5
    {	"로멘틱한, 육체적인, 낭만적인",			"질투하는, 실연, 근심이 생기는" },			// 6
    {	"터프한, 바람기 있는, 화끈한, 정력가",		"종결되는, 마지막, 어쩔 수 없는" },		// 7
    {	"상대를 사로잡는, 포기하지 않는, 리드하는",	"끌려다니는, 지치는, 외강내유의" },			// 8
    {	"조심스러운, 홀로 생각하는, 연락이 닿지 않는",	"욕심이 앞서는, 음탕한, 음란한" },			// 9
    {	"운명적인, 다시 시작하는, 변화해야 하는",		"우연의, 지속적인, 움직이지 않는" },		// 10
    {	"깐깐한, 고지식한, 감정에 치우치지 않는",		"잘 풀리지 않는, 오해하는, 의심하는" },		// 11
    {	"희생적인, 참는, 정체된, 견디는",			"허무한, 노력이 의미가 없는" },			// 12
    {	"최악의 상황, 헤어짐, 재혼",				"이벤트가 연기 됨, 기다림, 권태" },		// 13
    {	"타협적인, 선을 지키는, 도를 넘지않는",		"앞을 알 수 없는, 불안한" },				// 14
    {	"불륜, 잘못된 사랑, 중독적인, 벗어날 수 없는","얽힌 문제가 풀림, 벗어나는" },			// 15
    {	"갑작스러운 이별/관계 변화, 방해가 생긴",		"해결해야만 하는 문제에 도망갈 수 없는" },	// 16
    {	"이상형, 꿈꾸는 듯한 연애, 황홀한, 짝사랑",	"외로운, 남들의 연애가 부러운" },			// 17
    {	"바람을 피우는, 불륜",					"안정적인, 변함없는, 고요한" },			// 18
    {	"배려하는, 열정적인, 긍정적인",			"앞이 보이지 않는, 막막한 상태" },			// 19
    {	"재회, 아픔을 보상받는, 기다리는 소식",		"후회하는, 다시 만날 수 없는, 잊혀지는" },	// 20
    {	"사랑의 일치, 완성된 사랑, 결혼에 골인하는",	"미숙한 사랑, 어딘가 허전한, 아쉬운" }		// 21
  };
  final int NumberOfCase = 22 * 21 * 20 * 8; //  2^6 * 3 * 5 * 7 * 11
  private int lang = 1; // 0 : English, 1: 한국어
  
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