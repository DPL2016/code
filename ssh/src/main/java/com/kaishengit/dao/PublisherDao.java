package com.kaishengit.dao;

import com.kaishengit.pojo.Publisher;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

/**
 * Created by D on 2016/7/28.
 */
@Named
public class PublisherDao extends BaseDao<Publisher,Integer> {

}
