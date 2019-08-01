package com.main.hyj.springmvc.v3.servlet.convert;

public class TypeActivity {

    private TypeStrategy typeStrategy;

    public TypeActivity(TypeStrategy promotionStrategy) {
        this.typeStrategy = promotionStrategy;
    }
    public Object execute(String value){
        return typeStrategy.doConvert(value);
    }
}
