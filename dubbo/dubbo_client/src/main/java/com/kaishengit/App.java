package com.kaishengit;

import com.kaishengit.service.SearchService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        SearchService searchService = (SearchService) applicationContext.getBean("searchService");
        searchService.showAllMovies();
        new Scanner(System.in).next();
    }
}
