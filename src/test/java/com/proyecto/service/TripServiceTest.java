package com.proyecto.service;

import com.proyecto.entity.Trip;
import com.proyecto.repository.TripRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import java.util.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TripServiceTest {
    private List<Trip> lTrip ;
    private Trip trip;

    @InjectMocks
    private TripService tripService;

    @MockBean
    private TripRepository mockRepository;

    @BeforeEach
    public void setUp() {
        lTrip = new ArrayList<Trip>() ;


        trip = new Trip();
        lTrip.add(trip);

    }

    @Test
    public void getFindByIdTest() {
        when(mockRepository.findByIdSube(1)).thenReturn(lTrip);
        assertEquals(tripService.getTripByIdSube(1), lTrip);
        verify(mockRepository).findByIdSube(1);

    }



}
