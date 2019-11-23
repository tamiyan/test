
public class test {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		person kimura = new person();
		kimura.name = "木村次郎";
		kimura.age = 18;
		kimura.phoneNumber = "○○○";
		kimura.address ="○○○";
		
		
		
		System.out.println(kimura.name);
		System.out.println(kimura.age);
		System.out.println(kimura.phoneNumber);
		System.out.println(kimura.address);
		kimura.talk();
		kimura.walk();
		kimura.run();
		
		
		person suzuki = new person();
		suzuki.name ="鈴木花子";
		suzuki.age = 16;
		suzuki.phoneNumber="xxx";
		suzuki.address ="xxx";
		
		System.out.println(suzuki.name);
		System.out.println(suzuki.age);
		System.out.println(suzuki.phoneNumber);
		System.out.println(suzuki.address);
		suzuki.talk();
		suzuki.walk();
		suzuki.run();
		
		
		person tamiya = new person();
		tamiya.name ="田宮";
		tamiya.age = 24;
		tamiya.phoneNumber="iiii";
		tamiya.address = "iiii";
		
		System.out.println(tamiya.name);
		System.out.println(tamiya.age);
		System.out.println(tamiya.phoneNumber);
		System.out.println(tamiya.address);
		tamiya.talk();
		tamiya.walk();
		tamiya.run();
		
		
		Robot aibo = new Robot();
		aibo.name = "aibo";
		aibo.talk();
		aibo.walk();
		aibo.run();
		
		
		Robot asimo = new Robot();
		asimo.name = "asimo";
		asimo.talk();
		asimo.walk();
		asimo.run();
		
		
		Robot pepper = new Robot();
		pepper.name = "pepper";
		pepper.talk();
		pepper.walk();
		pepper.run();

	}

}
