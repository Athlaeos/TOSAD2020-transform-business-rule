import domain.businessRules.AttributeRangeRule;
import application.serviceInterfaces.Controller;

public class App {
    public static void main( String[] args ){
        Controller controller = new Controller();
        AttributeRangeRule attributeRangeRule = controller.createAttributeRangeRule(true, "Test1", "Test2", "Test3", "Test4", "Test5", "Test6", "Test7", false, "Test8");
        controller.generateAttributeRangeRuleQuery(attributeRangeRule);
        System.out.println(attributeRangeRule.getDescription());
    }
}