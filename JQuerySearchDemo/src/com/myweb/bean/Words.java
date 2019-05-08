package com.myweb.bean;

public class Words {
    private String words;
    private int id;

    public Words() {
    }

    public Words(String words, int id) {
        this.words = words;
        this.id = id;
    }

    public String getWords() {
        return words;
    }

    public void setWords(String words) {
        this.words = words;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Words{" +
                "words='" + words + '\'' +
                ", id=" + id +
                '}';
    }
}
