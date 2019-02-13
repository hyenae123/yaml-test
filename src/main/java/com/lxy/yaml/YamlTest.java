package com.lxy.yaml;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.yaml.snakeyaml.Yaml;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

/**
 * jackson or snakeyaml
 * 
 * SnakeYAML document: https://bitbucket.org/asomov/snakeyaml/wiki/Documentation
 * 
 * @author liuxy1
 *
 */
public class YamlTest {
    
    public static void main(String[] args) {
//        test1();
        test2();
    }
    
    public static void test1() {
        String yamlString = "key: hello yaml";
        Yaml yaml = new Yaml();
        Object ret = yaml.load(yamlString);
        System.out.println(ret);
    }
    
    public static void test2() {
        ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
        String yamlString = "key: hello yaml";
        try {
            Object ret = mapper.readValue(yamlString, Object.class);
            System.out.println(ret);
            System.out.println(ReflectionToStringBuilder.toString(ret, ToStringStyle.MULTI_LINE_STYLE));
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
