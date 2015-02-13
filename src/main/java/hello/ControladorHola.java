package hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/nalgas")
public class ControladorHola {

	@RequestMapping(value="/pito", method=RequestMethod.GET, headers={"Accept=text/html"})
		public @ResponseBody String lameGuevos(){
			
			return "chupame la verga";
		}
	
}
