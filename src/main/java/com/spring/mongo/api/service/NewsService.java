package com.spring.mongo.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.mongo.api.model.News;
import com.spring.mongo.api.repository.NewsRepository;
@Service
public class NewsService {

//@Autowired
//	private NewsRepository NewsRepository;
//	
//public News create(String newstitle, String discription, String loc) {
//	return NewsRepository.save(new News(newstitle, discription, loc));
//	
//}
//
//public List<News> getAll(){
//	return NewsRepository.findAll();	
//}
//
//public News getBynewstitle(String newstitle) {
//	return NewsRepository.findBynewstitle(newstitle);
//}
//
//public News update(String newstitle, String discription, String loc) {
//	News n = NewsRepository.findBynewstitle(newstitle);
//	n.setDiscription(discription);
//	n.setLoc(loc);
//	return NewsRepository.save(n);
//	
//}
//
////Delete operation
//
//public void deleteAll() {
//	NewsRepository.deleteAll();
//}
//
//public void delete(String newstitle) {
//	News n = NewsRepository.findBynewstitle(newstitle);
//	NewsRepository.delete(n);
//}
}
