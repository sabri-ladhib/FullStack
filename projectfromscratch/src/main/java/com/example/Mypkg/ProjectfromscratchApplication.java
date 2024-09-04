package com.example.Mypkg;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication
public class ProjectfromscratchApplication {
@RequestMapping("/")
@ResponseBody
String home() {
		return "hello word";
	}
	public static void main(String[] args) {
		SpringApplication.run(ProjectfromscratchApplication.class, args);
	}

}
