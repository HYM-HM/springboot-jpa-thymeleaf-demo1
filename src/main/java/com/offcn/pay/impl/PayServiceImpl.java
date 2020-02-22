package com.offcn.pay.impl;

import com.offcn.pay.PayService;

public class PayServiceImpl implements PayService {
    @Override
    public void add(Double money) {
        System.out.println("支付更新！");
    }

    @Override
    public void update(Double money) {
        System.out.println("支付修改！");
    }

    @Override
    public void delete(Double id) {
        System.out.println("支付删除！");
    }
}
