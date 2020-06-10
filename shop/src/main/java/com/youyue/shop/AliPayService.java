package com.youyue.shop;

import com.alibaba.fastjson.JSONObject;
import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.request.AlipayTradePayRequest;
import com.alipay.api.response.AlipayTradePayResponse;

public class AliPayService {

    public void ali() throws AlipayApiException {
        AlipayClient alipayClient = new DefaultAlipayClient("https://openapi.alipaydev.com/gateway.do","\t\n" +
                "2016102700772067","your private_key","json","UTF-8","alipay_public_key","RSA2");

        AlipayTradePayRequest request = new AlipayTradePayRequest();
        request.setBizContent(new JSONObject().toJSONString());
        AlipayTradePayResponse response = alipayClient.execute(request);

        if(response.isSuccess()){
            System.out.println("调用成功");
        } else {
            System.out.println("调用失败");
        }
    }

}
