package application.serviceInterfaces;

import domain.businessRules.AttributeRangeRule;

public class Controller {
    public Controller(){
    }

    public AttributeRangeRule createAttributeRangeRule(boolean notter, String operatorValue, String CompareValue, String CompareValue2, String name, String description, String when, String event, boolean forEachRow, String errorMessage, String tableName){
        AttributeRangeRule attributeRangeRule = new AttributeRangeRule(notter,operatorValue,CompareValue,CompareValue2,name,description,when,event,forEachRow,errorMessage,tableName);
        return attributeRangeRule;
    }

    public String generateAttributeRangeRuleQuery(AttributeRangeRule attributeRangeRule){
        GeneratorController generatorController = new GeneratorController();
        return generatorController.generateBusinessRuleQuery(attributeRangeRule);
    }
}
