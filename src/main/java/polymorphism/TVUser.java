package polymorphism;

public class TVUser {
	public static void main(String[] args) {
		BeanFactory bf = new BeanFactory();
		TV tv = (TV) bf.getBean(args[0]);
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();
	}
}
