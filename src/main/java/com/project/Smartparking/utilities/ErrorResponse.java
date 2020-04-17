/*
 * @(#)ErrorResponse.java 1.8 06/04/20
 * Copyright (c) 2020-2021
 */

package com.project.Smartparking.utilities;

/**
 * ErrorResponse is used for getting an error message if spottypeId already exists.
 * @author Deepthi N
 * @version 1.0
 */

public class ErrorResponse {

    // Error Message
    String errMsg;

    // This is the constructor to initialize the ErrorResponse Object
    public  ErrorResponse(String errMsg) {
        this.errMsg = errMsg;
    }

    // To get error message
    public String getErrMsg() {
        return errMsg;
    }

    // To set error message
    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }
}
