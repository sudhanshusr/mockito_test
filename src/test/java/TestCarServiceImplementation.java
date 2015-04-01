import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.xvitcoder.angualrspringapp.service.CarService;
import com.xvitcoder.angualrspringapp.service.CarServiceImpl;


public class TestCarServiceImplementation {
	
	private CarService carService = new CarServiceImpl();
	private String carName = "i20";
	java.util.List<String> ccarlist;

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testGetAllCars() {
		
		ccarlist = carService.getAllCars();
		assertTrue("list is empty", ccarlist.isEmpty());
		ccarlist.add("i10");
		System.out.println(ccarlist.get(0));
		assertTrue("list is not empty", !ccarlist.isEmpty());
//		//assertEquals(0.2, 0.2, 0.0);
		
	}
	@Test
	public void testAddCar() {
		

		carService.addCar(carName);
		java.util.List<String> ccarlist = carService.getAllCars();
//		System.out.println(ccarlist.get(0));
//		System.out.println(ccarlist.get(1));
		assertTrue("CAR ADDED", !ccarlist.isEmpty());
			//assertEquals(0.2, 0.2, 0.0);
		
	}

	@Test
	public void testDeleteCar() {
		
		carService.addCar("bmw");
		ccarlist = carService.getAllCars();
//		System.out.println(ccarlist.get(0));
//		System.out.println(ccarlist.get(1));
//		System.out.println(ccarlist.get(2));
//		java.util.List<String> ccarlist = carService.getAllCars();
//		System.out.println(ccarlist.get(0));
//		assertTrue("CAR ADDED", !ccarlist.isEmpty());
		carService.deleteCar("i10");
		carService.deleteCar("bmw");
		if(ccarlist.contains(carName))
		ccarlist.remove(carName);
		carService.deleteCar("bmw");
		assertTrue("CAR Removed", !ccarlist.contains("bmw"));
		//assertEquals(0.2, 0.2, 0.0);
	}

	@Test
	public void testDeleteAll() {
		
		carService.addCar("wagonr");
		//System.out.println(ccarlist.get(0));
		carService.addCar("celerio");
		//System.out.println(ccarlist.get(1));
		carService.addCar("alto");
		//System.out.println(ccarlist.get(2));
		ccarlist = carService.getAllCars();
		carService.deleteAll();
		assertTrue("All Car deleted", ccarlist.isEmpty());
	}

}
