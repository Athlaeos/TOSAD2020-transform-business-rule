package application.generators;

import domain.businessRules.AttributeRangeRule;

public abstract class BusinessRuleGenerator {

    public BusinessRuleGenerator(){

    }

    public String generateTrigger(AttributeRangeRule attributeRangeRule) {
        AttributeRangeRuleGenerator attributeRangeRuleGenerator = new AttributeRangeRuleGenerator();
        return attributeRangeRuleGenerator.generateAttributeRangeRuleTrigger(attributeRangeRule);
    }
}