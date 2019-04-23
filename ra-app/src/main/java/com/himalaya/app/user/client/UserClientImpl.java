package com.himalaya.app.user.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.himalaya.app.common.client.AbstractBaseClient;
import com.himalaya.app.user.domain.UserCondition;
import com.himalaya.app.user.domain.UserDO;
import com.himalaya.app.user.service.UserService;
import com.himalaya.common.dto.PageDTO;
import com.himalaya.ra.facade.user.client.UserClient;
import com.himalaya.user.dto.UserDTO;

@RestController
public class UserClientImpl extends AbstractBaseClient implements UserClient{
	
	@Autowired
	UserService userService;

	@Override
	public UserDTO getUserById(@PathVariable("id") Long id) {
		
		UserDO userDO = userService.selectByID(id);
		UserDTO userDTO = dozerMapper.map(userDO, UserDTO.class);
		return userDTO;
	}

	@Override
	public PageDTO<UserDTO> getUserByCondition(UserDTO userDTO) {
		UserCondition condition = dozerMapper.map(userDTO, UserCondition.class);
		PageDTO<UserDO> pageDTO = userService.queryByPage(condition);
		PageDTO<UserDTO> returnPageDTO = super.dozerMapperPage(pageDTO, UserDTO.class);
		return returnPageDTO;
	}
	
	@GetMapping("/")
	public String index() {
		return "Risk analystic application is running....";
	}
	
}
