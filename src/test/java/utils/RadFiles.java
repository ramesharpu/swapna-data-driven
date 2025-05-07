package utils;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import org.yaml.snakeyaml.Yaml;



public class RadFiles {
	
	public Map<String, Object> readYamlFiles(String fileName) {
		Yaml yaml = new Yaml();
		InputStream inputStream = this.getClass()
		  .getClassLoader()
		  .getResourceAsStream(fileName);
		Map<String, Object> map = yaml.load(inputStream);
		return map;
	}
}
