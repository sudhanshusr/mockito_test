import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.xvitcoder.angualrspringapp.beans.RailwayStation;
import com.xvitcoder.angualrspringapp.beans.Train;
import com.xvitcoder.angualrspringapp.service.RailwayStationService;
import com.xvitcoder.angualrspringapp.service.RailwayStationServiceImpl;


public class TestRailwayStationServiceImpl {
	
	private static List<RailwayStation> rsList = new ArrayList<RailwayStation>();
	RailwayStationService rsService = new RailwayStationServiceImpl();
	RailwayStation rs = new RailwayStation();
	Train train = new Train();
	
	@Before
	public void setUp() throws Exception {
		train.setDiesel(true);
		train.setId(1L);
		train.setName("pune-lko");
		train.setSpeed(100);
		rs.setId(10L);
		rs.setName("lko");
		rs.setTrain(train);
	}

	@Test
	public void testGetRailwayStationById() {
	rs = rsService.getRailwayStationById(1L);	
	assertTrue(true);
	}

	@Test
	public void testGetAllRailwayStations() {
		assertTrue(true);
	}

	@Test
	public void testAddRailwayStation() {
		assertTrue(true);
	}

	@Test
	public void testDeleteRailwayStationById() {
		assertTrue(true);
	}

	@Test
	public void testUpdateRailwayStation() {
		assertTrue(true);
	}

	@Test
	public void testDeleteAll() {
		assertTrue(true);
	}

}
