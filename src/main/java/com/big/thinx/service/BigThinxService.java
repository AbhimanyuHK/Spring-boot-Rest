/**
 * 
 */
package com.big.thinx.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.big.thinx.model.Detail;
import com.big.thinx.repository.IDetailRepository;

/**
 * @author abhimanyu_h_k
 *
 */
@Service
public class BigThinxService implements IBigThinxService {

	@Autowired
	private IDetailRepository detailRepository;

	@Override
	public Detail getDetail(Integer id) throws Exception {
		try {
			return detailRepository.findById(id).get();
		} catch (Exception e) {
			throw new Exception(e);
		}
	}

	@Override
	public Detail createDetail(Detail detail) throws Exception {
		try {
			return detailRepository.save(detail);
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e);
		}
	}

	@Override
	public Detail updateDetail(Detail detail) throws Exception {
		try {
			return detailRepository.save(detail);
		} catch (Exception e) {
			throw new Exception(e);
		}
	}

	@Override
	public Detail deleteDetail(Integer id) throws Exception {
		try {
			Detail detail = getDetail(id);
			detailRepository.delete(detail);
			return detail;
		} catch (Exception e) {
			throw new Exception(e);
		}
	}
}
