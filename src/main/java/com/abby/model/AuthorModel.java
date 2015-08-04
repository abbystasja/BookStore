package com.abby.model;

import com.abby.entity.Author;

import java.util.ArrayList;
import java.util.List;

public class AuthorModel {
    private List<Author> authors;

    public AuthorModel(){
        authors = new ArrayList<Author>();
        authors.add(new Author("Vasja", "Troja", 1991, "UA"));
        authors.add(new Author("Vasja1", "Troja1", 1992, "UA"));
        authors.add(new Author("Vasja2", "Troja2", 1993, "UA"));
        authors.add(new Author("Vasja3", "Troja3", 1994, "UA"));
        authors.add(new Author("Vasja4", "Troja4", 1995, "UA"));
        authors.add(new Author("Vasja5", "Troja5", 1996, "UA"));
        authors.add(new Author("Vasja6", "Troja6", 1997, "UA"));
        authors.add(new Author("Vasja7", "Troja7", 1998, "UA"));
        authors.add(new Author("Vasja8", "Troja8", 1999, "UA"));
    }

    public List<Author> getAllAuthors(){
        return authors;
    }

}
