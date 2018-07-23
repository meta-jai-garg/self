package extendedshoppingcart;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Order {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CartOrder cart = new CartOrder();
		Promotion orderPromotion = new FixedOrderPromotion();
		// try {
		// System.out
		// .println("Enter minimum price and discount rate for promotion");
		// cart.setMinimumPriceAndDiscountOnProduct(sc.nextInt(), sc.nextInt());
		// System.out
		// .println("Enter minimum price and discount for order discount");
		// cart.setMinimumPriceAndDiscountOnOrder(sc.nextInt(), sc.nextInt());
		// } catch (Exception e) {
		// System.out.println(e.getMessage());
		// }
		// try {
		// do {
		// System.out.println("********** Shopping Cart **********");
		// System.out.println("1. Add Item in cart");
		// System.out.println("2. Remove Item from cart");
		// System.out.println("3. Update Item in cart");
		// System.out.println("4. See items of cart");
		// System.out.println("5. Get Bill of cart");
		// System.out.println("6. EXIT");
		// System.out.println("\n Enter your choice");
		// int choice = sc.nextInt();
		// switch (choice) {
		// case 1: {
		// System.out
		// .println("Please enter item's Name, Price, Quantity");
		// String itemName = sc.next();
		// int itemPrice = sc.nextInt();
		// int itemQuantity = sc.nextInt();
		// cart.addItem(itemName, itemPrice, itemQuantity);
		// break;
		// }
		// case 2: {
		// System.out.println("Enter item ID to remove");
		// cart.removeItem(sc.nextInt());
		// break;
		// }
		// case 3: {
		// System.out.println("Enter item ID to update quantity");
		// int index = sc.nextInt();
		// System.out.println("Please specify quantity");
		// int quantity = sc.nextInt();
		// cart.updateQuantity(index, quantity);
		// break;
		// }
		// case 4: {
		// List<Item> items = cart.getItems();
		// Iterator<Item> iterator = items.iterator();
		// System.out.format("\n%-10s %-15s %10s %10s \n", "ItemID",
		// "ItemName", "Price", "Quantity");
		// int i = 0;
		// while (iterator.hasNext()) {
		// System.out
		// .format("%-10d %-15s %10d  %9d\n", i, items
		// .get(i).getItemName(), items.get(i)
		// .getItemPrice(), items.get(i)
		// .getItemQuantity());
		// i++;
		// iterator.next();
		// }
		// break;
		// }
		// case 5: {
		// List<Item> items = cart.getItems();
		// Iterator<Item> iterator = items.iterator();
		// System.out.format("\n%-10s %-15s %10s %10s\n", "ProductID",
		// "ProductName", "Price", "Quantity");
		// int i = 0;
		// while (iterator.hasNext()) {
		// System.out
		// .format("%-10d %-15s %10d  %9d\n", i, items
		// .get(i).getItemName(), items.get(i)
		// .getItemPrice(), items.get(i)
		// .getItemQuantity());
		// i++;
		// iterator.next();
		// }
		// int totalCartAmount = cart.cartBill();
		// String code = "";
		// int finalAmount = 0;
		// Date currentDate = new Date();
		// if (totalCartAmount >= orderPromotion.getMinimumPrice()) {
		// System.out
		// .println("Enter promo code for Order discount");
		// code = sc.next();
		// if (orderPromotion.isPromotionApplicable(code,
		// currentDate)) {
		// finalAmount = totalCartAmount
		// - orderPromotion.getFixedDiscount();
		// System.out.println("Total Amount in Cart: "
		// + finalAmount);
		// } else {
		// System.out
		// .println("Enter valid promo code for total order");
		// }
		// } else {
		// finalAmount = totalCartAmount;
		// System.out
		// .println("Total Amount in cart" + finalAmount);
		// }
		//
		// break;
		// }
		// case 6: {
		// System.exit(0);
		// }
		// default:
		// System.out.println("Enter Valid Option");
		// }
		// } while (true);
		// } catch (Exception e) {
		// System.out.println(e.getMessage());
		// }
	}
}