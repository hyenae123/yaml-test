package com.lxy.yaml;

import org.yaml.snakeyaml.Yaml;

/**
 * jackson or snakeyaml
 * 
 * @author liuxy1
 *
 */
public class YamlTest {
    
    public static void main(String[] args) {
        test1();
    }
    
    public static void test1() {
        String yamlString = "key: hello yaml{}\nkey:";
        Yaml yaml = new Yaml();
        Object ret = yaml.load(yamlString);
        System.out.println(ret);
    }
    
    public static void test2() {
        
    }
}
