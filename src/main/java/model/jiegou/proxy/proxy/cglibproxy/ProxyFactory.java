package model.jiegou.proxy.proxy.cglibproxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class ProxyFactory implements MethodInterceptor {

    private Object target;

    public ProxyFactory(Object target){
        this.target = target;
    }

    @Override
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("cglib 代理开始，可以添加逻辑");
        System.out.println(o.getClass().toString());
        System.out.println(method.toString());
        Object obj = method.invoke(target,args);
        System.out.println("cglib 代理结束");
        return obj;
    }


    public Object getProxyInstance(){
        //工具类，类似于JDK动态代理的Proxy类
        Enhancer enhancer = new Enhancer();
        //设置父类
        enhancer.setSuperclass(target.getClass());
        //设置回调函数
        enhancer.setCallback(this);
        //创建子类对象，即代理对象
        return enhancer.create();
    }
}
