package org.springsecurity.oauth2;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class LoginLogoutController
{

	private static final Logger	logger	= LoggerFactory.getLogger( LoginLogoutController.class );

	@RequestMapping( value = "/login" , method = RequestMethod.GET )
	public String login( Locale locale , Model model )
	{
		return "login";
	}

}
