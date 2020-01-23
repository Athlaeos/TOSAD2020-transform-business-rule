import application.serviceInterfaces.Controller;
import domain.businessRules.AttributeRangeRule;

import java.io.IOException;

public class App {
    public static void main( String[] args ){
        String defineInput = "{" +
                "\"notter\": true," +
                "\"operatorValue\": \"Test1\"," +
                "\"compareValue\": \"10\"," +
                "\"compareValue2\": \"100\"," +
                "\"name\": \"between10And100\"," +
                "\"description\": \"check if value is between 10 and 100\"," +
                "\"when\": \"before\"," +
                "\"event\": \"update,insert\"," +
                "\"forEachRow\": false," +
                "\"ErrorMessage\": \"Error message\"," +
                "\"tableName\": \"Tabelnaam\"" +
                "}";
        Controller controller = new Controller();
        AttributeRangeRule attributeRangeRule = null;
        attributeRangeRule = controller.mapToRangeRule(defineInput);
//        AttributeRangeRule attributeRangeRule = controller.createAttributeRangeRule(true,"test1","test2","test3","test4","test5","test6","test7",true,"test8","test9");
        System.out.println(controller.generateAttributeRangeRuleTriggerQuery(attributeRangeRule));
        System.out.println(controller.generateAttributeRangeRuleConstraintQuery(attributeRangeRule));
    }
}