import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;

import org.junit.Assert;
import org.junit.Test;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;

public class CacheTest {

	private ConcurrentHashMap<String, String> mapCache = new ConcurrentHashMap<>();
	private LoadingCache<String, String> guavaCache = CacheBuilder.newBuilder().build(new CacheLoader<String, String>() {
		@Override
		public String load(String key) {
			return key;
		}
	});

	@Test
	public void map_cachePutAndGetIfPresent() {
		mapCache.put("foo", "bar");
		String baz = mapCache.get("baz");
		Assert.assertEquals(mapCache.size(), 1);
		Assert.assertEquals(mapCache.get("foo"), "bar");
		Assert.assertEquals(mapCache.get("baz"), null);
	}

	@Test
	public void guava_cachePutAndGetIfPresent() {
		guavaCache.put("foo", "bar");
		String baz = guavaCache.getIfPresent("baz");

		Assert.assertEquals(guavaCache.size(), 1);
		Assert.assertEquals(guavaCache.getIfPresent("foo"), "bar");
		Assert.assertEquals(guavaCache.getIfPresent("baz"), null);
		
	}

}
