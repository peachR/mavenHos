package com.Dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.model.Group;

public interface GroupDao {
	public List<Group> getGroup();
	public int addNewGroup(@Param("group")Group group);
	public void fillNewGroup(@Param("groupID")int groupID, @Param("identity")Map<Integer,Integer>identity);
	public void updateGroupName(@Param("group")Group group);
	public void deleteGroupMember(@Param("groupID")int groupID);
	public void changeGroupMember(@Param("group")Group group);
}
