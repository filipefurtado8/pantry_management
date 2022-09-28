package academy.mindswap.pantry_management.service;

import academy.mindswap.pantry_management.command.categoryDTO.CategoryConverter;
import academy.mindswap.pantry_management.command.categoryDTO.CategoryDTO;
import academy.mindswap.pantry_management.command.categoryDTO.CreateCategoryDTO;
import academy.mindswap.pantry_management.model.Category;
import academy.mindswap.pantry_management.repository.CategoryRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class CategoryServiceImp implements CategoryService {

    private final CategoryRepository categoryRepository;

    public CategoryServiceImp(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public List<CategoryDTO> getAllCategories() {
        log.info("Getting all categories");
        return categoryRepository.findAll().stream()
                .map(CategoryConverter::convertToDTO)
                .toList();
    }

    @Override
    public CategoryDTO getCategoryByType(String type) {
        return categoryRepository.findAll().stream()
                .filter(category -> category.getType().equals(type))
                .map(CategoryConverter::convertToDTO)
                .findFirst().orElseThrow();
    }

    @Override
    public CategoryDTO addCategory(CreateCategoryDTO createCategoryDTO) {
        Category category = CategoryConverter.convertCreateCategoryDTOToCategory(createCategoryDTO);
        categoryRepository.save(category);
        return CategoryConverter.convertToDTO(category);
    }

    @Override
    public void deleteAll() {
        categoryRepository.deleteAll();
    }

    @Override
    public void deleteCategoryByType(String type) {
        categoryRepository.delete(categoryRepository.findAll().stream()
                .filter(category -> category.getType().equals(type))
                .findFirst().orElseThrow());
    }

    @Override
    public CategoryDTO alterCategory(CreateCategoryDTO createCategoryDTO, String name) {

        log.info("Updating category");
        CategoryConverter.convertCreateCategoryDTOToCategory(createCategoryDTO);

        Category category = categoryRepository.findAll().stream()
                .filter(category1 -> category1.getType().equals(name))
                .findFirst().orElseThrow();


        categoryRepository.save(category);

        return CategoryConverter.convertToDTO(category);

    }
}
