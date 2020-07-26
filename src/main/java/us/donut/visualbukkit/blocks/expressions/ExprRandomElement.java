package us.donut.visualbukkit.blocks.expressions;

import us.donut.visualbukkit.blocks.ExpressionBlock;
import us.donut.visualbukkit.blocks.annotations.Description;
import us.donut.visualbukkit.blocks.syntax.SyntaxNode;
import us.donut.visualbukkit.plugin.BuildContext;

import java.util.List;

@Description({"Gets a random element from a list", "Returns: object"})
public class ExprRandomElement extends ExpressionBlock<Object> {

    @Override
    protected SyntaxNode init() {
        return new SyntaxNode("random element of", List.class);
    }

    @Override
    public String toJava() {
        BuildContext.addUtilMethod("getRandomElement");
        return "UtilMethods.getRandomElement(" + arg(0) + ")";
    }
}
