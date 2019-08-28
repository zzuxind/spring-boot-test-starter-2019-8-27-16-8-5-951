package com.oocl.web.sampleWebApp.controller;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class UserControllerTest {
    @Autowired
    private MockMvc mockMvc;

   // @Test
//    public void should_return_201_status_when_create_user(){
//        mockMvc.perform(post("/user").content())
//    }

    @Test
    public void should_return_200_when_get_users() throws Exception {
        mockMvc.perform(get("/user"))
                .andExpect(status().isOk());
    }
}

