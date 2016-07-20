package net.is_bg.ltf.xmlmapper.decl14;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;


// TODO: Auto-generated Javadoc
/**
 * The Class XmlParser.
 */
class XmlSerialize {
	
	/**
	 * *
	 * Конвертиране на към ИКСЕМЕЛ Стринг.
	 *
	 * @param <T> the generic type
	 * @param obj the obj
	 * @return the string
	 * @throws JAXBException the jAXB exception
	 * @throws IOException Signals that an I/O exception has occurred.
	 * @throws ClassNotFoundException the class not found exception
	 */
	public static <T> String objectToXml(T obj) throws JAXBException, IOException, ClassNotFoundException
	{
		return objectToXml(obj, false);
	}
	
	/**
	 * *
	 * Конвертиране на към ИКСЕМЕЛ Стринг.
	 *
	 * @param <T> the generic type
	 * @param obj the obj
	 * @return the string
	 * @throws JAXBException the jAXB exception
	 * @throws IOException Signals that an I/O exception has occurred.
	 * @throws ClassNotFoundException the class not found exception
	 */
	public static <T> String objectToXml(T obj, boolean logXml) throws JAXBException, IOException, ClassNotFoundException
	{
		JAXBContext context = JAXBContext.newInstance(obj.getClass());
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        StringWriter stringWriter = new StringWriter();
		StreamResult streamResult = new StreamResult(stringWriter);
		Marshaller marshallerObj = context.createMarshaller();
	    marshallerObj.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
	    marshallerObj .marshal(obj, streamResult);
	    String returnString = stringWriter.toString();
	    stringWriter.close();
	    if(logXml) System.out.println(returnString);
	    return returnString;
	}
	
	
	/**
	 * Конверитране на ИКСЕМЕЛ Стринг към Обект.
	 *
	 * @param <T> the generic type
	 * @param s the s
	 * @param t the t
	 * @return the t
	 * @throws JAXBException the jAXB exception
	 * @throws ClassNotFoundException the class not found exception
	 */
	@SuppressWarnings({"unchecked" })
	public static <T> T  xmlToObject(String s, Class<T> t, boolean logXml) throws JAXBException, ClassNotFoundException
	{
		Object obj ;
		if(s == null || s.isEmpty())  return null;
		JAXBContext context = JAXBContext.newInstance(t);
		Unmarshaller unMarshallerObj = context.createUnmarshaller();
		StringReader sr = new StringReader(s);
		StreamSource ss = new StreamSource(sr);
		obj = unMarshallerObj.unmarshal(ss);
		sr.close();
		if(logXml)  System.out.println(s);
		return (T)obj;		
	}
	
	/**
	 * Конверитране на ИКСЕМЕЛ Стринг към Обект.
	 *
	 * @param <T> the generic type
	 * @param s the s
	 * @param t the t
	 * @return the t
	 * @throws JAXBException the jAXB exception
	 * @throws ClassNotFoundException the class not found exception
	 */
	@SuppressWarnings({"unchecked" })
	public static <T> T  xmlToObject(String s, Class<T> t) throws JAXBException, ClassNotFoundException
	{
		return xmlToObject(s,  t, false);	
	}
}
