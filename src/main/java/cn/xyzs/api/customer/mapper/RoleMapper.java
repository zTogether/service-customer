package cn.xyzs.api.customer.mapper;

import cn.xyzs.api.customer.pojo.TRole;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;
import java.util.Map;

@org.apache.ibatis.annotations.Mapper
public interface RoleMapper extends Mapper<TRole> {
    @Select("<script>SELECT S_NAME name,S_VAL_NEW valnew from XY_BJD_FCSJ_LIST</script>")
    List<Map<String,Object>> selectName();
}
