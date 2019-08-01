package com.main.hyj.springmvc.v3.servlet.convert;

public class EmptyStrategy implements TypeStrategy{
    @Override
    public Object doConvert(String value) {
        return value;
    }
}
