package com.rays.exception;

/**
 * DuplicateRecordException thrown when a duplicate record occurred
 *Shriram Patel 
 */
public class DuplicateRecordException extends RuntimeException {

	/**
	 * @param msg
	 *            error message
	 */
	public DuplicateRecordException(String msg) {
		super(msg);
	}

}