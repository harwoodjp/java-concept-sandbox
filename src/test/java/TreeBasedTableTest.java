import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import org.junit.Test;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;

public class TreeBasedTableTest {
	
	private static final String ADDRESS = "Address";
	private static final String NEIGHBORHOOD = "Neighborhood";
	private static final String PRICE = "Price";
	private static final String EMPTY = "";
	
	@Test
	public void table__prints() {
		Table<String, String, Object> apartmentHuntTable = HashBasedTable.create();
		apartmentHuntTable.put("apt1", ADDRESS, "2317 N Rockwell");
		apartmentHuntTable.put("apt1", NEIGHBORHOOD, "Logan Square");
		apartmentHuntTable.put("apt1", PRICE, 1400);
		apartmentHuntTable.put("apt2", ADDRESS, "2613 W Augusta Blvd");
		apartmentHuntTable.put("apt2", NEIGHBORHOOD, "Ukrainian Village");
		apartmentHuntTable.put("apt2", PRICE, 1450);
		apartmentHuntTable.put("apt3", ADDRESS, EMPTY);
		apartmentHuntTable.put("apt3", NEIGHBORHOOD, "Bucktown");
		apartmentHuntTable.put("apt3", PRICE, 1350);
		
		Map<String, Map<String, Object>> rowMap = apartmentHuntTable.rowMap();
//		System.out.println(rowMap + "\n");

		Map<String, Map<String, Object>> colMap = apartmentHuntTable.columnMap();
//		System.out.println(colMap + "\n");

//		System.out.println(apartmentHuntTable.column(ADDRESS) + "\n");

		Table displayTable = apartmentHuntTable;
		displayTable.row("apt3").values().removeIf(v -> v.equals(EMPTY));
		System.out.println(displayTable.row("apt3"));
	}
}
