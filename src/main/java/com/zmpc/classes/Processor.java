package com.zmpc.classes;

import com.zmpc.interfaces.Function;

/**
 * Created by Alex Show on 19.12.2019.
 */
public class Processor<T> {

    public void process(T x, T y, Function<T> function) {
        System.out.println("Func_" + x.getClass().getSimpleName() + "( " + x + " , " + y + " ) = " + function.func(x, y));
    }
}
