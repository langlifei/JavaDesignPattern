package FactoryMethodPattern02.exercise;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class XMLUtil {
    private final static String PATH = "src\\FactoryMethodPattern02\\exercise\\config.xml";
    private final static String TAG_NAME = "className";

    public static Object getBean() {
        try {
            //创建文档对象
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            Document document = documentBuilder.parse(new File(PATH));
            //获取包图表类型的文本节点
            NodeList n1 = document.getElementsByTagName(TAG_NAME);
            Node classNode = n1.item(0).getFirstChild();
            String className = classNode.getNodeValue().trim();
            Class classObject = Class.forName(className);
            return classObject.newInstance();
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }

    }
}
