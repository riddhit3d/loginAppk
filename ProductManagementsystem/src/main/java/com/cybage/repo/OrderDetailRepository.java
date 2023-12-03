package com.cybage.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cybage.entity.OrderDetail;
import com.cybage.entity.OrderInput;
@Repository
public interface OrderDetailRepository extends JpaRepository <OrderDetail,Integer>{

	static Object save(OrderInput orderInput) {
		// TODO Auto-generated method stub
		return null;
	}

//	static OrderDetail saveAll(Iterable<S> orderInput) {
//		// TODO Auto-generated method stub
//		return null;
//	}

//	static OrderDetail save(OrderInput orderInput) {
//		// TODO Auto-generated method stub
//		return save(orderInput);
//	}

}
