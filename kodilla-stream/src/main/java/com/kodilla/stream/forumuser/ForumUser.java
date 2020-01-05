package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {
    private final int id;
    private final String userName;
    private final char sex;
    private final LocalDate birthDate;
    private final int postNumber;

    public ForumUser(int id, String userName, char sex, int year, int month, int day, int postNumber) {
        this.id = id;
        this.userName = userName;
        this.sex = sex;
        this.birthDate = LocalDate.of(year,month,day);
        this.postNumber = postNumber;
    }

    public int getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getPostNumber() {
        return postNumber;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", sex=" + sex +
                ", birthDate=" + birthDate +
                ", postNumber=" + postNumber +
                '}';
    }
}
