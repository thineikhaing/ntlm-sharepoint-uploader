package org.tek.sharepoint.exception;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DomainException extends RuntimeException{
	
    private ErrorResponse errorResponse;

    public DomainException(String message, ErrorResponse errorResponse) {
        super(message);
        this.errorResponse = errorResponse;
    }

}
