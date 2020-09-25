package mermody.springframework.recipeproject.controllers;

import mermody.springframework.recipeproject.domain.Category;
import mermody.springframework.recipeproject.domain.UnitOfMeasure;
import mermody.springframework.recipeproject.repositories.CategoryRepository;
import mermody.springframework.recipeproject.repositories.UnitOfMeasureRepository;
import mermody.springframework.recipeproject.services.RecipeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
public class IndexController {

    private final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage(Model model) {

        model.addAttribute("recipes", recipeService.getRecipes());

        return "index";
    }
}
