import java.util.Scanner;

public class Phone {
	private String maker;
	private String model;
	private double size;
	private boolean running;

	//Phoneのコンストラクタ↓
	Phone(String maker, String model, double size, boolean running) {
		this.maker = maker;
		this.model = model;
		this.size = size;
		this.running = running;
	}

	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

	public boolean isRunning() {
		return running;
	}

	public void setRunning(boolean running) {
		this.running = running;
	}

	//ユーザに任意の電話番号を入力させ「〜に電話かけている」と表示させる。インスタンスの真偽値runningが偽なら、
	//電源が入っていないと表示させる。
	void call() {
		if (running == true) {
			Scanner scanner = new Scanner(System.in);
			System.out.println(model + "を操作して発信したい番号をハイフンなしで入力してください。");
			String PhoneNumber = scanner.nextLine();
			System.out.println(PhoneNumber + "に電話をかけています。");
		} else {
			System.out.println(model + "の電源が入っていません。\nturnOnメソッドを使ってください。");
		}
	}

	//携帯の電源がオフ（runningがfalse）のとき、このメソッドでオンにする。
	void turnOn() {
		if (running == false) {
			running = true;
			System.out.println(model + "の電源をつけました。");
		} else {
			System.out.println("既に" + model + "の電源はついています");
		}
	}

	//ユーザに目標の架電数をかかせ、その数分ループさせる。全て失敗になっているが、確率でアポ取れるようにしたかった、、。
	void teleSales() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("あなたは今日何件の顧客先に架電しますか。\n今日の目標を入力してください");
		int salesAttempt = scanner.nextInt();
		for (int i = 0; i < salesAttempt; i++) {
			System.out.println("あなたはお客様に冷たくあしらわれました。");
		}
	}
}
