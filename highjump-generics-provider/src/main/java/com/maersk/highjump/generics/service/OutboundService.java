package com.maersk.highjump.generics.service;

public interface OutboundService {

  void scaLoadedAck();
  Object updateCache(String key);
}
