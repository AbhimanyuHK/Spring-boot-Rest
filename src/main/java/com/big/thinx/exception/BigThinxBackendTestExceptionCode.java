/**
 * 
 */
package com.big.thinx.exception;

/**
 * @author abhimanyu_h_k
 *
 */
public enum BigThinxBackendTestExceptionCode {

	FETCH_EXCEPTION("BT1", "Error while getting from database."),
	INSERT_EXCEPTION("BT2", "Error while saving to database."),
	UPDATE_EXCEPTION("BT3", "Error while updating to database."),
	DELETE_EXCEPTION("BT4", "Error while deleting from database.");

	private String code;
	private String message;

	private BigThinxBackendTestExceptionCode(String code, String message) {
		this.code = code;
		this.message = message;
	}

	public String getCode() {
		return code;
	}

	public String getMessage() {
		return message;
	}

}
