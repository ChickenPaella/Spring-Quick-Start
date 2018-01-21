package polymorphism;

public class SamsungTV implements TV {

	private Speaker speaker;
	private int price;

	public SamsungTV() {
		System.out.println("Samsung TV---매개변수 없는 생성");
	}
	
	public void setSpeaker(Speaker speaker) {
		this.speaker = speaker;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}

	public void volumeUp() {
		speaker.volumeUp();
	}

	public void volumeDown() {
		speaker.volumeDown();
	}

	public void powerOn() {
		System.out.println("SamsungTV--전원 켠다. 가격 : " + price + "원");
	}

	public void powerOff() {
		System.out.println("SamsungTV--전원 끈다.");
	}
}
