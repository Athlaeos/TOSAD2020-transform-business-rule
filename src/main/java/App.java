import domain.businessRules.AttributeRangeRule;

public class App {
    public static void main( String[] args ){
        AttributeRangeRule attributeRangeRule = new AttributeRangeRule(true, "Test1", "Test2", "Test3", "Test4", "Test5", "Test6", "Test7", false, "Test8");
        System.out.println(attributeRangeRule.getDescription());
    }
}