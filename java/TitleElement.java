package io.quicktype;

import com.fasterxml.jackson.annotation.*;

public class TitleElement {
    private String description;
    private String[] possibleTitles;
    private String properName;
    private String value;

    @JsonProperty("description")
    public String getDescription() { return description; }
    @JsonProperty("description")
    public void setDescription(String value) { this.description = value; }

    @JsonProperty("possibleTitles")
    public String[] getPossibleTitles() { return possibleTitles; }
    @JsonProperty("possibleTitles")
    public void setPossibleTitles(String[] value) { this.possibleTitles = value; }

    @JsonProperty("properName")
    public String getProperName() { return properName; }
    @JsonProperty("properName")
    public void setProperName(String value) { this.properName = value; }

    @JsonProperty("value")
    public String getValue() { return value; }
    @JsonProperty("value")
    public void setValue(String value) { this.value = value; }
}
