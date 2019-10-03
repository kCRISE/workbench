package com.hotel.cn.controller;

import com.hotel.cn.bean.HotelBean;
import com.hotel.cn.common.CommonResponse;
import com.hotel.cn.service.SearchHotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author PVer
 */
@RestController
public class OnLineSearchController {

    @Autowired
    private SearchHotelService searchHotelService;

    /**
     * 酒店房间查询
     *
     * @param startDate 开始日期
     * @param endDate   结束日期
     * @return
     */
    @RequestMapping("/searchresult")
    public CommonResponse onLineSearch (Integer startDate, Integer endDate) {
        if (startDate != 0 && endDate != 0) {
            List<HotelBean> list = new ArrayList<>();
            List<HotelBean> noBookList = searchHotelService.searchNoBook();
            for (HotelBean hotelBean : noBookList) {
                if (hotelBean.getHotelBookFlag() == 0) {
                    list.add(hotelBean);
                } else {
                    List<String> dateList = new ArrayList<>(Arrays.asList(hotelBean.getHotelBookDate().split(",")));
                    for (String string : dateList) {
                        if (true) {
                            list.add(hotelBean);
                        }
                    }
                }

            }
            if (!CollectionUtils.isEmpty(list)) {
                //查找到数据、返回到前端
                return new CommonResponse(true, list, 12);
            }
        }
        return new CommonResponse(false, "没有查询到数据");
    }

}
