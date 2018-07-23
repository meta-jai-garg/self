package extendedshoppingcart;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class CartOrder {

	List<Item> list = new ArrayList<>();
	Promotion orderPromotion = new FixedOrderPromotion();
	Promotion productPromotion = new FixedProductPromotion();
	Scanner sc = new Scanner(System.in);

	void addItem(String itemName, int itemPrice, int itemQuantity) {
		Item item = new Item(itemName, itemPrice, itemQuantity);
		list.add(item);
	}

	void removeItem(int index) {
		list.remove(index);
	}

	List<Item> getItems() {
		return list;
	}

	void updateQuantity(int index, int quantity) {
		Item item = list.get(index);
		item.setItemQuantity(quantity);
	}

	int cartBill() {
		Iterator<Item> iterator = list.iterator();
		int i = 0, totalAmount = 0;
		while (iterator.hasNext()) {
			Item item = list.get(i);
			if (item.getItemPrice() >= productPromotion.getMinimumPrice()) {
				System.out.println("Enter Promocode");
				String promoCode = sc.next();
				Date currentDate = new Date();
				if (productPromotion.isPromotionApplicable(promoCode,
						currentDate)) {
					totalAmount += (item.getItemPrice() - productPromotion
							.getFixedDiscount()) * item.getItemQuantity();
				} else {
					System.out.println("Enter Valid Promocode");
				}
			}

			iterator.next();
			i++;
		}
		return totalAmount;
	}

	void setMinimumPriceAndDiscountOnProduct(int minPrice, int discountRate)
			throws Exception {
		productPromotion.setMinimumPrice(minPrice);
		if (discountRate > 0 && discountRate < 100) {
			productPromotion.setFixedDiscount(discountRate);
		} else {
			throw new Exception("Not a valid discount rate");
		}
	}

	void setMinimumPriceAndDiscountOnOrder(int minPrice, int discountRate)
			throws Exception {
		orderPromotion.setMinimumPrice(minPrice);
		if (discountRate > 0 && discountRate < 100) {
			orderPromotion.setFixedDiscount(discountRate);
		} else {
			throw new Exception("Not a valid discount rate");
		}
	}
}