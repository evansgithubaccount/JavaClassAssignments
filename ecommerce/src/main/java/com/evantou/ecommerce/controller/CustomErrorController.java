package com.evantou.ecommerce.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class CustomErrorController implements ErrorController {

    private static final String PATH = "/error";

    @RequestMapping(value=PATH)
    public String handleError(HttpServletRequest request, Model model) {
        int statusCode = (int) request.getAttribute("javax.servlet.error.status_code");
        Exception exception = (Exception) request.getAttribute("javax.servlet.error.exception");
        String message = exception == null ? "No Message" : exception.getMessage();

        model.addAttribute("message",message);

        switch (statusCode) {
            case 404: return "404error";
            case 500: return "500error";
            default: return null;
        }
    }

    @Override
    public String getErrorPath(){
        return PATH;
    }
}
