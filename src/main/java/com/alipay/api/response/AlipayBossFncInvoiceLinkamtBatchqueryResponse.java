package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ArInvoiceBillLinkOpenApiResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.fnc.invoice.linkamt.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2019-10-25 14:06:50
 */
public class AlipayBossFncInvoiceLinkamtBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6554146397681355866L;

	/** 
	 * Ar对账单发票关联明细集合
	 */
	@ApiListField("result_set")
	@ApiField("ar_invoice_bill_link_open_api_response")
	private List<ArInvoiceBillLinkOpenApiResponse> resultSet;

	public void setResultSet(List<ArInvoiceBillLinkOpenApiResponse> resultSet) {
		this.resultSet = resultSet;
	}
	public List<ArInvoiceBillLinkOpenApiResponse> getResultSet( ) {
		return this.resultSet;
	}

}