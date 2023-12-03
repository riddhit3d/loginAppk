package com.cybage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cybage.entity.OrderDetail;
import com.cybage.entity.OrderInput;
import com.cybage.entity.OrderProductQuantity;
import com.cybage.entity.Product;
import com.cybage.repo.OrderDetailRepository;
//import com.cybage.repo.ProductRepository;


@Service
public class OrderDetailService {
	private static final String ORDER_PLACED="PLACED";
	@Autowired
	private static OrderDetailRepository orderDetailRepository;
//	@Autowired
//	private static ProductRepository productRepository;
//	.....................................private UserDao userdao;
	public static void placeOrder(OrderInput orderInput) {
		List<OrderProductQuantity>productQuantityList=orderInput.getOrderProductQuantityList();
		
		

		
		for(OrderProductQuantity o:productQuantityList) {
//		Product product =productRepository.findById(o.getProductId()).get();
			
			
			
//			String currentUser =JwtRequestFilter.CurrentUser;
//			User user=Userdao.(currentUser.get());
			
			
			OrderDetail orderDetail = new OrderDetail(
					orderInput.getFullName(),
					orderInput.getFullAddress(),
					orderInput.getContactNumber(),
					orderInput.getAlternateContactNumber(),
					
					ORDER_PLACED, null
				
					);
//		        orderAmount:Product.getprice() *o.getdescription(),
//				product
////					user
//					);
//					
			orderDetailRepository.save(orderDetail);
			
		}

}

	public Object saveOrderDetail(OrderInput orderInput) {
		// TODO Auto-generated method stub
		return OrderDetailRepository.save(orderInput);
	}


	
		public List<OrderDetail> getAllOrderDetail() {
			return orderDetailRepository.findAll();
		}
	}
