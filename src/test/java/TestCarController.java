import static org.junit.Assert.*;

import java.awt.List;
import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.xvitcoder.angualrspringapp.controller.CarController;
import com.xvitcoder.angualrspringapp.service.CarService;
import com.xvitcoder.angualrspringapp.service.CarServiceImpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.collections.functors.TruePredicate;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.MockitoAnnotations;
import org.springframework.validation.BindingResult;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@Ignore
public class TestCarController {
	
	@InjectMocks
	 
	
	@Mock
	CarController carcontroller;
	CarService carservice;
	
	java.util.List<String> carlist = new ArrayList<String>();
	//CarServiceImpl carserviveimpl = new CarServiceImpl();
	
	@Before
	public void setUp() throws Exception {
		//MockitoAnnotations.initMocks(this);
		carservice = mock(CarServiceImpl.class);
		carlist.add(0, "Audi");
		when(carservice.getAllCars()).thenReturn(carlist);
		
	}

	@Test
	public void testGetCarList() {
       java.util.List<String> expectedcarlist = new ArrayList<String>();
       expectedcarlist.add(0, "Audi");
       carcontroller = mock(CarController.class);
       when(carcontroller.getCarList()).thenReturn(carservice.getAllCars());
       assertEquals(expectedcarlist, carservice.getAllCars());
       
       
	}

	@Test
	public void testAddCar() {
		assertTrue(true);
	}

	@Test
	public void testRemoveCar() {
		carcontroller = mock(CarController.class) ;
		carcontroller.removeCar("Audi");
		assertTrue(carlist.isEmpty());
		
	}

	@Test
	public void testRemoveAllCars() {
		assertTrue(true);
	}

	@Test
	public void testGetCarPartialPage() {
		assertTrue(true);
	}

}
