package com.kodilla.testing.forum.statistics;

public class calculateAdvStatistics {

    Statistics statistics;

    public calculateAdvStatistics(Statistics statistics) {
        this.statistics = statistics;
    }

    public int getUserCount() {
        return this.statistics.usersNames().size();
    }

    public int getPostsCount() {
        return this.statistics.postsCount();
    }

    public int getCommentsCount() {
        return this.statistics.commentsCount();
    }

    public double averagePostPerUser(double postsQuantity, double usersQuantity) {
        if (usersQuantity == 0) {
            return 0;
        } else {
            return postsQuantity / usersQuantity;
        }
    }

    public double averageCommentsPerUser(double commentsQuantity, double usersQuantity) {
        if (usersQuantity == 0) {
            return 0;
        } else {
            return commentsQuantity / usersQuantity;
        }
    }

    public double averageCommentsPerPost(double commentsQuantity, double postsQuantity) {
        if (postsQuantity == 0) {
            return 0;
        } else {
            return commentsQuantity / postsQuantity;
        }
    }
}