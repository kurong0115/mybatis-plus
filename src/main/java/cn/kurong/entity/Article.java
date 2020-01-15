package cn.kurong.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
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
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class Article  {

    private static final long serialVersionUID = 1L;

	/**
	 * 作者
	 */
	private String author;

	/**
	 * 内容
	 */
	private String content;

	/**
	 * 主键
	 */
	private Integer id;
}
