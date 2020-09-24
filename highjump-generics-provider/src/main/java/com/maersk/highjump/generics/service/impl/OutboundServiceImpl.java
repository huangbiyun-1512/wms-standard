package com.maersk.highjump.generics.service.impl;

import com.maersk.highjump.generics.service.OutboundService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.CachePut;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class OutboundServiceImpl implements OutboundService {

  @Override
  public void scaLoadedAck() {
    log.info("SCA loaded ack executing...");
  }

  @CachePut(key = "#key")
  @Override
  public Object updateCache(String key) {
    return "cache value";
  }

}