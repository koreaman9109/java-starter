class Tv {
	//변수(속성)
	String color; //색깔
	boolean power;  //전원상태
	int channel; //채널

	//메서드(기능)
	void power()      { power = !power; }
	void channelUp()  { ++channel; }
	void channelDown(){ --channel; }
}

class TvTest {
	public static void main(String[] args){
		Tv tv = new Tv();       // 인스턴스 참조 변수 tv선언 및 인스턴스 생
		tv.channel = 8;         // 인스턴스의 변수 channel의 값에 8넣음
		tv.color = "white";
		tv.power = true;
		tv.channelDown();       // 인스턴스의 메서드 channelDown()을 호출
		System.out.println("Now channel : "+tv.channel);
	}
}

class TvTest2 {
	public static void main(String[] args){
		Tv tv1 = new Tv();       // 인스턴스 참조 변수 tv선언 및 인스턴스 생
		Tv tv2 = new Tv();       // 인스턴스 참조 변수 tv선언 및 인스턴스 생

		System.out.println("t1 channel -> " + tv1.channel);
		System.out.println("t2 channel -> " + tv2.channel);

		tv1.channel = 7;         // 인스턴스의 변수 channel의 값에 7넣음
		System.out.println("tv1 channel 7로 변경");

		System.out.println("t1 channel -> " + tv1.channel);
		System.out.println("t2 channel -> " + tv2.channel);
	}
}

class TvTest3 {
	public static void main(String[] args){
		Tv tv1 = new Tv();       // 인스턴스 참조 변수 tv선언 및 인스턴스 생
		Tv tv2 = new Tv();       // 인스턴스 참조 변수 tv선언 및 인스턴스 생

		System.out.println("t1 channel -> " + tv1.channel);
		System.out.println("t2 channel -> " + tv2.channel);
		tv2 = tv1;
		tv1.channel = 7;         // 인스턴스의 변수 channel의 값에 7넣음
		System.out.println("tv1 channel 7로 변경");

		System.out.println("t1 channel -> " + tv1.channel);
		System.out.println("t2 channel -> " + tv2.channel);
	}
}

class TvTest4 {
	public static void main(String[] args){
		Tv[] tvArr = new Tv[3];

		//tv객체 생성해서 tv객체 배열에 각 요소 저장
		for (int i = 0; i < tvArr.length; i++) {
			tvArr[i] = new Tv();
			tvArr[i].channel = i+10;    //tvArr[i]의 channel에 i+10을 저장
		}

		for (int i = 0; i < tvArr.length; i++) {
			tvArr[i].channelUp();
			System.out.println("channel --> " + tvArr[i].channel);
		}
	}
}