package com.kaishengit.dao;

import com.kaishengit.pojo.BookType;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

@Named
public class BookTypeDao extends BaseDao<BookType,Integer>{

}
