package com.app.core;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class MyXmlExample {


    public static void main(String[] args) throws Exception {
        //Persons persons = null;
        //String xml = f(persons);


        Persons persons = new Persons();
        final List<Person> data = new ArrayList();
        persons.setData(data);

        File xmlFile = new File("C:\\Users\\asusadmin\\Desktop\\spring5-core-app-xml\\src\\main\\resources\\persons.xml");
        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser parser = factory.newSAXParser();
        parser.parse(xmlFile, new DefaultHandler(){
            private Person currentPerson;
            private String currentTag;


            @Override
            public void startDocument() throws SAXException {
                System.out.println("@Start document");
            }

            @Override
            public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
                System.out.println("\t@Start: "+qName);
                currentTag=qName;
                if("person".equals(qName)){
                    currentPerson = new Person();
                   // attributes.getLength();
                   // attributes.getQName(0);
                    String ageValue=attributes.getValue("age");
                    System.out.println("\t\tage="+ageValue);
                    int age = Integer.parseInt(ageValue);
                    currentPerson.setAge(age);

                }
            }


            @Override
            public void characters(char[] ch, int start, int length) throws SAXException {
                String str = new String(ch, start, length);
                System.out.println("\t\t"+str);
                if("name".equals(currentTag)){
                    if(!str.trim().isEmpty()) {
                        //System.out.println("Str="+str);
                        currentPerson.setName(str.trim());
                    }
                }
            }

            @Override
            public void endElement(String uri, String localName, String qName) throws SAXException {
                System.out.println("\t@End: "+qName);
                if("person".equals(qName)){
                    data.add(currentPerson);
                }
            }

            @Override
            public void endDocument() throws SAXException {
                System.out.println("@End document");
            }
        });
        System.out.println("--------After Parsing---------");
        List<Person> personDataList = persons.getData();
        for(Person p: personDataList){
            System.out.println(p);
        }


    }

}
