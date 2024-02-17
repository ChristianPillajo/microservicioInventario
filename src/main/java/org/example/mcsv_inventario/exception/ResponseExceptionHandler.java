package org.example.mcsv_inventario.exception;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.time.LocalDateTime;
import java.util.stream.Collectors;

@ControllerAdvice
public class ResponseExceptionHandler extends ResponseEntityExceptionHandler {


    @ExceptionHandler(ModelNotFoundException.class)
    public ResponseEntity<ExceptionResponse> handleModelNotFoundException(ModelNotFoundException ex, WebRequest request) {
        ExceptionResponse er = new ExceptionResponse(LocalDateTime.now()
                , "El registro no existe"
                , request.getDescription(false));
        return new ResponseEntity<>(er, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<ExceptionResponse> handleIllegalArgumentException(IllegalArgumentException ex, WebRequest request) {
        ExceptionResponse er = new ExceptionResponse(LocalDateTime.now()
                , "El argumanto es ilegal"
                , request.getDescription(false));
        return new ResponseEntity<>(er, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(NumberFormatException.class)
    public ResponseEntity<ExceptionResponse> handleNumberFormatException(NumberFormatException ex, WebRequest request) {
        ExceptionResponse er = new ExceptionResponse(
                LocalDateTime.now()
                , "No se pudo convertir a número"
                , request.getDescription(false));
        return new ResponseEntity<>(er, HttpStatus.NOT_FOUND);
    }


    @ExceptionHandler(Exception.class)
    public ResponseEntity<ExceptionResponse> handleExceptionD(Exception ex, WebRequest request) {
        ExceptionResponse er = new ExceptionResponse(LocalDateTime.now()
                , "El erro esta en el servidor"
                , request.getDescription(false));
        return new ResponseEntity<>(er, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatusCode status, WebRequest request) {
        String msg = ex.getBindingResult().getAllErrors().stream().map(
                e -> e.getCode().concat(":").concat(e.getDefaultMessage()).concat(",")
        ).collect(Collectors.joining());

        ExceptionResponse er = new ExceptionResponse(LocalDateTime.now(), msg, request.getDescription(false));
        return new ResponseEntity<>(er, HttpStatus.UNPROCESSABLE_ENTITY);
    }


}
