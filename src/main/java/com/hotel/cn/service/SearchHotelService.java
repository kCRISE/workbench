package com.hotel.cn.service;

import com.hotel.cn.bean.HotelBean;
import com.hotel.cn.dao.SearchHotelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;

/**
 * @author PVer
 */
@Service
public class SearchHotelService {

    @Autowired
    private SearchHotelMapper searchHotelMapper;

    public List<HotelBean> searchNoBook () {
        return searchHotelMapper.searchNoBook();
    }

    public List<HotelBean> getSearchResult (Integer startDate, Integer endDate) {
        return searchHotelMapper.searchHotel(startDate, endDate);
    }

}
