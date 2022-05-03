package com.github.dadjokes;

import javax.persistence.*;

@Entity
@Table(name = "jokes", schema = "dadjokes", catalog = "dadjokes")
public class DadJokeEntity {
    private long id;
    private String question;
    private String answer;

    @Id
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "question")
    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    @Basic
    @Column(name = "answer")
    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
