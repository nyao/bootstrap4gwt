package com.github.nyao.bootstrap4gwt.client.ui;

public enum GridSize {

    Span1("span1"),
    Span2("span2"),
    Span3("span3"),
    Span4("span4"),
    Span5("span5"),
    Span6("span6"),
    Span7("span7"),
    Span8("span8"),
    Span9("span9"),
    Span10("span10"),
    Span11("span11"),
    Span12("span12"),
    ;
    
    private String value;

    private GridSize(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
