package com.kenzie.statics.fulfillment;

public class Box {
    private double length;
    private double width;
    private double height;

    private static final double MAX_SIZE = 72;

    /**
     * Constructs a Box object if the dimensions are valid
     * @param length - length of box
     * @param width - width of box
     * @param height - height of box
     * @throws DimensionValueException if the provided dimensions exceed the max Box size
     */
    public Box(double length, double width, double height) throws DimensionValueException {
        if(validateBoxDimensions(height,width,length) == true){
            this.length = length;
            this.width = width;
            this.height = height;
        }
        else{
            throw new DimensionValueException("Height, width, or length exceed box dimensions.");
        }
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
    public static Boolean validateBoxDimensions(double height, double width, double length) {
        //check if dimensions are legal 72 inches
        //if they are all legal return true, otherwise return false
        if(height <= MAX_SIZE && width <= MAX_SIZE && length <= MAX_SIZE){
            return true;
        }
        else{
            return false;
        }
    }
}
