package com.proyecto.exceptionHandling;
import com.proyecto.response.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;
import java.time.LocalDateTime;


@ControllerAdvice
public class SubeExceptionHandler {

    
    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<Response> runtimeException(RuntimeException e) {
        Response result = new Response(LocalDateTime.now(), "[Exception Response] - Exception: " + e.getMessage(), 500, "Error");
        return new ResponseEntity<Response>(result, HttpStatus.BAD_REQUEST);
    }


    @ExceptionHandler(Exception.class)
    public ResponseEntity<Response> exceptionHandler(Exception e){
        Response result = new Response(LocalDateTime.now(), "[Exception Response] - Exception: " + e.getMessage(), 500, "Error");
        return new ResponseEntity<Response>(result, HttpStatus.BAD_REQUEST);
    }
}
