package application.serviceInterfaces;

import application.generators.AttributeRangeRuleGenerator;
import domain.businessRules.AttributeRangeRule;

public class GeneratorController {

    public GeneratorController(){
    }

    public String generateBusinessRuleQuery(AttributeRangeRule attributeRangeRule){
        AttributeRangeRuleGenerator attributeRangeRuleGenerator = new AttributeRangeRuleGenerator();
        return attributeRangeRuleGenerator.generateAttributeRangeRuleTrigger(attributeRangeRule);
    }
}