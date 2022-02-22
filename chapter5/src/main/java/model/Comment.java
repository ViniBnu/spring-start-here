package model;

public class Comment {

    String author;
    String text;

    public Comment(String author, String comment) {
        this.author = author;
        this.text = comment;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getText() {
        return text;
    }

    public void setComment(String comment) {
        this.text = comment;
    }
}
