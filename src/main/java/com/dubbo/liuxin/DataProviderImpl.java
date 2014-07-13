package com.dubbo.liuxin;

import java.util.ArrayList;
import java.util.List;

public class DataProviderImpl implements DataProvider {

	@Override
	public String getData(int index) {
	List<String> list = new ArrayList<String>();
		list.add("0");
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		if(index>5){
			return "不好意思-_-数组越界";
		}
		return list.get(index);
	}

}
