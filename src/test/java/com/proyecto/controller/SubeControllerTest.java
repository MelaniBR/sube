package com.proyecto.controller;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.proyecto.entity.Sube;
import com.proyecto.service.SubeService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@SpringBootTest
@AutoConfigureMockMvc
public class SubeControllerTest {

    private List<Sube> listsube ;
    private Sube sube ;
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private SubeService subeService;

    @Autowired
    private ObjectMapper objectMapper;

    @BeforeEach
    public void setUp() throws Exception {
        listsube = new ArrayList<>();
        sube = new Sube();
        listsube.add(sube);
    }

    @Test
    public void getAllSubesTest() throws Exception {
        when(subeService.getAllSube()).thenReturn(listsube);

        mockMvc.perform( MockMvcRequestBuilders
                .get("/subes")
                .accept(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().json(objectMapper.writeValueAsString(listsube)));
    }

    @Test
    public void getSubeByIdTest() throws Exception {
        when(subeService.getSubeById(1)).thenReturn(sube);

        mockMvc.perform( MockMvcRequestBuilders
                .get("/sube/{id}" , 1)
                .accept(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().json(objectMapper.writeValueAsString(sube)));
    }

    @Test
    public void putNewSaldoTest() throws Exception {
        when(subeService.putNewSaldo(1, BigDecimal.TEN)).thenReturn(sube);

        mockMvc.perform( MockMvcRequestBuilders
                .put("/sube/{id}/cargarSube" , 1)
                    .contentType(MediaType.APPLICATION_JSON)
                    .content("10")
                .accept(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().json(objectMapper.writeValueAsString(sube)));
    }
}



