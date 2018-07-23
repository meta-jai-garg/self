package extendedshoppingcart;

import java.util.ArrayList;

public class FixedOrderPromotion implements Promotion {
	private int minPrice;
	private int fixedDiscount;
	private ArrayList<String> promotionOrder = new ArrayList<String>();

	public void setPromoCode() {
		promotionOrder.add(PromotionEnum.values()[2].toString());
	}

	@Override
	public int getMinimumPrice() {
		return this.minPrice;
	}

	@Override
	public void setMinimumPrice(int minPrice) {
		this.minPrice = minPrice;
	}

	@Override
	public int getFixedDiscount() {
		return this.fixedDiscount;
	}

	@Override
	public void setFixedDiscount(int fixedDiscount) {
		this.fixedDiscount = fixedDiscount;
	}

	@Override
	public boolean isPromotionApplicable(String promoCode) {
		// SimpleDateFormat dateFormat = new SimpleDateFormat("DD-MM-YYYY");
		// long start = 0;
		// long end = 0;
		// long current = 0;
		// try {
		// Date startDate = dateFormat.parse(PromotionEnum.START_DATE);
		// Date endDate = dateFormat.parse(PromotionEnum.END_DATE);
		// start = startDate.getTime();
		// end = endDate.getTime();
		// current = currentDate.getTime();
		// } catch (Exception e) {
		// System.out.println(e.getMessage());
		// }
		// return PromotionEnum.PROMO_CODE.equals(promoCode) && current < end
		// && current > start;
		return promoCode.contains(promoCode);
	}
}
