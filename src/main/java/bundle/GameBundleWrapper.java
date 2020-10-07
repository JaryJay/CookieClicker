package bundle;

/**
 * A container for a game bundle to make switching bundles easier.
 * 
 * Bundle wrappers make swapping bundles easier, because without a wrapper,
 * everything would have to have a reference to the old bundle, making it so
 * that if you wanted to swap the bundle, you'd have to individually make the
 * swap at every instance of its references. Aside from being cumbersome,
 * synchronization errors can occur because swapping is not instantaneous.
 * 
 * Wrappers allow instantaneous swappping to be achieved because everyone has a
 * reference to the same bundle wrapper.
 * 
 * @author Jay
 *
 */
public class GameBundleWrapper {

	private GameBundle bundle;

	/**
	 * A constructor that takes in the initial bundle. Should not be null.
	 * 
	 * @param bundle not null
	 */
	public GameBundleWrapper(GameBundle bundle) {
		this.bundle = bundle;
	}

	/**
	 * Swaps current bundle for the provided bundle. Should not be null.
	 * 
	 * @param bundle not null
	 */
	public void transition(GameBundle bundle) {
		this.bundle = bundle;
	}

	public GameBundle getBundle() {
		return bundle;
	}
	
}
