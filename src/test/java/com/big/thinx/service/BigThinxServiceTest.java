/**
 * 
 */
package com.big.thinx.service;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;

import com.big.thinx.model.Detail;
import com.big.thinx.repository.IDetailRepository;

/**
 * @author abhimanyu_h_k
 *
 */
@RunWith(MockitoJUnitRunner.class)
@SpringBootTest
public class BigThinxServiceTest {

	@InjectMocks
	private BigThinxService bigThinxService;

	@Mock
	private IDetailRepository detailRepository;

	@Before
	public void setUp() throws Exception {

		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void getDetailTest() throws Exception {
		when(detailRepository.findById(any(Integer.class))).thenReturn(Optional.of(new Detail()));
		bigThinxService.getDetail(1);
	}

	@Test
	public void getCreateTest() throws Exception {
		when(detailRepository.save((any(Detail.class)))).thenReturn(new Detail());
		bigThinxService.createDetail(new Detail());
	}

	@Test
	public void getUpdateTest() throws Exception {
		when(detailRepository.save((any(Detail.class)))).thenReturn(new Detail());
		bigThinxService.updateDetail(new Detail());
	}

}
