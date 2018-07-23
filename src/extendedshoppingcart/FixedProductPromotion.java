package extendedshoppingcart;

import java.util.ArrayList;

public class FixedProductPromotion implements Promotion {
	private int minPrice;
	private int fixedDiscount;
	private ArrayList<String> promotionProduct = new ArrayList<String>();

	public void setPromoCode() {
		promotionProduct.add(PromotionEnum.values()[0].toString());
		promotionProduct.add(PromotionEnum.values()[1].toString());
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
		// }
		return promotionProduct.contains(promoCode);
	}
}
