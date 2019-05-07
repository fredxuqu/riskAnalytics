package com.himalaya.app.user.client;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.himalaya.app.common.client.AbstractBaseClient;
import com.himalaya.app.user.domain.SysUserCondition;
import com.himalaya.app.user.domain.SysUserDO;
import com.himalaya.app.user.service.SysUserService;
import com.himalaya.common.dto.AppResponse;
import com.himalaya.common.dto.PageDTO;
import com.himalaya.common.enums.AppErrorEnum;
import com.himalaya.ra.facade.user.client.SysUserClient;
import com.himalaya.user.dto.SysUserConditionDTO;
import com.himalaya.user.dto.SysUserDTO;

@RestController
public class SysUserClientImpl extends AbstractBaseClient implements SysUserClient{
	
	@Autowired
	SysUserService userService;

	@Override
	public AppResponse<SysUserDTO> getUserById(@PathVariable("id") Long id) {
		
		try {
			SysUserDO userDO = userService.selectByID(id);
			SysUserDTO userDTO = dozerMapper.map(userDO, SysUserDTO.class);
			return AppResponse.newSuccess(userDTO);
		} catch (Exception e) {
			return AppResponse.newFail(AppErrorEnum.E000);
		}
	}

	@Override
	public AppResponse<List<SysUserDTO>> getUserByCondition(@RequestBody SysUserConditionDTO userConditionDTO) {
		SysUserCondition condition = dozerMapper.map(userConditionDTO, SysUserCondition.class);
		PageDTO<SysUserDO> pageDTO = userService.queryByPage(condition);
		PageDTO<SysUserDTO> returnPageDTO = super.dozerMapperPage(pageDTO, SysUserDTO.class);
		return AppResponse.newSuccess(returnPageDTO.getDatas());
	}
	
	@GetMapping("/")
	public String index() {
		return "Risk analystic application is running....";
	}
}
