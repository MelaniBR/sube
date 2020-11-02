package com.proyecto.response;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class Response {

    private LocalDateTime time;
    private String data;
    private int respondeCode;
    private String status;

}
