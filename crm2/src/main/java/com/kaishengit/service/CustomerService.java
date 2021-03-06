package com.kaishengit.service;

import com.google.common.collect.Maps;
import com.kaishengit.mapper.CustomerMapper;
import com.kaishengit.pojo.Customer;
import com.kaishengit.util.ShiroUtil;
import com.kaishengit.util.Strings;
import org.apache.commons.lang3.StringUtils;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;
import java.util.Map;

@Named
public class CustomerService {

    @Inject
    private CustomerMapper customerMapper;

    public List<Customer> findCustomerByParams(Map<String, Object> params) {
        if (ShiroUtil.isEmployee()) {
            params.put("userid", ShiroUtil.getCurrentUserId());
        }
        return customerMapper.findByParam(params);
    }

    public Long count() {
        if (ShiroUtil.isEmployee()) {
            Map<String, Object> param = Maps.newHashMap();
            param.put("userid", ShiroUtil.getCurrentUserId());
            return customerMapper.countByParam(param);
        }
        return customerMapper.count();
    }

    public Long countByParam(Map<String, Object> params) {
        if (ShiroUtil.isEmployee()) {
            params.put("userid", ShiroUtil.getCurrentUserId());
        }
        return customerMapper.countByParam(params);
    }

    public List<Customer> findAllCompany() {
        return customerMapper.findByType(Customer.CUSTOMER_TYPE_COMPANY);
    }

    public void saveCustomer(Customer customer) {
        if (customer.getCompanyid() != null) {
            Customer company = customerMapper.findById(customer.getCompanyid());
            customer.setCompanyname(company.getName());
        }
        customer.setUserid(ShiroUtil.getCurrentUserId());
        customer.setPinyin(Strings.toPinyin(customer.getName()));
        customerMapper.save(customer);
    }

    public void delCustomer(Integer id) {
        Customer customer = customerMapper.findById(id);
        if (customer != null) {
            if (customer.getType().equals(Customer.CUSTOMER_TYPE_COMPANY)) {
                List<Customer> customerList = customerMapper.findByCompanyId(id);
                for (Customer cust : customerList) {
                    cust.setCompanyname(null);
                    cust.setCompanyid(null);
                    customerMapper.update(cust);
                }
            }
            customerMapper.del(id);
        }
    }

    public Customer findCustomerById(Integer id) {
        return customerMapper.findById(id);
    }

    @Transactional
    public void editCustomer(Customer customer) {
        if (customer.getType().equals(Customer.CUSTOMER_TYPE_COMPANY)) {
            List<Customer> customerList = customerMapper.findByCompanyId(customer.getId());
            for (Customer cust : customerList) {
                cust.setCompanyid(customer.getId());
                cust.setCompanyname(customer.getName());
                customerMapper.update(cust);
            }
        } else {
            if (customer.getCompanyid() != null) {
                Customer company = customerMapper.findById(customer.getCompanyid());
                customer.setCompanyname(company.getName());
            }
        }
        customer.setPinyin(Strings.toPinyin(customer.getName()));
        customerMapper.update(customer);
    }

    public List<Customer> findCustomerByCompanyId(Integer id) {
        return customerMapper.findByCompanyId(id);
    }

    /**
     * 将客户公开
     *
     * @param customer
     */
    public void openCustomer(Customer customer) {
        customer.setUserid(null);
        customerMapper.update(customer);
    }

    public void moveCust(Customer customer, Integer userid) {
        customer.setUserid(userid);
        customerMapper.update(customer);
    }

    public String makeMeCard(Integer id) {
        Customer customer = customerMapper.findById(id);

        StringBuilder mecard = new StringBuilder("MECARD:");
        if (StringUtils.isNotEmpty(customer.getName())) {
            mecard.append("N:" + customer.getName() + ";");
        }
        if (StringUtils.isNotEmpty(customer.getTel())) {
            mecard.append("TEL:" + customer.getTel() + ";");
        }
        if (StringUtils.isNotEmpty(customer.getEmail())) {
            mecard.append("EMAIL:" + customer.getEmail() + ";");
        }
        if (StringUtils.isNotEmpty(customer.getAddress())) {
            mecard.append("ADR:" + customer.getAddress() + ";");
        }
        if (StringUtils.isNotEmpty(customer.getCompanyname())) {
            mecard.append("ORG:" + customer.getCompanyname() + ";");
        }
        mecard.append(";");

        return mecard.toString();
    }

    public List<Customer> findAllCustomer() {
        Integer userid = null;
        if (ShiroUtil.isEmployee()){
            userid = ShiroUtil.getCurrentUserId();
        }
        return customerMapper.findAll(userid);
    }
}
