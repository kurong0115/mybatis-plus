package cn.kurong.entity;

import cn.kurong.common.AgeEnum;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @ClassName UserEntity
 * @Description 用户实体类
 * @Author Administrator
 * @Date 2020/1/16 9:18
 * @Version 1.0
 */
@Data
@Accessors(chain = true)
@TableName(value = "user")
public class UserEntity {

	/**
	 * 主键
	 */
	@TableId(type = IdType.AUTO)
	private Integer id;

	/**
	 * 姓名
	 */
	private String name;

	/**
	 * 年龄
	 */
	private AgeEnum age;

	/**
	 * 邮箱
	 */
	private String email;
}
