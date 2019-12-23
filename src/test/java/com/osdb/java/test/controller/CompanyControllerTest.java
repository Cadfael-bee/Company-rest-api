package com.osdb.java.test.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import com.osdb.java.test.repository.CompanyRepository;

@SpringBootTest
@AutoConfigureMockMvc
class CompanyControllerTest {

	@Autowired
	private MockMvc mockMvc;
	
	@Autowired
	CompanyRepository c;

	@Test
	public void shouldGetCompanies() throws Exception {
		this.mockMvc.perform(get("/company/")).andDo(print()).andExpect(status().isOk())
				.andExpect(content().contentType("application/json"))
				.andExpect(jsonPath("$[0].name").value("MicroSoft"))
				.andExpect(jsonPath("$[1].name").value("Starbucks"));
	}

}
