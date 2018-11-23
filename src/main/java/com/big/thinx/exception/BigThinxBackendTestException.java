/**
 * 
 */
package com.big.thinx.exception;

import java.io.Serializable;

/**
 * @author abhimanyu_h_k
 *
 */
public class BigThinxBackendTestException extends Exception implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String errorCode;
	private String erroMesage;

	public BigThinxBackendTestException(BigThinxBackendTestExceptionCode backendTestExceptionCode,
			Throwable throwable) {
		super(backendTestExceptionCode.getMessage(), throwable);
		this.errorCode = backendTestExceptionCode.getCode();
		this.erroMesage = backendTestExceptionCode.getMessage();
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public String getErroMesage() {
		return erroMesage;
	}

	@Override
	public String toString() {
		return "BigThinxBackendTestException [errorCode=" + errorCode + ", erroMesage=" + erroMesage + "]";
	}

}
