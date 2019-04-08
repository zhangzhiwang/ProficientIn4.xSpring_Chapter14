package com.asiainfo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asiainfo.dao.interfaces.IForumDao;
import com.asiainfo.entity.Forum;

@Service
public class ForumServiceImpl {
	@Autowired
	private IForumDao forumDao;
	
	public Forum getForumById(int forumId) {
		return forumDao.getForumById(1);
	}
	
	public int addForum(Forum forum) {
		return forumDao.addForum(forum);
	}
}
