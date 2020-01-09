package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public class Forum {
    private final List<ForumUser> forumUsers = new ArrayList<>();

    public Forum(){
        forumUsers.add(new ForumUser(1,"Marcin",'M',"1991-01-01",131));
        forumUsers.add(new ForumUser(2,"Sylwia",'F',"1990-02-03",1211));
        forumUsers.add(new ForumUser(3,"Maciej",'M',"2008-05-08",10));
        forumUsers.add(new ForumUser(4,"Dariusz",'M',"1984-12-12",137));
        forumUsers.add(new ForumUser(5,"Ewa",'F',"1974-11-05",357));
    }

    public List<ForumUser> getForumUsers() {
        return forumUsers;
    }
}


// dodac local date