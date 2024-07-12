/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import javax.persistence.Entity;

/**
 *
 * @author The user
 */
@Entity
public class Book extends Item {

    private String author;
    private int publicationYear;
    private String publisher;

    public Book() {
    }

    public Book(String name, String author,int publicationYear,String publisher) {
        super(name);
        this.author = author;
        this.publisher=publisher;
        this.publicationYear=publicationYear;
    }

    public Book searchBookByID() {
        return null;

    }
//     public String toString()
//    {
//        return "The details of the book are: " + this.getName() + ", " + author + ", " + publicationYear + ", " + publisher ;
//    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    public String toString()
    {
        return super.toString()+" author:"+author+"  publisher:"+publisher+" publicationYear:"+publicationYear;
    }
     
    
    
}
