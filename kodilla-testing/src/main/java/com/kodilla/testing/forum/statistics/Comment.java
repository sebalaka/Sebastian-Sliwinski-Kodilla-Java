package com.kodilla.testing.forum.statistics;

public class Comment {
    Post forumPost;
    String commentBody;
    String author;

    public Comment(Post forumPost, String commentBody, String author) {
        this.forumPost = forumPost;
        this.commentBody = commentBody;
        this.author = author;
    }

    public Post getForumPost() {
        return forumPost;
    }

    public String getCommentBody() {
        return commentBody;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Comment)) return false;

        Comment that = (Comment) o;

        if (!forumPost.equals(that.forumPost)) return false;
        if (!commentBody.equals(that.commentBody)) return false;
        return author.equals(that.author);
    }

    @Override
    public int hashCode() {
        int result = forumPost.hashCode();
        result = 31 * result + commentBody.hashCode();
        result = 31 * result + author.hashCode();
        return result;
    }
}