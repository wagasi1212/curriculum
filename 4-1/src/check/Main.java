package check;

import constants.Constants;

public class Main {

	private static String firstName = "Numazaki";
	private static String lastName = "Takeru";

	public static void main(String[] args) {
		/*課題①
		【Main.java】にてフィールド変数firstNameとlastNameを宣言し、
		firstName →　自分の名字　lastName →　自分の名前で初期化しなさい。
		なお、変数のアクセス修飾子は「private」とする。
		
		課題②
		【Main.java】にてfirstNameとlastNameを引数で受け取って、
		連結して表示させるメソッド「printName」を作成しなさい。
		作成した関数のアクセス修飾子は「private」とする。*/
		/*	課題③
		【Main.java】にてPetクラスとRobotPetクラスをインスタンス化して、下記の完成イメージを出力させなさい。
		*/
		printName(firstName, lastName);
		Pet pet = new Pet(Constants.CHECK_CLASS_JAVA, Constants.CHECK_CLASS_HOGE);
		RobotPet robotPet = new RobotPet(Constants.CHECK_CLASS_R2D2, Constants.CHECK_CLASS_LUKE);
		
		pet.introduce();
		robotPet.introduce();
		
		
		
		
		
	}

	private static void printName(String firstName, String lastName) {

		System.out.println(firstName + lastName);

	}

}
