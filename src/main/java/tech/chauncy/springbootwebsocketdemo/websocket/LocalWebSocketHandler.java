package tech.chauncy.springbootwebsocketdemo.websocket;

import org.apache.log4j.Logger;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

public class LocalWebSocketHandler extends TextWebSocketHandler {
	private Logger logger = Logger.getLogger(LocalWebSocketHandler.class);

	@Override
	public void afterConnectionEstablished(WebSocketSession session) throws Exception {
		logger.info("Connection established!");
		logger.info("Session id:" + session.getId());
		logger.info("get local address:" + session.getLocalAddress());
		logger.info("get uri:" + session.getUri());
	}

	@Override
	public void handleMessage(WebSocketSession session, WebSocketMessage<?> message)
			throws Exception {
		logger.info("get message:" + message.toString());
		super.handleMessage(session, message);
	}

	@Override
	protected void handleTextMessage(WebSocketSession session, TextMessage message)
			throws Exception {
		logger.info("get txt message:" + message.toString());
		super.handleTextMessage(session, message);
	}

	@Override
	public void afterConnectionClosed(WebSocketSession session, CloseStatus status)
			throws Exception {
		logger.info("Connection closed! status:" + status.toString());
		super.afterConnectionClosed(session, status);
	}
	
	
}
