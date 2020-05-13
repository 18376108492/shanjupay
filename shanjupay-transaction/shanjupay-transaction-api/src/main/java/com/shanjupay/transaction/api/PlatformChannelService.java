package com.shanjupay.transaction.api;
import com.shanjupay.transaction.api.dto.PayChannelParamDTO;
import com.shanjupay.transaction.api.dto.PlatformChannelDTO;
import com.shanjupay.transaction.entity.PlatformChannel;

import java.util.List;


public interface PlatformChannelService {

    /**
     * 查询平台的服务类型
     * @return
     */
    List<PlatformChannelDTO> getAllPlatformChannel();

}
