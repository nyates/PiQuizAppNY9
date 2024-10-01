package org.baltimorecityschools.piquizappny;

public class Question {

    private String qText;
    private boolean correctAns;

    public Question() {
        qText = "";
        correctAns = false;
    }

    public Question(String qText, boolean correctAns) {
        this.qText = qText;
        this.correctAns = correctAns;
    }

    public String getqText() {
        return qText;
    }

    public void setqText(String qText) {
        this.qText = qText;
    }

    public boolean isCorrectAns() {
        return correctAns;
    }

    public void setCorrectAns(boolean correctAns) {
        this.correctAns = correctAns;
    }

    @Override
    public String toString() {
        return "Question{" +
                "qText='" + qText + '\'' +
                ", correctAns=" + correctAns +
                '}';
    }
}
