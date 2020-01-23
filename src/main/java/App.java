import application.serviceInterfaces.Controller;
import domain.businessRules.AttributeRangeRule;

public class App {
    public static void main( String[] args ){
        Controller controller = new Controller();
        AttributeRangeRule attributeRangeRule = controller.createAttributeRangeRule(true,"test1","test2","test3","test4","test5","test6","test7",true,"test8","test9");
        System.out.println(controller.generateAttributeRangeRuleTriggerQuery(attributeRangeRule));
        System.out.println(controller.generateAttributeRangeRuleConstraintQuery(attributeRangeRule));
    }
}