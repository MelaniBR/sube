package com.proyecto.service;

import com.proyecto.entity.Sube;
import com.proyecto.repository.SubeRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import java.math.BigDecimal;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SubeServiceTest {

    private Sube sube;

    @InjectMocks
    private SubeService subeService;

    @MockBean
    private SubeRepository mockRepository;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        sube = new Sube();

    }

    @Test
    public void getFindByIdTest() {
        when(mockRepository.findById(1)).thenReturn(sube);
        assertEquals(subeService.getSubeById(1), sube);
        verify(mockRepository).findById(1);

    }

    @Test
    public void putNewSaldoInIDThatDontBelongToAnySubeTest() {
        Exception myException = null;

        try {
            subeService.putNewSaldo(1,sube);
        } catch (Exception e) {
            myException = e;
        }
    assertEquals(myException.getMessage(),"This ID: " + 1 +" IS DONT BELONG TO ANY SUBE ");
    }
    @Test
    public void putNewSaldoTest() {
        when(mockRepository.findById(1)).thenReturn(sube);
        subeService.putNewSaldo(1, sube);
        assertEquals(BigDecimal.TEN,sube.getBalance());
    }
}