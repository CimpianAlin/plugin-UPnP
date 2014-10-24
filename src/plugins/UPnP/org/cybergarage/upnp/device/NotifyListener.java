/******************************************************************
*
*   CyberUPnP for Java
*
*   Copyright (C) Satoshi Konno 2002
*
*   File: DeviceNotifyListener.java
*
*   Revision;
*
*   11/18/02
*       - first revision.
*
******************************************************************/


package plugins.UPnP.org.cybergarage.upnp.device;

import plugins.UPnP.org.cybergarage.upnp.ssdp.*;

public interface NotifyListener {
    public void deviceNotifyReceived(SSDPPacket ssdpPacket);
}
