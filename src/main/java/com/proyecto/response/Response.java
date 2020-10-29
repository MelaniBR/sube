package com.proyecto.response;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
public class Response {
    private LocalDateTime time;
    private String data;
    private int respondeCode;
    private String status;
}
