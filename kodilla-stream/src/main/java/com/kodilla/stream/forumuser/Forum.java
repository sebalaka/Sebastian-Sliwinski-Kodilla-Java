package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

public class Forum {
    private final List<ForumUser> forumUsers = new ArrayList<>();

    public Forum(){
        forumUsers.add(new ForumUser(1,"Marcin",'M',2002,12,1,131));
        forumUsers.add(new ForumUser(2,"Sylwia",'F',1990,3,22,1211));
        forumUsers.add(new ForumUser(3,"Maciej",'M',1998,4,14,10));
        forumUsers.add(new ForumUser(4,"Dariusz",'M',1981,7,2,137));
        forumUsers.add(new ForumUser(5,"Ewa",'F',2000,3,12,357));
    }

    public List<ForumUser> getForumUsers() {
        return forumUsers;
    }
}


// dodac local date