
package com.bbva.hero2.beans;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "string",
    "rawAuthority",
    "rawFragment",
    "rawPath",
    "rawQuery",
    "rawSchemeSpecificPart",
    "rawUserInfo",
    "absolute",
    "opaque"
})
public class Uri {

    @JsonProperty("string")
    private String string;
    @JsonProperty("rawAuthority")
    private String rawAuthority;
    @JsonProperty("rawFragment")
    private String rawFragment;
    @JsonProperty("rawPath")
    private String rawPath;
    @JsonProperty("rawQuery")
    private String rawQuery;
    @JsonProperty("rawSchemeSpecificPart")
    private String rawSchemeSpecificPart;
    @JsonProperty("rawUserInfo")
    private String rawUserInfo;
    @JsonProperty("absolute")
    private Boolean absolute;
    @JsonProperty("opaque")
    private Boolean opaque;

    @JsonProperty("string")
    public String getString() {
        return string;
    }

    @JsonProperty("string")
    public void setString(String string) {
        this.string = string;
    }

    @JsonProperty("rawAuthority")
    public String getRawAuthority() {
        return rawAuthority;
    }

    @JsonProperty("rawAuthority")
    public void setRawAuthority(String rawAuthority) {
        this.rawAuthority = rawAuthority;
    }

    @JsonProperty("rawFragment")
    public String getRawFragment() {
        return rawFragment;
    }

    @JsonProperty("rawFragment")
    public void setRawFragment(String rawFragment) {
        this.rawFragment = rawFragment;
    }

    @JsonProperty("rawPath")
    public String getRawPath() {
        return rawPath;
    }

    @JsonProperty("rawPath")
    public void setRawPath(String rawPath) {
        this.rawPath = rawPath;
    }

    @JsonProperty("rawQuery")
    public String getRawQuery() {
        return rawQuery;
    }

    @JsonProperty("rawQuery")
    public void setRawQuery(String rawQuery) {
        this.rawQuery = rawQuery;
    }

    @JsonProperty("rawSchemeSpecificPart")
    public String getRawSchemeSpecificPart() {
        return rawSchemeSpecificPart;
    }

    @JsonProperty("rawSchemeSpecificPart")
    public void setRawSchemeSpecificPart(String rawSchemeSpecificPart) {
        this.rawSchemeSpecificPart = rawSchemeSpecificPart;
    }

    @JsonProperty("rawUserInfo")
    public String getRawUserInfo() {
        return rawUserInfo;
    }

    @JsonProperty("rawUserInfo")
    public void setRawUserInfo(String rawUserInfo) {
        this.rawUserInfo = rawUserInfo;
    }

    @JsonProperty("absolute")
    public Boolean getAbsolute() {
        return absolute;
    }

    @JsonProperty("absolute")
    public void setAbsolute(Boolean absolute) {
        this.absolute = absolute;
    }

    @JsonProperty("opaque")
    public Boolean getOpaque() {
        return opaque;
    }

    @JsonProperty("opaque")
    public void setOpaque(Boolean opaque) {
        this.opaque = opaque;
    }

}
