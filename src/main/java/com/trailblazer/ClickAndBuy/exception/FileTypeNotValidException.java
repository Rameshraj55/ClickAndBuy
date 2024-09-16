package com.trailblazer.ClickAndBuy.exception;

public class FileTypeNotValidException extends Exception {
    private static final long serialVersionUID = 1L;

    String fileName;
    String fileType;

    /**
     * @param resourceName
     * @param fieldName
     * @param userId
     */
    public FileTypeNotValidException(String fieldName, String fileType) {
        super(String.format("%s Type is Invalid : %s", fieldName, fileType));
        this.fileName = fieldName;
        this.fileType = fileType;
    }
}
