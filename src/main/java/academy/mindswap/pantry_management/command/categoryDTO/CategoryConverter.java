package academy.mindswap.pantry_management.command.categoryDTO;

import academy.mindswap.pantry_management.command.ingredientDTO.IngredientConverter;
import academy.mindswap.pantry_management.model.Category;

import java.util.stream.Collectors;

public class CategoryConverter {

    public static CategoryDTO convertToDTO(Category category) {
        return CategoryDTO.builder()
                .id(category.getId())
                .type(category.getType())
                .ingredientListDTO(category.getIngredientList().stream()
                        .map(IngredientConverter::convertToDTO)
                        .collect(Collectors.toList()))
                .build();
    }

    public static CategoryDTO convertToDTOWithoutIngredient(Category category) {
        return CategoryDTO.builder()
                .id(category.getId())
                .type(category.getType())
                .build();
    }

    public static Category convertCreateCategoryDTOToCategory(CreateCategoryDTO createCategoryDTO) {

        return Category.builder()
                .type(createCategoryDTO.getType())
                .build();
    }
}