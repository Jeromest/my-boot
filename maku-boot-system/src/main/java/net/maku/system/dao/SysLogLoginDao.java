package net.maku.system.dao;

import net.maku.framework.common.dao.BaseDao;
import net.maku.system.entity.SysLogLoginEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 登录日志
 *
 * @author 阿沐 babamu@126.com
 */
@Mapper
public interface SysLogLoginDao extends BaseDao<SysLogLoginEntity> {

}