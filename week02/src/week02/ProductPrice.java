package week02;

public class ProductPrice {
	public static void main(String[] args) {
		int productPrice = 5700;
		int count = 7;
		
		System.out.printf("구매 수량 : %d개\n", count);
		System.out.printf("총 구매 금액 : %d원\n", productPrice);
		System.out.printf("상품 단가 : %.1f원", (double)productPrice / count);
	}
}
