package com.netease.nim.im.server.sdk.v2.broadcast;

/**
 * URL context for broadcast notification API V2
 */
public class BroadcastUrlContextV2 {


    /**
     * URL for sending broadcast notification
     */
    public static final String BROADCAST_NOTIFICATION = "/im/v2/broadcast_notification";
    
    /**
     * URL for deleting broadcast notification
     */
    public static final String DELETE_BROADCAST_NOTIFICATION = "/im/v2/broadcast_notification/{broadcast_id}";
    
    /**
     * URL for querying broadcast notification
     */
    public static final String QUERY_BROADCAST_NOTIFICATION = "/im/v2/broadcast_notification/{broadcast_id}";
    
    /**
     * URL for sending chatroom broadcast notification
     */
    public static final String CHATROOM_BROADCAST_NOTIFICATION = "/im/v2/broadcast_notification/actions/chatroom";
} 