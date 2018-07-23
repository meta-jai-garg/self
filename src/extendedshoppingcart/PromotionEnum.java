package extendedshoppingcart;

public enum PromotionEnum {

	FLAT25("FLAT25", "20/7/18", "25/7/18"), FLAT15("FLAT15", "20/7/18",
			"25/7/18"), MIN100("MIN100", "21/7/18", "26/7/18");

	private final String PROMO_CODE;
	private final String START_DATE;
	private final String END_DATE;

	private PromotionEnum(String code, String startDate, String endDate) {
		this.PROMO_CODE = code;
		this.START_DATE = startDate;
		this.END_DATE = endDate;
	}

	public String getPromoCode() {
		return this.PROMO_CODE;
	}

	public String getStartDate() {
		return this.START_DATE;
	}

	public String getEndDate() {
		return this.END_DATE;
	}

}