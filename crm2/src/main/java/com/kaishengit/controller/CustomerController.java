package com.kaishengit.controller;

import com.google.common.collect.Maps;
import com.kaishengit.dto.DataTablesResult;
import com.kaishengit.pojo.Customer;
import com.kaishengit.service.CustomerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/customer")
public class CustomerController {
    @Inject
    private CustomerService customerService;

    /**
     * 显示客户列表页面，并传公司列表
     * @param model
     * @return
     */
    @RequestMapping(method = RequestMethod.GET)
    public String list(Model model){
        model.addAttribute("companyList",customerService.findAllCompany());
        return "customer/list";
    }

    /**
     * DataTable加载数据
     * @param request
     * @return
     */
    @RequestMapping(value = "/load",method = RequestMethod.GET)
    @ResponseBody
    public DataTablesResult<Customer> load(HttpServletRequest request){
        String draw = request.getParameter("draw");
        String start = request.getParameter("start");
        String length = request.getParameter("length");
        Map<String,Object> params = Maps.newHashMap();
        params.put("start",start);
        params.put("length",length);
        List<Customer>customerList = customerService.findCustomerByParams(params);
        Long count = customerService.count();
        Long filterCount = customerService.countByParam(params);
        return new DataTablesResult<>(draw,customerList,count,filterCount);
    }

    /**
     * 新增客户
     * @param customer
     * @return
     */
    @RequestMapping(value = "/new",method = RequestMethod.POST)
    @ResponseBody
    public String save(Customer customer){
        customerService.saveCustomer(customer);
        return "success";
    }
}
