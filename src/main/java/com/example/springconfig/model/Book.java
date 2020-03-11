package com.example.springconfig.model;

import lombok.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;


@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Component
@ConfigurationProperties(prefix = "book")
public class Book {
    private String name;
    private String isdn;
    private String author;
    @Value(value = "${book.description}")
    private String desc;
    private Float price;


}
