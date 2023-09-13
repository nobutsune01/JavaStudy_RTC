package check;

public class Check {
	//フィールド変数を初期化
	private String firstName ;
	private  String lastName  ;
	
	public Check() {
		this.firstName ="Nobutsune";
		this.lastName ="Hisano";
	}
	
	public void printName() {
		System.out.println(this.firstName + "  "+ this.lastName);
	}
	
	
			
	public static void main(String[] args) {
		Check ck = new Check();
		ck.printName();
		
		Pet pt = new Pet("ポチ","java太郎");
		pt.introduce();
		
		RobotPet p = new RobotPet("PXT2", "パンク");
		p.introduce();
		
	}

}