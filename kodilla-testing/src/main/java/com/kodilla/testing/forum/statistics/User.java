package com.kodilla.testing.forum.statistics;

import java.util.*;

public class User {
    private String name;
    private String realName;
    private ArrayList<Post> posts = new ArrayList<>();
    private LinkedList<Comment> comments = new LinkedList<>();

    public User(String name, String realName) {
        this.name = name;
        this.realName = realName;
    }

    public void addPost(String author, String postBody){
        Post thePost = new Post(postBody, author);
        posts.add(thePost);
    }

    public void addComment(Post thePost, String author, String commentBody){
        Comment theComment = new Comment(thePost, commentBody, author);
        comments.add(theComment);
    }

    public int getPostsQuantity(){
        return posts.size();
    }

    public int getCommentsQuantity(){
        return comments.size();
    }

    public Post getPost(int postNumber){
        Post thePost = null;
        if (postNumber >= 0 && postNumber < posts.size()) {
            thePost = posts.get(postNumber);
        }
        return thePost;
    }

    public Comment getComment(int commentNumber){
        Comment theComment = null;
        if (commentNumber >= 0 && commentNumber < comments.size()){
            theComment = comments.get(commentNumber);
        }
        return theComment;
    }

    public boolean removePost(Post thePost){
        boolean result = false;
        if (posts.contains(thePost)){
            posts.remove(thePost);
            result = true;
        }
        return result;
    }

    public boolean removeComment(Comment theComment){
        boolean result = false;
        if (comments.contains(theComment)){
            comments.remove(theComment);
            result = true;
        }
        return result;
    }

    public String getName() {
        return name;
    }

    public String getRealName() {
        return realName;
    }
}