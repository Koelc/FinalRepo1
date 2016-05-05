package store1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HelloWorldController {
	String message = "Welcome to PizzaStore!";
	private Object userDAO;
	
	@RequestMapping("/")
	public String ShowIndex()
	{
		return "index";
	}
 
	@RequestMapping("/registration")
	public String ShowReg()
	{
		return "registration";
	}
	@RequestMapping("/productTable")
	public String ShowProd()
	{
		return "productTable";
	}
	
	@RequestMapping(value = "/productTable", method = RequestMethod.GET)
    public ModelAndView prodTable()
	{
		DAOlist dil=new DAOlist();
		ModelAndView mav = new ModelAndView("productTable");
		mav.addObject("dl", dil.dataList());
		return mav;
		
		
		
  }
	/*public ModelAndView showMessage(@RequestParam(value = "name", required = false, defaultValue = "World") String name)
	{
		System.out.println("in controller");
 
		ModelAndView mv = new ModelAndView("HelloWorld");
		mv.addObject("message", message);
		mv.addObject("name", name);
		return mv;
	}*/
	
	
	
	@RequestMapping("/returnhome")
	public String ShowSecond()
	{
		return "index";
	}
}