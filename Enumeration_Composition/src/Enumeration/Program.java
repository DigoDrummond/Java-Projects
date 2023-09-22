package Enumeration;

import java.util.Date;

public class Program {

	public static void main(String[] args) {
		
		Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);
		
		System.out.println(order);
		
		//String em enum
		OrderStatus os1 = OrderStatus.DELIVERED;//instancia os1 com valor delivered
		OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
		
		System.out.println(os1);
		System.out.println(os2);
	}

}
