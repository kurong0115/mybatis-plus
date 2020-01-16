package cn.kurong.common;

import com.baomidou.mybatisplus.core.enums.IEnum;
import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * @ClassName AgeEnum
 * @Description 年龄枚举
 * @Author Administrator
 * @Date 2020/1/16 9:15
 * @Version 1.0
 */
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum AgeEnum implements IEnum<Integer> {

	/**
	 *
	 */
	TWENTY_ONE(21, "21岁");

	private final Integer code;

	private final String message;

	AgeEnum(Integer code, String message) {
		this.code = code;
		this.message = message;
	}

	@Override
	public Integer getValue() {
		return this.code;
	}

	@Override
	public String toString() {
		return "AgeEnum{" +
				"code=" + code +
				", message='" + message + '\'' +
				'}';
	}
}
