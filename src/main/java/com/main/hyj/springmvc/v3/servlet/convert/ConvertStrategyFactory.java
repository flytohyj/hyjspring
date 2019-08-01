package com.main.hyj.springmvc.v3.servlet.convert;

import java.util.HashMap;
import java.util.Map;

public class ConvertStrategyFactory {

    private static Map<Object,TypeStrategy> map = new HashMap<Object,TypeStrategy>();

    static {
        map.put(ConvertKey.Integer,new IntegerTypeStrategy());
        map.put(ConvertKey.Long,new LongTypeStrategy());
        map.put(ConvertKey.Double,new DoubleTypeStrategy());
    }

    private  ConvertStrategyFactory(){

    }

    public static TypeStrategy getConvertStrategy(Class<?> strategy){
        TypeStrategy typeStrategy = map.get(strategy);
        return typeStrategy == null ? new EmptyStrategy() : typeStrategy;
    }
    private interface ConvertKey{
        Object Integer = Integer.class;
        Object Long = Long.class;
        Object Double = Double.class;
    }
}
