package com.kaishengit.service;

import com.google.common.collect.Maps;
import com.kaishengit.mapper.CustomerMapper;
import com.kaishengit.pojo.Customer;
import com.kaishengit.util.ShiroUtil;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;
import java.util.Map;

@Named
public class CustomerService {

    @Inject
    private CustomerMapper customerMapper;
    public List<Customer> findCustomerByParams(Map<String, Object> params) {
        if (ShiroUtil.isEmployee()){
            params.put("userid",ShiroUtil.getCurrentUserId());
        }
        return customerMapper.findByParam(params);
    }

    public Long count() {
        if (ShiroUtil.isEmployee()){
            Map<String,Object>param = Maps.newHashMap();
            param.put("userid",ShiroUtil.getCurrentUserId());
            return customerMapper.countByParam(param);
        }
        return customerMapper.count();
    }

    public Long countByParam(Map<String, Object> params) {
        if (ShiroUtil.isEmployee()){
            params.put("userid",ShiroUtil.getCurrentUserId());
        }
        return customerMapper.countByParam(params);
    }
}
