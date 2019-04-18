package com.fakeghost.bbs.model;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PostMapper{
    List<Post> posts(@Param("offset")int offset, @Param("limit")int limit);
    Post pick(@Param("id") int id);
    void submit(@Param("title")String title, @Param("author")String author, @Param("createTime")String createTime, @Param("category")String category, @Param("content") String content);
}

