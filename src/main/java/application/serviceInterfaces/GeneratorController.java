package application.serviceInterfaces;

import application.generators.AttributeRangeRuleGenerator;
import application.generators.BusinessRuleGenerator;
import domain.businessRules.AttributeRangeRule;
import domain.businessRules.BusinessRule;

public class GeneratorController {

    public String generateBusinessRuleQuery(AttributeRangeRule attributeRangeRule){
        AttributeRangeRuleGenerator attributeRangeRuleGenerator = new AttributeRangeRuleGenerator();
        return attributeRangeRuleGenerator.generateAttributeRangeRuleTrigger(attributeRangeRule);
    }
}
