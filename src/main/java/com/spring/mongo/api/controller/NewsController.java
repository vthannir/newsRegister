package com.spring.mongo.api.controller;
import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.mongo.api.model.News;
import com.spring.mongo.api.repository.NewsRepository;


@RestController
@RequestMapping("/news")

public class NewsController {
	
 @Autowired	
private NewsRepository repository;

 
	
// @RequestMapping(value = "/", method = RequestMethod.GET)
 @GetMapping("/")
public List<News> getAllNews() {
 return repository.findAll();
 }
 @GetMapping("/{id}")
 public News getNewsById(@PathVariable("id") ObjectId id) {
   return repository.findByid(id);
 }
 
 @PostMapping("/addNews")
 public String save(@RequestBody News news) {
	  repository.save(news);
       return news.getId();
       
   
 }
 
 @PutMapping("/{id}")
 public void updateNews(@PathVariable("id") ObjectId id, @RequestBody News news) {
	 News oldNews = repository.findByid(id);
	 oldNews.setLoc(news.getLoc());
	 oldNews.setNewstitle(news.getNewstitle());
	 oldNews.setUrl(news.getUrl());
	 oldNews.setDescription(news.getDescription());
	 repository.save(oldNews);
 }
 
 @DeleteMapping("/{id}")
 public void deleteNews(@PathVariable("id") ObjectId id) {
	 repository.deleteById(id.toString());
 }
 
 
	  
 
// @RequestMapping(value = "/{newstitle}", method = RequestMethod.GET)
//public News getNewsByNewsTitle(@PathVariable("newstitle") String newsTitle ) {
//return repository.findBynewstitle(newsTitle);

// }
 
 
}
