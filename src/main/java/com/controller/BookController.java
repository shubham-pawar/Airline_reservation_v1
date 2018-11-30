package com.controller;

/**
 * Controller to handle No of passengers during booking process
 */
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BookController {
	@RequestMapping(value = "/book", method = RequestMethod.GET)
	public ModelAndView back() {
		return new ModelAndView("NoOfPassengers");
	}

	@RequestMapping(value = "/seat", method = RequestMethod.POST)
	public ModelAndView seat(@RequestParam("sel") String value) {

		return new ModelAndView("SeatSelection", "msg", value);
	}

}
