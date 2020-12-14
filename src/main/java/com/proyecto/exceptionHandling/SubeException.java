package com.proyecto.exceptionHandling;
import lombok.AllArgsConstructor;
import lombok.Data;


public class SubeException extends Exception {
 private String error ;
  public SubeException(String error) {
   this.error = error ;
  }
}
