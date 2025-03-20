package week03;

public class ProductPrice {

	public static void main(String[] args) {
		int milk = 4500;
		int carrot = 1000;
		int snack = 1500;
		double saledMilk = milk - (milk * 0.1);
		double saledCarrot = carrot - (carrot * 0.1);
		double saledSnack = snack - (snack * 0.1);
		
		System.out.println("할인 전 상품 가격 : " + (milk + carrot * 3 + snack * 2) + "원");
		System.out.println("할인 금액 : " + ((milk + carrot * 3 + snack * 2) - (saledMilk + saledCarrot * 3 + saledSnack * 2)) + "원");
		System.out.println("최종 결제 금액 : " + (saledMilk + saledCarrot * 3 + saledSnack * 2) + "원");
	}

}
