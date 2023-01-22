public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Phone Galaxy = new Phone("samsung", "GalaxyZ", 15.8, true);
		//ゲッターが動いているか確認
		System.out.println("あなたの携帯は" + Galaxy.getMaker() + "の" + Galaxy.getModel() + "です。");

		Phone iPhone = new Phone("apple", "iPhone14", 14.7, false);
		iPhone.call();
		iPhone.turnOn();
		iPhone.call();
		iPhone.teleSales();
	}

}
