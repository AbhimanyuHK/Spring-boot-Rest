/**
 * 
 */
package com.big.thinx.controller;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.big.thinx.model.Detail;
import com.big.thinx.service.IBigThinxService;

/**
 * @author abhimanyu_h_k
 *
 */
@RunWith(SpringRunner.class)
@WebMvcTest(BigThinxController.class)
public class BigThinxControllerTest {

	@Autowired
	private MockMvc mvc;

	@MockBean
	private IBigThinxService bigThinxService;

	@Test
	public void getDetailsTest() throws Exception {
		when(bigThinxService.getDetail(any(Integer.class))).thenReturn(new Detail());
		mvc.perform(get("/get?id=1").contentType(MediaType.APPLICATION_JSON)).andExpect(status().isOk()).andReturn();
	}

	@Test
	public void createTest() throws Exception {
		when(bigThinxService.createDetail((any(Detail.class)))).thenReturn(new Detail());
		mvc.perform(
				post("/create")
						.content(
								"{\r\n" + "	\"id\" : 1,\r\n" + "	\"name\" : \"XYZ\",\r\n" + "	\"address\" : {\r\n"
										+ "		\"addressDetail\" : \"update new address from old.\"\r\n" + "	},\r\n"
										+ "	\"dob\" : \"2018-10-56\",\r\n" + "	\"description\" : \"Nothing\",\r\n"
										+ "	\"createdAt\" : \"2018_2_4\"\r\n" + "}")
						.contentType(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk()).andReturn();
	}

	@Test
	public void updateTest() throws Exception {
		when(bigThinxService.updateDetail(any(Detail.class))).thenReturn(new Detail());
		mvc.perform(
				put("/update")
						.content(
								"{\r\n" + "	\"id\" : 1,\r\n" + "	\"name\" : \"XYZ\",\r\n" + "	\"address\" : {\r\n"
										+ "		\"addressDetail\" : \"update new address from old.\"\r\n" + "	},\r\n"
										+ "	\"dob\" : \"2018-10-56\",\r\n" + "	\"description\" : \"Nothing\",\r\n"
										+ "	\"createdAt\" : \"2018_2_4\"\r\n" + "}")
						.contentType(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk()).andReturn();
	}

	@Test
	public void deleteTest() throws Exception {
		when(bigThinxService.getDetail(any(Integer.class))).thenReturn(new Detail());
		when(bigThinxService.deleteDetail(any(Integer.class))).thenReturn(new Detail());
		mvc.perform(get("/delete?id=1").contentType(MediaType.APPLICATION_JSON)).andExpect(status().isOk()).andReturn();
	}

}
