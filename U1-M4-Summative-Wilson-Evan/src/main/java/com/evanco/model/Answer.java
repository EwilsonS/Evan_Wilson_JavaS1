package com.evanco.model;

import javax.validation.constraints.NotEmpty;

public class Answer {
    @NotEmpty(message = "You must ask a question, preferably a yes/no question")
    private String question;
    private String answer;

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
