package com.kaishengit.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.dom4j.DocumentException;

import com.kaishengit.pojo.TextMessage;
import com.kaishengit.util.CheckUtil;
import com.kaishengit.util.MessageUtil;

public class WeixinServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String signature = req.getParameter("signature");
		String timestamp = req.getParameter("timestamp");
		String nonce = req.getParameter("nonce");
		String echostr = req.getParameter("echostr");
		PrintWriter out=resp.getWriter();
		if (CheckUtil.checkSignature(signature, timestamp, nonce, echostr)) {
			out.print(echostr);
		}
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Map<String, String> map;
		PrintWriter out = resp.getWriter();
		try {
			map = MessageUtil.xmlToMap(req);
			String toUserName=map.get("ToUserName");
			String fromUserName=map.get("FromUserName");
			String createTime=map.get("CreateTime");
			String msgType=map.get("MsgType");
			String content=map.get("Content");
			String msgId=map.get("MsgId");
			String message = null;
			if ("text".equals(msgType)) {
				TextMessage text = new TextMessage();
				text.setToUserName(toUserName);
				text.setFromUserName(fromUserName);
				text.setMsgType("text");
				text.setCreateTime(new Date().getTime());
				text.setContent("您发送的消息是："+content);
				message=MessageUtil.textMassageToXml(text);
				out.print(message);
			}
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			out.close();
		}
		
	}

}
