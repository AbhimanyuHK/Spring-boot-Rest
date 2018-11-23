/**
 * 
 */
package com.big.thinx.service;

import org.springframework.stereotype.Service;

import com.big.thinx.model.Detail;

/**
 * @author abhimanyu_h_k
 *
 */
@Service
public interface IBigThinxService {

	Detail getDetail(Integer id) throws Exception;

	Detail createDetail(Detail detail) throws Exception;

	Detail updateDetail(Detail detail) throws Exception;

	Detail deleteDetail(Integer id) throws Exception;

}
