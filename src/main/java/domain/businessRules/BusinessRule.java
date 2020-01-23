package domain.businessRules;

public abstract class BusinessRule {
    private String name;
    private String description;
    private String when;
    private String event;
    private boolean forEachRow;
    private String errorMessage;
    private String tableName;

    public BusinessRule(String name, String description, String when, String event, boolean forEachRow, String errorMessage, String tableName){
        this.name = name;
        this.description = description;
        this.when = when;
        this.event = event;
        this.forEachRow = forEachRow;
        this.errorMessage = errorMessage;
        this.tableName = tableName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getWhen() {
        return when;
    }

    public void setWhen(String when) {
        this.when = when;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public boolean isForEachRow() {
        return forEachRow;
    }

    public void setForEachRow(boolean forEachRow) {
        this.forEachRow = forEachRow;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getTableName() { return this.tableName; }
}

