package clothing;

import java.util.List;

public interface GeneralShowcase {
	public abstract int add(Hat hat);
	public abstract Hat get(Hat hat);
	public abstract int set(Hat hat);
	public abstract int remove(Hat hat);
	public abstract List<Hat> getAllHat();
}
