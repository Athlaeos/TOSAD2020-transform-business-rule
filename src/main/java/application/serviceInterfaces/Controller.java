package application.serviceInterfaces;

import domain.businessRules.AttributeRangeRule;

public class Controller {
    public Controller(){
    }

    public AttributeRangeRule createAttributeRangeRule(boolean notter, String operatorValue, String CompareValue, String CompareValue2, String name, String description, String when, String event, boolean forEachRow, String errorMessage, String tableName){
        AttributeRangeRule attributeRangeRule = new AttributeRangeRule(notter,operatorValue,CompareValue,CompareValue2,name,description,when,event,forEachRow,errorMessage,tableName);
        return attributeRangeRule;
    }

    public GeneratorController generatorController(){
        return new GeneratorController();

    }

    public String generateAttributeRangeRuleTriggerQuery(AttributeRangeRule attributeRangeRule){
        return generatorController().generateBusinessRuleTriggerQuery(attributeRangeRule);
    }

    public String generateAttributeRangeRuleConstraintQuery(AttributeRangeRule attributeRangeRule){
        return generatorController().generateBusinessRuleConstraintrQuery(attributeRangeRule);
    }
}
