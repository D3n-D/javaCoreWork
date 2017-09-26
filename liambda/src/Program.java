
public class Program {

	public static void main(String[] args) {
		
		Switcher sw = new Switcher();
		Lamp lamp = new Lamp();
		Radio radio = new Radio();
		
		sw.addElectricytiCostomer(lamp); //event subscribe
		sw.addElectricytiCostomer(radio); //event subscribe
		
		//anonymous class example
		sw.addElectricytiCostomer(new ElectricytiCostomer(){

			@Override
			public void electricytiOn() {
				System.out.println("fire !!!!");
			}
			
		});
		
		sw.switcherOn();
		

	}

}
