/*
 * @(#)SpotType.java 1.8 06/04/20
 * Copyright (c) 2020-2021
 */

package com.project.Smartparking.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import javax.validation.constraints.*;

/**
 * SpotType class uses for storing Spot type information.
 * @author Deepthi N
 * @version 1.0
 */

@Document(collection = "spottypes")
public class SpotType {

    // SpottypeId of Spot types and the size must be equal to or greater than 8 characters and less than 16 characters
    @Id
    @NotEmpty(message = "SpottypeId cannot be empty")
    @Size(min=7,max=16, message = "SpottypeId must be equal to or greater than 8 characters and less than 16 characters")
    private String spotTypeId;

    // Image name of available Spot type and the size must be equal or greater than 8 characters and less than 16 characters
    @NotEmpty(message = "image cannot be empty")
    @Size(min=7,max=18, message = "Image must be equal to or greater than 8 characters and less than 16 characters")
    @Pattern(message= "Invalid image format", regexp = "([^\\s]+(\\.(?i)(jpg|png|gif|bmp))$)" )
    private String availImage;

    // Textlong of available Spot type and the size must be equal to or greater than 5 characters and less than 18 characters
    @NotEmpty(message = "availTextlong cannot be empty")
    @Size(min=6,max=18, message = "availTextlong must be equal to or greater than 5 characters and less than 18 characters")
    private String  availTextlong;

    // Textshort of  available Spot type and the size must be equal to 2 characters
    @NotEmpty(message = "availTextshort cannot be empty")
    @Size(min=2, message = "availTextshort must be equal to 2 characters")
    private String availTextshort;

    // Background color of available Spot type and the size must be equal to 7 characters
    @NotEmpty(message = "Background color cannot be empty")
    @Size(min =7, message = "Background color must be equal to 7 characters")
    private String availBkcolor;

    // Text color of available Spot type and the size must be equal to 7 characters
    @NotEmpty(message = "availTxtcolor cannot be empty")
    @Size(min = 7, message = "Background color must be equal to 7 characters")
    private String availTxtcolor;

    // Status of Spot type and size must be equal to or greater than 9 characters
    @NotEmpty(message = "Status cannot be empty")
    @Size(min=9, message = "Status must be equal to or greater than 9 characters ")
    private String availTip;

    // Image name of occupied Spot type and the size must be equal to or greater than 7 characters and less than 16 characters
    @NotEmpty(message = "image cannot be empty")
    @Size(min=7,max=16, message = "Image must be equal to or greater than 7 characters and less than 16 characters")
    @Pattern(message= "Invalid image format", regexp = "([^\\s]+(\\.(?i)(jpg|png|gif|bmp))$)" )
    private String occImage;

    // Textlong of occupied Spot type and the size must be equal to or greater than 6 characters and less than 18 characters
    @NotEmpty(message = "occTextlong cannot be empty")
    @Size(min=6,max=18, message = "occTextlong must be equal to or greater than 6 characters and less than 18 characters")
    private String  occTextlong;

    // Textshort of occupied Spot type and the size must be equal to 2 characters
    @NotEmpty(message = "occTextshort cannot be empty")
    @Size(min=2, message = "occTextshort must be equal to 2 characters")
    private String occTextshort;

    // Background color of occupied Spot type and the size must be equal to 7 characters
    @NotEmpty(message = "Background color cannot be empty")
    @Size(min =7, message = "Background color must be equal to 7 characters")
    private String occBkcolor;

    // Text color of occupied Spot type and the size must be equal to 7 characters
    @NotEmpty(message = "availTxtcolor cannot be empty")
    @Size(min = 7, message = "Text color must be equal to 7 characters")
    private String occTxtcolor;

    // Status of Spot type and the size must be equal or greater than 9 characters
    @NotEmpty(message = "Status cannot be empty")
    @Size(min=8, message = "Status must be equal or greater than 9 characters ")
    private String occTip;

    // Time limit of Spot type
    @NotNull(message = "timeLimit cannot be empty")
    @Positive(message = "timeLimit should be positive ")
    private int timeLimit;


    // This is a constructor to initialize SpotType object.
    public SpotType(String spotTypeId, String availImage, String availTextlong, String availTextshort, String availBkcolor, String availTxtcolor, String availTip, String occImage, String occTextlong, String occTextshort, String occBkcolor, String occTxtcolor, String occTip, int timeLimit) {
        this.spotTypeId = spotTypeId;
        this.availImage = availImage;
        this.availTextlong = availTextlong;
        this.availTextshort = availTextshort;
        this.availBkcolor = availBkcolor;
        this.availTxtcolor = availTxtcolor;
        this.availTip = availTip;
        this.occImage = occImage;
        this.occTextlong = occTextlong;
        this.occTextshort = occTextshort;
        this.occBkcolor = occBkcolor;
        this.occTxtcolor = occTxtcolor;
        this.occTip = occTip;
        this.timeLimit = timeLimit;

    }

    /**
     * To get spotTypeId
     * @return String type
     */
    public String getSpotTypeId() {
        return spotTypeId;
    }

    /**
     * To set spotTypeId
     * @param spotTypeId String type
     */
    public void setSpotTypeId(String spotTypeId) {
        this.spotTypeId = spotTypeId;
    }

    /**
     * To get image name of available spot type
     * @return String type
     */
    public String getAvailImage() {
        return availImage;
    }

    /**
     * To set image name of available spot type
     * @param availImage String type
     */
    public void setAvailImage(String availImage) {
        this.availImage = availImage;
    }

    /**
     * To get textlong of available Spot type
     * @return String type
     */
    public String getAvailTextlong() {
        return availTextlong;
    }

    /**
     * To set textlong of available Spot type
     * @param availTextlong String type
     */
    public void setAvailTextlong(String availTextlong) {
        this.availTextlong = availTextlong;
    }

    /**
     * To get textshort of available Spot type
     * @return String type
     */
    public String getAvailTextshort() {
        return availTextshort;
    }

    /**
     * To set textshort of available Spot type
     * @param availTextshort String type
     */
    public void setAvailTextshort(String availTextshort) {
        this.availTextshort = availTextshort;
    }

    /**
     * To get background color of available Spot type
     * @return String type
     */
    public String getAvailBkcolor() {
        return availBkcolor;
    }

    /**
     * To set background color of available Spot type
     * @param availBkcolor String type
     */
    public void setAvailBkcolor(String availBkcolor) {
        this.availBkcolor = availBkcolor;
    }

    /**
     * To get text color of available Spot type
     * @return String type
     */
    public String getAvailTxtcolor() {
        return availTxtcolor;
    }

    /**
     * To set text color of available Spot type
     * @param availTxtcolor String type
     */
    public void setAvailTxtcolor(String availTxtcolor) {
        this.availTxtcolor = availTxtcolor;
    }

    /**
     * To get status of Spot type
     * @return String type
     */
    public String getAvailTip() {
        return availTip;
    }

    /**
     * To set status of Spot type
     * @param availTip String type
     */
    public void setAvailTip(String availTip) {
        this.availTip = availTip;
    }

    /**
     * To get Image name of occupied Spot type
     * @return String type
     */
    public String getOccImage() {
        return occImage;
    }

    /**
     * To set Image name of occupied Spot type
     * @param occImage String type
     */
    public void setOccImage(String occImage) {
        this.occImage = occImage;
    }

    /**
     * To get textlong of occupied Spot type
     * @return String type
     */
    public String getOccTextlong() {
        return occTextlong;
    }

    /**
     * To set textlong of occupied Spot type
     * @param occTextlong String type
     */
    public void setOccTextlong(String occTextlong) {
        this.occTextlong = occTextlong;
    }

    /**
     * To get textshort of occupied Spot type
     * @return String type
     */
    public String getOccTextshort() {
        return occTextshort;
    }

    /**
     * To set textshort of occupied Spot type
     * @param occTextshort String type
     */
    public void setOccTextshort(String occTextshort) {
        this.occTextshort = occTextshort;
    }

    /**
     * To get background color of occupied Spot type
     * @return String type
     */
    public String getOccBkcolor() {
        return occBkcolor;
    }

    /**
     * To set background color of occupied Spot type
     * @param occBkcolor String type
     */
    public void setOccBkcolor(String occBkcolor) {
        this.occBkcolor = occBkcolor;
    }

    /**
     * To get text color of occupied Spot type
     * @return String type
     */
    public String getOccTxtcolor() {
        return occTxtcolor;
    }

    /**
     * To set text color of occupied Spot type
     * @param occTxtcolor String type
     */
    public void setOccTxtcolor(String occTxtcolor) {
        this.occTxtcolor = occTxtcolor;
    }

    /**
     * To get status
     * @return String type
     */
    public String getOccTip() {
        return occTip;
    }

    /**
     * To set status
     * @param occTip String type
     */
    public void setOccTip(String occTip) {
        this.occTip = occTip;
    }

    /**
     * To get time limit
     * @return Integer type
     */
    public int getTimeLimit() {
        return timeLimit;
    }

    /**
     * To set time limit
     * @param timeLimit Integer type
     */
    public void setTimeLimit(int timeLimit) {
        this.timeLimit = timeLimit;
    }
}
