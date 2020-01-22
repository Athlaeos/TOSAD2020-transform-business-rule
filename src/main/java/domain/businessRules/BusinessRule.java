package domain.businessRules;

public abstract class BusinessRule {
    private String name;
    private String description;
    private String when;
    private String event;
    private boolean forEachRow;
    private String errorMessage;

    public BusinessRule(String name, String description, String when, String event, boolean forEachRow, String errorMessage){
        this.name = name;
        this.description = description;
        this.when = when;
        this.event = event;
        this.forEachRow = forEachRow;
        this.errorMessage = errorMessage;
    }

}

