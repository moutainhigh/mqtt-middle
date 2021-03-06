package ac.cn.saya.mqtt.middle.repository;
import ac.cn.saya.mqtt.middle.entity.IotClientEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * Iot终端表(IotClient)表数据库访问层
 *
 * @author saya
 * @since 2020-07-19 13:24:33
 */
@Mapper
public interface IotClientDAO {

    /**
     * 查询Iot终端
     *
     * @param entity
     * @return 实例对象
     */
    public IotClientEntity query(IotClientEntity entity);

    /**
     * 下拉列表显示Iot终端
     * @param source 所属用户
     * @param keyWord 通过关键词，按照网关名或者设备名检索
     * @return
     */
    public List<IotClientEntity> querySelectList(@Param("source") String source,@Param("keyWord") String keyWord);

    /**
     * 通过网关查询Iot终端
     *
     * @param gatewayId
     * @return 实例对象
     */
    public List<IotClientEntity> queryByGatewayId(@Param("gatewayId") Integer gatewayId);

    /**
     * 分页查询Iot终端
     *
     * @param entity
     * @return 对象列表
     */
    public List<IotClientEntity> queryPage(IotClientEntity entity);


    /**
     * 查询Iot终端数量
     *
     * @param entity 实例对象
     * @return 对象列表
     */
    public Long queryCount(IotClientEntity entity);

    /**
     * 新增Iot终端
     *
     * @param iotClient 实例对象
     * @return 影响行数
     */
    public int insert(IotClientEntity iotClient);

    /**
     * 修改Iot终端
     *
     * @param iotClient 实例对象
     * @return 影响行数
     */
    public int update(IotClientEntity iotClient);

    /**
     * @描述 通过GatewayId修改设备信息
     * @参数  [iotClient]
     * @返回值  int
     * @创建人  shmily
     * @创建时间  2020/8/1
     * @修改人和其它信息
     */
    public int updateByGatewayId(IotClientEntity iotClient);

    /**
     * 删除Iot终端
     *
     * @param id 主键
     * @return 影响行数
     */
    public int deleteById(@Param("id") Integer id);

}