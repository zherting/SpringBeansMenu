package AsianFood.beans;

import javax.persistence.Embeddable;

@Embeddable
public class Details {
	private String allergyalert;
	private int spicylevel;

	public Details() {
		super();
	}

	public Details(String allergyalert) {
		super();
		this.allergyalert = allergyalert;
	}

	public Details(String allergyalert, int spicylevel) {
		super();
		this.allergyalert = allergyalert;
		this.spicylevel = spicylevel;
	}

	public String getAllergyalert() {
		return allergyalert;
	}

	public void setAllergyalert(String allergyalert) {
		this.allergyalert = allergyalert;
	}

	public int getSpicylevel() {
		return spicylevel;
	}

	public void setSpicylevel(int spicylevel) {
		this.spicylevel = spicylevel;
	}

	@Override
	public String toString() {
		return "Details [allergyAlert=" + allergyalert + ", spicyLevel=" + spicylevel + "]";
	}
}