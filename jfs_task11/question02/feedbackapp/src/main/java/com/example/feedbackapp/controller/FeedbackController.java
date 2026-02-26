package com.example.feedbackapp.controller;

import com.example.feedbackapp.entity.Feedback;
import com.example.feedbackapp.repository.FeedbackRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class FeedbackController {

    private final FeedbackRepository feedbackRepository;

    public FeedbackController(FeedbackRepository feedbackRepository) {
        this.feedbackRepository = feedbackRepository;
    }

    @GetMapping("/feedback")
    public String showForm(Model model) {
        // Change "feedback" to "feedbackEntry"
        model.addAttribute("feedbackEntry", new Feedback());
        return "feedback-form";
    }

    @PostMapping("/saveFeedback")
    public String saveFeedback(@ModelAttribute("feedbackEntry") Feedback feedback, Model model) {

        feedbackRepository.save(feedback);

        model.addAttribute("message", "Feedback saved successfully!");
        // Change "feedback" to "feedbackEntry" here as well
        model.addAttribute("feedbackEntry", new Feedback());

        return "feedback-form";
    }

    @GetMapping("/viewFeedback")
    public String viewFeedback(Model model) {

        model.addAttribute("feedbackList", feedbackRepository.findAll());

        return "view-feedback";
    }
}