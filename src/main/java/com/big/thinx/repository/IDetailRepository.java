/**
 * 
 */
package com.big.thinx.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.big.thinx.model.Detail;

/**
 * @author abhimanyu_h_k
 *
 */
@Repository
public interface IDetailRepository extends JpaRepository<Detail, Integer>{

}
