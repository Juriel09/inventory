package com.vanilla.inventory.service.implv1;

import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.vanilla.inventory.entity.Users;
import com.vanilla.inventory.repository.UserRepository;
import com.vanilla.inventory.service.UserService;


@Service
public class UserServiceImpl implements UserService{

	
	@Autowired
	UserRepository userRepo;
	
	public void saveUser() {
		Users user = Users.builder().first_name("juriel").last_name("jamilla").user_name("juriel09").password("hehehee09").build(); 
		userRepo.save(user);
	}
}
