package com.trailblazer.ClickAndBuy.exception;

public class ResourceNotFoundException extends Exception{

    private static final long serialVersionUID = 1L;

    String resourceName; // Entity
    String fieldName; // Attributes
    String fieldValue; // Attribute Value
    Integer fieldValue1; // ???

    // CONSTRUCTORS
    public ResourceNotFoundException(String resourceName,
                                     String fieldName,
                                     String fieldValue) {
        super(String.format("%s not found with this %s : %s", resourceName,fieldName, fieldValue ));
        this.resourceName = resourceName;
        this.fieldName = fieldName;
        this.fieldValue = fieldValue;
    }

    public ResourceNotFoundException(String resourceName,
                                     String fieldName,
                                     Integer fieldValue1){
        super(String.format("%s not found with this %s : %s", resourceName, fieldName, fieldValue1));
        this.resourceName = resourceName;
        this.fieldName = fieldName;
        this.fieldValue1 = fieldValue1;
    }

    public ResourceNotFoundException( String fieldName) {
        super(String.format("%s is Empty !", fieldName));
        this.fieldName = fieldName;
    }

}
