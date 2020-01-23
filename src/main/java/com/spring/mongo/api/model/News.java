package com.spring.mongo.api.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class News {
  @Id
  public ObjectId id;
 String newstitle;
 String description;
 String loc;
 String url;
 
// public News(ObjectId id, String newsId,String newstitle, String description, String loc, String url) {
//	 this.id = id;
//	 this.newstitle = newstitle;
//	 this.description = description;
//	 this.loc = loc;
 //  this.url = url;
//	 
// }

 



public String getId() {
	return id.toHexString();
}

public void setId(ObjectId id) {
	this.id = id;
}

public String getNewstitle() {
	return newstitle;
}


public void setNewstitle(String newstitle) {
	this.newstitle = newstitle;
}


public String getDescription() {
	return description;
}


public void setDescription(String description) {
	this.description = description;
}


public String getLoc() {
	return loc;
}


public void setLoc(String loc) {
	this.loc = loc;
}

public String getUrl() {
	return url;
}

public void setUrl(String url) {
	this.url = url;
}

@Override
public String toString() {
	return "News [newstitle=" + newstitle + ", description=" + description + ", loc=" + loc + ", url=" + url + "]";
}



 


}
