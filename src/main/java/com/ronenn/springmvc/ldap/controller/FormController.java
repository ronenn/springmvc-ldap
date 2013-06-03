package com.ronenn.springmvc.ldap.controller;

import com.ronenn.springmvc.ldap.controller.model.FormBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/form")
@SessionAttributes("formBean")
public class FormController {

    private static Logger logger = LoggerFactory.getLogger(FormController.class);
    // Invoked on every request
    @ModelAttribute
    public void updateAttribute(WebRequest request, Model model) {
        logger.debug("in FormController::updateAttribute");
    }

    // Invoked initially to create the "form" attribute
    // Once created the "form" attribute comes from the HTTP session (see @SessionAttributes)

    @ModelAttribute("formBean")
    public FormBean createFormBean() {
        logger.debug("in FormController::createFormBean");
        return new FormBean();
    }

    @RequestMapping(method=RequestMethod.GET)
    public void form() {
        logger.debug("in FormController::form");
    }

    @RequestMapping(method=RequestMethod.POST)
    public String processSubmit(FormBean formBean, BindingResult result,
                                @ModelAttribute("subscribeNewsletter") boolean subscribeNewsletter,
                                Model model, RedirectAttributes redirectAttrs) {
        if (result.hasErrors()) {
            logger.debug("in FormController::processSubmit we have errors");
            return null;
        }
        // Typically you would save to a db and clear the "form" attribute from the session
        // via SessionStatus.setCompleted(). For the demo we leave it in the session.
        String message = "Form submitted successfully.  Bound " + formBean;
        // Success response handling
        if (subscribeNewsletter) {
            // prepare model for rendering success message in this request
            model.addAttribute("message", message);
            logger.debug("in FormController::processSubmit subscribeNewsletter is true");
            return "redirect:/formcontent";
        } else {
            // store a success message for rendering on the next request after redirect
            // redirect back to the form to render the success message along with newly bound values
            redirectAttrs.addFlashAttribute("message", message);
            logger.debug("in FormController::processSubmit subscribeNewsletter is false, messages is {}", message);
            return "formcontent";
        }
    }

}
