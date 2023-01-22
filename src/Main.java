public class Main {

	public static void main(String[] args) {
		Phone Galaxy = new Phone("samsung", "GalaxyZ", 15.8, true);
		//Galaxyを試しにインスタンス化してゲッターが動いているか確認
		System.out.println("あなたの携帯は" + Galaxy.getMaker() + "の" + Galaxy.getModel() + "です。");

		//iPhoneをインスタンす化、作ったメソッドを試してみる。
		Phone iPhone = new Phone("apple", "iPhone14", 14.7, false);
		iPhone.call();
		iPhone.turnOn();
		iPhone.call();
		iPhone.teleSales();
	}

}
