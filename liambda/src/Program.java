
public class Program {

	public static void main(String[] args) {
		
		Switcher sw = new Switcher();
		Lamp lamp = new Lamp();
		Radio radio = new Radio();
		
		sw.addElectricytiCostomer(lamp); //event subscribe
		sw.addElectricytiCostomer(radio); //event subscribe
		sw.switcherOn();
		

	}

}
