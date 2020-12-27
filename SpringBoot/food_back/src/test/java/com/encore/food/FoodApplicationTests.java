package com.encore.food;

import com.encore.food.domain.StoreDTO;
import com.encore.food.domain.UserDTO;
import com.encore.food.service.StoreService;
import com.encore.food.service.UserService;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.hamcrest.Matchers.is;


@SpringBootTest
@Transactional
class FoodApplicationTests {

	@Autowired
	UserService userService;
	@Autowired
	StoreService storeService;

	@Test
	void 회원가입() throws Exception {
		UserDTO userDTO = new UserDTO();
		userDTO.setId("1111");
		userDTO.setPassword("1111");
		userDTO.setName("1111");
		userDTO.setEmail("1111");
		userDTO.setPhone("1111");

		userService.registerUser(userDTO);

		Assert.assertThat(userDTO.getId(), is("1111"));
	}

	@Test
	void 가게등록() throws Exception {
		StoreDTO storeDTO = new StoreDTO();
		storeDTO.setStore_id(1);
		storeDTO.setStore_img("1");
		storeDTO.setStore_name("1");
		storeDTO.setStore_address("1");
		storeDTO.setStore_phone("1");
		storeDTO.setCategory("1");
		storeDTO.setParking("1");
		storeDTO.setOpentime("1");
		storeDTO.setClosetime("1");
		storeDTO.setDayoff("1");
		storeDTO.setId("1");
		storeDTO.setScore_avg(1);
		storeDTO.setMenu1("1");
		storeDTO.setPrice1("1");
		storeDTO.setMenu2("1");
		storeDTO.setPrice2("1");
		storeDTO.setMenu3("1");
		storeDTO.setPrice3("1");

		storeService.registerStore(storeDTO);
	}

	@Test
	void 모든_가게보기() throws Exception {
		StoreDTO storeDTO = new StoreDTO();
		storeDTO.setStore_id(1);
		storeDTO.setStore_img("1");
		storeDTO.setStore_name("1");
		storeDTO.setStore_address("1");
		storeDTO.setStore_phone("1");
		storeDTO.setCategory("1");
		storeDTO.setParking("1");
		storeDTO.setOpentime("1");
		storeDTO.setClosetime("1");
		storeDTO.setDayoff("1");
		storeDTO.setId("1");
		storeDTO.setScore_avg(1);
		storeDTO.setMenu1("1");
		storeDTO.setPrice1("1");
		storeDTO.setMenu2("1");
		storeDTO.setPrice2("1");
		storeDTO.setMenu3("1");
		storeDTO.setPrice3("1");
		storeService.registerStore(storeDTO);

		StoreDTO storeDTO1 = new StoreDTO();
		storeDTO1.setStore_id(2);
		storeDTO1.setStore_img("1");
		storeDTO1.setStore_name("1");
		storeDTO1.setStore_address("1");
		storeDTO1.setStore_phone("1");
		storeDTO1.setCategory("1");
		storeDTO1.setParking("1");
		storeDTO1.setOpentime("1");
		storeDTO1.setClosetime("1");
		storeDTO1.setDayoff("1");
		storeDTO1.setId("1");
		storeDTO1.setScore_avg(1);
		storeDTO1.setMenu1("1");
		storeDTO1.setPrice1("1");
		storeDTO1.setMenu2("1");
		storeDTO1.setPrice2("1");
		storeDTO1.setMenu3("1");
		storeDTO1.setPrice3("1");
		storeService.registerStore(storeDTO1);

		List<StoreDTO> result = storeService.findAllStores();

		Assert.assertThat(result.size(), is(2));
	}

	@Test
	void 가게_삭제() throws Exception {
		StoreDTO storeDTO = new StoreDTO();
		storeDTO.setStore_id(1);
		storeDTO.setStore_img("1");
		storeDTO.setStore_name("1");
		storeDTO.setStore_address("1");
		storeDTO.setStore_phone("1");
		storeDTO.setCategory("1");
		storeDTO.setParking("1");
		storeDTO.setOpentime("1");
		storeDTO.setClosetime("1");
		storeDTO.setDayoff("1");
		storeDTO.setId("1");
		storeDTO.setScore_avg(1);
		storeDTO.setMenu1("1");
		storeDTO.setPrice1("1");
		storeDTO.setMenu2("1");
		storeDTO.setPrice2("1");
		storeDTO.setMenu3("1");
		storeDTO.setPrice3("1");
		storeService.registerStore(storeDTO);

		storeService.deleteStore(1);
	}
}
