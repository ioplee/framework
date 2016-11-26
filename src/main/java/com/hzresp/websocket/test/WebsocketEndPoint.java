/**   
* @Title: WebsocketEndPoint.java 
* @Package com.hzresp.websocket.test 
* @Description: TODO(用一句话描述该文件做什么) 
* @author robin
* @date 2016年11月26日 下午11:41:14 
* @version V1.0   
*/
package com.hzresp.websocket.test;

import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

/** 
 * @ClassName: WebsocketEndPoint 
 * @Description: websocket处理类 
 * @author robin
 * @date 2016年11月26日 下午11:41:14 
 *  
 */
public class WebsocketEndPoint extends TextWebSocketHandler {
	@Override
    protected void handleTextMessage(WebSocketSession session,TextMessage message) throws Exception {
        super.handleTextMessage(session, message);
        TextMessage returnMessage = new TextMessage(message.getPayload()+" received at server");
        session.sendMessage(returnMessage);
    }
}
