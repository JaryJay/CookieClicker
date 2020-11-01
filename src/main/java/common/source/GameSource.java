package common.source;

import com.sun.istack.internal.Nullable;

public interface GameSource {

	@Nullable
	public default GameSource getSource() {
		return null;
	}

	public String getDescription();

}
