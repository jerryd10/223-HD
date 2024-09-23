package my.webapp.controller;




import org.junit.Test;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyPageController{

	@RequestMapping("/home")
	public String home() {
		return "mypage";
	}
	
	@Test
	public void test() {
		System.out.println("Webapp has started...");
	}
	

}
