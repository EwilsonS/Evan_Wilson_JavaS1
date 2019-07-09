package com.evanco.model;

import javax.validation.constraints.NotEmpty;

public class Answer {

    // Annotation to indicate non empty field. Activated with use of @Valid annotation in controller
    @NotEmpty(message = "You must ask a question, preferably a yes/no question")
    // Properties
    private String question;
    private String answer;

    // Getters and setters
    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
