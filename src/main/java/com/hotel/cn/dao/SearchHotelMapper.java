package com.hotel.cn.dao;

import com.hotel.cn.bean.HotelBean;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

/**
 * @author PVer
 */
@Mapper
public interface SearchHotelMapper {

    /**
     * 查询没有预定的房间
     *
     * @return
     */
    List<HotelBean> searchNoBook ();


}
