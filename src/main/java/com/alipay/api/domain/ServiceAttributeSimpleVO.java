package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 服务属性
 *
 * @author auto create
 * @since 1.0, 2019-11-25 20:55:43
 */
public class ServiceAttributeSimpleVO extends AlipayObject {

	private static final long serialVersionUID = 3874592985822739436L;

	/**
	 * 服务属性key
	 */
	@ApiField("key")
	private String key;

	/**
	 * abcd
	 */
	@ApiListField("value")
	@ApiField("string")
	private List<String> value;

	public String getKey() {
		return this.key;
	}
	public void setKey(String key) {
		this.key = key;
	}

	public List<String> getValue() {
		return this.value;
	}
	public void setValue(List<String> value) {
		this.value = value;
	}

}