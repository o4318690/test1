package com.tedu.sp01.service;

import java.util.List;

import com.tedu.sp01.pojo.Item;

public interface ItemService {
	/**
	 * 通过orderId获取商品列表
	 */
	List<Item> getItems(String orderId);
	/**
	 * 减少商品库存,在保存订单是,减少库存
	 */
	void decreaseNumber(List<Item> list);
}
