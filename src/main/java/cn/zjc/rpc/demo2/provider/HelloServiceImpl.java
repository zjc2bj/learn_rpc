package cn.zjc.rpc.demo2.provider;

import cn.zjc.rpc.demo2.api.HelloService;

public class HelloServiceImpl implements HelloService {
	public String hello(String name) {
		System.out.println("=============>> " + name);
		return "Hello，I am server!!!";
	}
}
