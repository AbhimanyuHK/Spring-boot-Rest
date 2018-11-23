/**
 * 
 */
package com.big.thinx.service;

import org.springframework.stereotype.Service;

import com.big.thinx.exception.BigThinxBackendTestException;
import com.big.thinx.model.Detail;

/**
 * @author abhimanyu_h_k
 *
 */
@Service
public interface IBigThinxService {

	Detail getDetail(Integer id) throws BigThinxBackendTestException;

	Detail createDetail(Detail detail) throws BigThinxBackendTestException;

	Detail updateDetail(Detail detail) throws BigThinxBackendTestException;

	Detail deleteDetail(Integer id) throws BigThinxBackendTestException;

}
