package com.aop;

import com.aop.factory.BookFaceProxy;
import com.aop.service.BookFaceService;
import com.aop.service.impl.BookFaceServiceImpl;

/**
 * @Author:wjy
 * @Date: 2018/10/30.
 */
public class TestProxy {

	public static void main(String[] args) {
		BookFaceProxy faceProxy = new BookFaceProxy();
		BookFaceService bookFaceService = (BookFaceService) faceProxy.bind(new BookFaceServiceImpl());

		bookFaceService.addBook();
	}
}
