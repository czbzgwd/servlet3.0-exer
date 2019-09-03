package com.atguigu.servlet;

import java.util.Set;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.HandlesTypes;

import com.atguigu.service.HelloService;

//����������ʱ��Ὣ@HandlesTypesָ�������������������ࣨʵ���࣬�ӽӿڵȣ����ݹ�����
@HandlesTypes(value={HelloService.class})
public class MyServletContainerInitializer implements javax.servlet.ServletContainerInitializer {

	/*
	 * Ӧ��������ʱ�򣬻�����onStartup������
	 * 
	 * Set<Class<?>> arg0������Ȥ�����͵����������ͣ�
	 * ServletContext arg1:����ǰWebӦ�õ�ServletContext��һ��WebӦ��һ��ServletContext��
	 */
	@Override
	public void onStartup(Set<Class<?>> arg0, ServletContext arg1) throws ServletException {
		System.out.println("����Ȥ�����ͣ�");
		for (Class<?> claz : arg0) {
			System.out.println(claz);
		}

	}

}
