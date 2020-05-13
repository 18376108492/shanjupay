package com.shanjupay.transaction.service;

import com.shanjupay.transaction.api.PlatformChannelService;
import com.shanjupay.transaction.api.dto.PlatformChannelDTO;
import com.shanjupay.transaction.convert.PayChannelParamConvert;
import com.shanjupay.transaction.convert.PlatformChannelConvert;
import com.shanjupay.transaction.entity.PlatformChannel;
import com.shanjupay.transaction.entity.PlatformPayChannel;
import com.shanjupay.transaction.mapper.PlatformChannelMapper;
import com.shanjupay.transaction.mapper.PlatformPayChannelMapper;
import lombok.extern.log4j.Log4j2;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Log4j2
@Service
public class ChannelServiceImpl implements PlatformChannelService {




    @Autowired
    private PlatformChannelMapper platformChannelMapper;

    @Override
    public List<PlatformChannelDTO> getAllPlatformChannel() {
        List<PlatformChannel> platformChannels = platformChannelMapper.selectList(null);
        //数据装换
        return PlatformChannelConvert.INSTANCE.listentity2listdto(platformChannels);
    }



}
