package com.wonder.mapper;

import java.util.List;

import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import com.wonder.model.Admin;

@Component
public interface  AdminMapper {
	String getAllAdmin = "SELECT admin.* FROM admin";

	@Select(getAllAdmin)
	@Results(value = {
			@Result(property = "adminId", column = "admin_id"),
			@Result(property = "adminName", column = "admin_name"),
			@Result(property = "adminPasswd", column = "admin_passwd"),
			@Result(property = "adminPower", column = "admin_power"),
	})
	public List<Admin> getAllAdmin();
	//	@Select(getAllArticlesInOneTag)
	//    @Results(value = {
	//            @Result(property = "id", column = "id"),
	//            @Result(property = "title", column = "title"),
	//            @Result(property = "post", column = "post"),
	//            @Result(property = "createdTime", column = "created_time"),
	//            @Result(property = "modifiedTime", column = "modified_time"),
	//            @Result(property = "tags", column="id", many=@Many(
	//                    select="org.ziwenxie.leafer.db.ArticleMapper.getAllTagsOfOneArticle")),
	//    })
	//    List<Article> getAllArticlesInOneTag(@Param("tagId") long tagId);
}
