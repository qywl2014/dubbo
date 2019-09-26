package org.apache.dubbo.common.bytecode;

public class proxy0 implements org.apache.dubbo.demo.DemoService {

    public static java.lang.reflect.Method[] methods;

    private java.lang.reflect.InvocationHandler handler;// InvokerInvocationHandler(invoker)

    public proxy0() {
    }

    public proxy0(java.lang.reflect.InvocationHandler arg0) {
        handler = $1;
    }

    public java.lang.String sayHello(java.lang.String arg0) {
        Object[] args = new Object[1];
        args[0] = ($w) $1;
        Object ret = handler.invoke(this, methods[0], args);
        return (java.lang.String) ret;
    }
}