package com.chl.vo;


import com.chl.pojo.Goods;
import lombok.Data;

import java.util.Date;

@Data
public class GoodsVo extends Goods {
	private Double miaoshaPrice;
	private Integer stockCount;
	private Date startDate;
	private Date endDate;

}
