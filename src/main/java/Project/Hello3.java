package Project;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class Hello3 {

	@RequestMapping("/hello3")
	public String display() {
		return "registration";
	}
	
}
