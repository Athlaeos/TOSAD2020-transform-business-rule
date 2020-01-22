package domain.businessRules;

public class AttributeRangeRule {
    private boolean notter;
    private String operatorValue;
    private String CompareValue;
    private String CompareValue2;

    public AttributeRangeRule(boolean notter, String operatorValue, String CompareValue, String CompareValue2){
        this.notter = notter;
        this.operatorValue = operatorValue;
        this.CompareValue = CompareValue;
        this.CompareValue2 = CompareValue2;
    }

}
