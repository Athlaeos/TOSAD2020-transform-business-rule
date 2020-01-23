package application.serviceInterfaces;

import domain.businessRules.AttributeRangeRule;

public class Controller {
    private String generatedBusinessRule;
    private AttributeRangeRule attributeRangeRule;

    public Controller(){

    }

    public AttributeRangeRule createAttributeRangeRule(boolean notter, String operatorValue, String CompareValue, String CompareValue2, String name, String description, String when, String event, boolean forEachRow, String errorMessage){
        AttributeRangeRule attributeRangeRule = new AttributeRangeRule(notter,operatorValue,CompareValue,CompareValue2,name,description,when,event,forEachRow,errorMessage);
        return attributeRangeRule;
    }

    public String generateAttributeRangeRuleQuery(AttributeRangeRule attributeRangeRule){
        GeneratorController generatorController = new GeneratorController();
        return generatorController.generateBusinessRuleQuery(attributeRangeRule);
    }
}
