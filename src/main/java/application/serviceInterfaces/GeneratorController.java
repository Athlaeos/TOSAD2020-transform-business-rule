package application.serviceInterfaces;

import application.generators.AttributeRangeRuleGenerator;
import domain.businessRules.AttributeRangeRule;

public class GeneratorController {

    public GeneratorController(){
    }

    public AttributeRangeRuleGenerator generateAttributeRangeRuleGenerator(){
        return new AttributeRangeRuleGenerator();
    }

    public String generateBusinessRuleTriggerQuery(AttributeRangeRule attributeRangeRule){
        return generateAttributeRangeRuleGenerator().generateAttributeRangeRuleTrigger(attributeRangeRule);
    }

    public String generateBusinessRuleConstraintrQuery(AttributeRangeRule attributeRangeRule){
        return generateAttributeRangeRuleGenerator().generateAttributeRangeRuleContstraint(attributeRangeRule);
    }
}