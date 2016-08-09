package com.kaishengit.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import com.kaishengit.pojo.TextMessage;
import com.thoughtworks.xstream.XStream;

public class MessageUtil {
	/**
	 * Éú³Éxml
	 * @param request
	 * @return
	 * @throws IOException
	 * @throws DocumentException
	 */
	public static Map<String, String>xmlToMap(HttpServletRequest request) throws IOException, DocumentException{
		Map<String, String>map = new HashMap<String, String>();
		SAXReader reader = new SAXReader();
		InputStream inputStream = request.getInputStream();
		Document document = reader.read(inputStream);
		Element root = document.getRootElement();
		List<Element>list  = root.elements();
		for (Element element : list) {
			map.put(element.getName(), element.getText());
		}
		inputStream.close();
		return map;
	}
	public static String textMassageToXml(TextMessage textMessage){
		XStream xStream = new XStream();
		return xStream.toXML(textMessage);
	}
}
