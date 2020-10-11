package bundle.visuals.displayable.specifics;

import bundle.visuals.displayable.Displayable;

public class Cookie implements Displayable {

	private CookieType cookieType;

	public Cookie(CookieType cookieType) {
		this.cookieType = cookieType;
	}

	public CookieType getCookieType() {
		return cookieType;
	}

	public void setCookieType(CookieType cookieType) {
		this.cookieType = cookieType;
	}

}
