package com.workintech.s18d1.exceptions;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;


@AllArgsConstructor
@NoArgsConstructor
public class BurgerException extends RuntimeException {
    private HttpStatus httpStatus;

    public BurgerException(String message, HttpStatus status) {
        super(message);
        this.httpStatus = status;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }
}
