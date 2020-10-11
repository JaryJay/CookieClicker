package bundle.specifics.cookieclicker;

import bundle.data.GameData;
import bundle.visuals.displayable.specifics.Cookie;
import bundle.visuals.displayable.specifics.CookieType;

public class CookieClickerGameData extends GameData {

	public CookieClickerGameData() {
		addDisplayable(new Cookie(CookieType.CHOCOLATE));
	}

}
