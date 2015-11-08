package hr.mapperdao;

import hr.entity.SysRoleRight;
import hr.entity.SysRoleRightExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysRoleRightMapper {
    int countByExample(SysRoleRightExample example);

    int deleteByExample(SysRoleRightExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SysRoleRight record);

    int insertSelective(SysRoleRight record);

    List<SysRoleRight> selectByExample(SysRoleRightExample example);

    SysRoleRight selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SysRoleRight record, @Param("example") SysRoleRightExample example);

    int updateByExample(@Param("record") SysRoleRight record, @Param("example") SysRoleRightExample example);

    int updateByPrimaryKeySelective(SysRoleRight record);

    int updateByPrimaryKey(SysRoleRight record);
}