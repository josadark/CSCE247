public class IceCreamShopDriver {
	public static void main(String[] args) {
		IceCream vanillaIce = new VanillaIceCream();
		vanillaIce = new Sprinkles(vanillaIce);
		vanillaIce = new Cherry(vanillaIce);
		
		IceCream chocIce = new ChocolateIceCream();
		chocIce = new ChocolateChips(chocIce);
		
		System.out.println("******** Ice Cream Shop *******");
		
		System.out.println("I would like to order, 2 Ice Creams:");
		System.out.println(vanillaIce);
		System.out.println(chocIce);
		
		
	}
}
