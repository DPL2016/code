package com.kaishengit.action.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.ActionProxy;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class MyTimerInterceptor extends AbstractInterceptor{

    @Override
    public String intercept(ActionInvocation invocation) throws Exception {
        ActionProxy actionProxy = invocation.getProxy();
        String namespace = actionProxy.getNamespace();
        String methodName = actionProxy.getMethod();
        String name  = actionProxy.getActionName();
        long startTime = System.currentTimeMillis();
        String result = actionProxy.execute();
        long endTime = System.currentTimeMillis();
        System.out.println(namespace+"/"+name+"方法："+methodName+"耗费："+(endTime-startTime)+"ms");
        return result;
    }
}
