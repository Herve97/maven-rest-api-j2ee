package org.herve97;

import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;

@Interceptor
@Timed
public class TimedInterceptor {

    @AroundInvoke
    public Object aroundInvoke(InvocationContext invocationContext) throws Exception {
        //return invocationContext.proceed();
        long start = System.currentTimeMillis();
        Object result = invocationContext.proceed();

        return result.toString() + " calculated in " + (System.currentTimeMillis() - start) + "ms";
    }
}
