package my.webapp.controller;

import org.junit.Test;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class MyPageControllerTest{	
	@Test
	public void test() {
		System.out.println("Webapp has started...");
        MyPageController controller = new MyPageController();
        String result = controller.home();
        System.out.println(result);
	}
	

}