package com.bookhub.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
@Table(name="book")
public class Book {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int bookId;
  private String title;
  private String author;
  private double price;

  // getters and setters
}
