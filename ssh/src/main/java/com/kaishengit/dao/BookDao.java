package com.kaishengit.dao;

import com.kaishengit.pojo.Book;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;

import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.Id;
import java.util.List;

@Named
public class BookDao extends BaseDao<Book,Integer> {

}
