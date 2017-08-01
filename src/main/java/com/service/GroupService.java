package com.service;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Dao.GroupDao;
import com.model.Group;
import com.model.User;

@Service
public class GroupService {
	@Autowired
	private GroupDao groupDao;
	
	public List<Group> getAllGroup(){
		return groupDao.getGroup();
	}
	
	public void addNewGroup(String name, List<Integer>member){
		Group group = new Group();
		group.setName(name);
		groupDao.addNewGroup(group);
		int gid = group.getGroupID();
		Map<Integer,Integer> identity = new HashMap<>();
		for(int i = 0;i < member.size();i++){
			if(i == 0)
				identity.put(member.get(i), 1);
			else if(i == 1)
				identity.put(member.get(i), 2);
			else
				identity.put(member.get(i), 3);
		}	
		groupDao.fillNewGroup(gid, identity);
	}
	
	public void changeGroup(int groupID, String name, List<Integer> member){
		Group g = new Group();
		g.setGroupID(groupID);
		g.setName(name);
		List<User> list = new LinkedList<>();
		for(Integer id : member){
			User user = new User();
			user.setId(id);
			list.add(user);
		}
		g.setMember(list);
		Map<Integer,Integer> identity = new HashMap<>();
		for(int i = 0;i < member.size();i++){
			identity.put(member.get(i), (i < 2 ? (i + 1) : 3));
		}
		groupDao.updateGroupName(g);
		groupDao.deleteGroupMember(groupID);
		groupDao.fillNewGroup(groupID, identity);
	}
}
