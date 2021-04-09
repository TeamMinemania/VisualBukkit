package com.gmail.visualbukkit.blocks.definitions;

import com.gmail.visualbukkit.blocks.ClassInfo;
import com.gmail.visualbukkit.blocks.Expression;
import com.gmail.visualbukkit.blocks.parameters.ChoiceParameter;

public class ExprMathConstant extends Expression {

    public ExprMathConstant() {
        super("expr-math-constant", ClassInfo.DOUBLE);
    }

    @Override
    public Block createBlock() {
        return new Block(this, new ChoiceParameter("pi", "e")) {
            @Override
            public String toJava() {
                return "Math." + arg(0).toUpperCase();
            }
        };
    }
}