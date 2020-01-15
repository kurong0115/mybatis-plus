package cn.kurong.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author Rong Ku
 * @since 2020-01-15
 */
@Data
@Accessors(chain = true)
public class User {

    private static final long serialVersionUID = 1L;

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
    private Integer age;

    /**
     * 邮箱
     */
    private String email;

}
