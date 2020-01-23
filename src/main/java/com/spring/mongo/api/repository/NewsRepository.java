package com.spring.mongo.api.repository;

import java.util.List;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.spring.mongo.api.model.News;




@Repository
public interface NewsRepository extends MongoRepository<News, String> {
 News findByid(ObjectId id);
 
 
//public News findBynewsId(String id);
 public News findBynewstitle(String newstitle); 
  List<News> findAll();

  
  
//	public news findBynewstitle(String newstitle);
//	public news findByloc(String loc);
	
	
}