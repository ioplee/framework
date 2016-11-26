/**   
* @Title: HandshakeInterceptor.java 
* @Package com.hzresp.websocket.test 
* @Description: TODO(用一句话描述该文件做什么) 
* @author robin
* @date 2016年11月26日 下午11:42:23 
* @version V1.0   
*/
package com.hzresp.websocket.test;

import java.util.Map;

import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.server.support.HttpSessionHandshakeInterceptor;

/** 
 * @ClassName: HandshakeInterceptor 
 * @Description: 握手拦截器(optional)
 * @author robin
 * @date 2016年11月26日 下午11:42:23 
 *  
 */
public class HandshakeInterceptor extends HttpSessionHandshakeInterceptor {
	@Override
    public boolean beforeHandshake(ServerHttpRequest request,
            ServerHttpResponse response, WebSocketHandler wsHandler,
            Map<String, Object> attributes) throws Exception {
        System.out.println("Before Handshake");
        return super.beforeHandshake(request, response, wsHandler, attributes);
    }

    @Override
    public void afterHandshake(ServerHttpRequest request,
            ServerHttpResponse response, WebSocketHandler wsHandler,
            Exception ex) {
        System.out.println("After Handshake");
        super.afterHandshake(request, response, wsHandler, ex);
    }
}
