/**
 * 
 */
package com.big.thinx.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.big.thinx.model.Detail;
import com.big.thinx.service.IBigThinxService;

/**
 * @author abhimanyu_h_k
 *
 */
@RestController
public class BigThinxController {

	@Autowired
	private IBigThinxService bigThinxService;

	@RequestMapping(name = "/get", method = RequestMethod.GET)
	public Detail getDetail(@RequestParam Integer id) throws Exception {
		try {
			return bigThinxService.getDetail(id);
		} catch (Exception e) {
			throw new Exception(e);
		}

	}

	@RequestMapping(name = "/create", method = RequestMethod.POST)
	public Detail createDetail(@RequestBody Detail detail) throws Exception {
		try {
			return bigThinxService.createDetail(detail);
		} catch (Exception e) {
			throw new Exception(e);
		}
	}

	@RequestMapping(name = "/update", method = RequestMethod.PUT)
	public Detail updateDetail(@RequestBody Detail detail) throws Exception {
		try {
			return bigThinxService.updateDetail(detail);
		} catch (Exception e) {
			throw new Exception(e);
		}
	}

	@RequestMapping(name = "/delete", method = RequestMethod.DELETE)
	public Detail deleteDetail(@RequestParam("id") Integer id) throws Exception {
		try {
			return bigThinxService.deleteDetail(id);
		} catch (Exception e) {
			throw new Exception(e);
		}
	}
}
