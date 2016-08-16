package com.kaishengit.service;

import com.google.common.collect.Maps;
import com.kaishengit.mapper.CustomerMapper;
import com.kaishengit.mapper.SalesLogMapper;
import com.kaishengit.mapper.SalesMapper;
import com.kaishengit.pojo.Sales;
import com.kaishengit.pojo.SalesLog;
import com.kaishengit.util.ShiroUtil;
import org.joda.time.DateTime;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;
import java.util.Map;

@Named
public class SalesService {
    @Inject
    private SalesMapper salesMapper;
    @Inject
    private CustomerMapper customerMapper;
    @Inject
    private SalesLogMapper salesLogMapper;

    public List<Sales> findByParam(Map<String, Object> params) {
        if(ShiroUtil.isEmployee()) {
            params.put("userid",ShiroUtil.getCurrentUserId());
        }
        return salesMapper.findByParam(params);
    }

    public Long count() {
        Map<String,Object> params = Maps.newHashMap();
        if(ShiroUtil.isEmployee()) {
            params.put("userid",ShiroUtil.getCurrentUserId());
        }
        return salesMapper.countByParam(params);
    }

    public Long countByParam(Map<String, Object> params) {
        if(ShiroUtil.isEmployee()) {
            params.put("userid",ShiroUtil.getCurrentUserId());
        }
        return salesMapper.countByParam(params);
    }

    @Transactional
    public void saveSales(Sales sales) {
        sales.setUserid(ShiroUtil.getCurrentUserId());
        sales.setLasttime(DateTime.now().toString("yyyy-MM-dd HH:mm"));
        sales.setUsername(ShiroUtil.getCurrentRealName());
        sales.setCustname(customerMapper.findById(sales.getCustid()).getName());
        salesMapper.save(sales);
        SalesLog salesLog = new SalesLog();
        salesLog.setType(SalesLog.LOG_TYPE_AUTO);
        salesLog.setContext(ShiroUtil.getCurrentRealName()+ " 创建了该销售机会");
        salesLog.setSalesid(sales.getId());
        salesLogMapper.save(salesLog);
    }

    public List<Sales> findSalesByCustId(Integer custId) {
        return salesMapper.findByCustId(custId);
    }

    public Sales findSalesById(Integer id) {
        return salesMapper.findById(id);
    }

    public List<SalesLog> findSalesLogBySalesId(Integer salesId) {
        return salesLogMapper.findBySalesId(salesId);
    }

    @Transactional
    public void saveLog(SalesLog salesLog) {
        salesLog.setType(SalesLog.LOG_TYPE_INPUT);
        salesLogMapper.save(salesLog);
        Sales sales = salesMapper.findById(salesLog.getSalesid());
        sales.setLasttime(DateTime.now().toString("yyyy-MM-dd"));
    }

    @Transactional
    public void editSalesProgress(Integer id, String progress) {
        Sales sales = salesMapper.findById(id);
        sales.setProgress(progress);
        sales.setLasttime(DateTime.now().toString("yyyy-MM-dd"));
        if ("交易完成".equals(progress)){
            sales.setSuccesstime(DateTime.now().toString("yyyy-MM-dd"));
        }
        salesMapper.update(sales);
        SalesLog salesLog = new SalesLog();
        salesLog.setType(SalesLog.LOG_TYPE_AUTO);
        salesLog.setContext(ShiroUtil.getCurrentRealName()+ " 更改进度为：" + progress);
        salesLog.setSalesid(sales.getId());
        salesLogMapper.save(salesLog);
    }
}
