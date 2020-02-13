package com.yz.sophia.bsf.health.base;

import com.yz.sophia.bsf.core.base.BsfException;

/**
 * @author: chejiangyi
 * @version: 2019-07-24 15:33
 **/
public class HealthException extends BsfException {
    public HealthException(Throwable exp)
    {
        super(exp);
    }

    public HealthException(String message)
    {
        super(message);
    }

    public HealthException(String message, Throwable cause)
    {
        super(message, cause);
    }
}
