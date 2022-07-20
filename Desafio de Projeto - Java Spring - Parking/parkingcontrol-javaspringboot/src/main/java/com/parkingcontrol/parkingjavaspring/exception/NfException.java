package com.parkingcontrol.parkingjavaspring.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class NfException extends RuntimeException {

    public NfException(String id) {
        super("Parking not found with Id: " + id);
    }
}

//Not Found Exception