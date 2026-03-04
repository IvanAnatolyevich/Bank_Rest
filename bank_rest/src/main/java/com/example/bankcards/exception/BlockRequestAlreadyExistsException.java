package com.example.bankcards.exception;

public class BlockRequestAlreadyExistsException extends RuntimeException {
    public BlockRequestAlreadyExistsException(String message) {
        super(message);
    }
}
