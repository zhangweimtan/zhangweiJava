package com.myjava02;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.List;

public class Dom4jTest {
    public static void main(String[] args) throws DocumentException {
//        创建sax读取对象
        SAXReader reader = new SAXReader();
//        指定解析的xml源，返回document对象
        Document document = reader.read(new File("src/com/myjava01/XmlDemo.xml"));
//        得到元素
//        根元素,getName()
        Element rootElement = document.getRootElement();
        System.out.println(rootElement.getName());
//        下一级元素
//        Element name = rootElement.element("stu").element("name");
//        System.out.println(name.getText());//获取文本内容
//        获取所有元素
        List<Element>  elements = rootElement.elements();
        for (Element element: elements
             ) {
            //获取stu元素
//            System.out.println(element.getName());
            //获取stu元素下的name
            String name = element.element("name").getText();
            String age = element.element("age").getText();
            String address = element.element("address").getText();
            System.out.println(name+age+address);

        }

    }
}
