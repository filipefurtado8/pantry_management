package academy.mindswap.pantry_management.utils;

public class Messages {

    public static final String CONTROLLER_POINT_CUT = "within(@org.springframework.web.bind.annotation.RestController *)";
    public static final String SERVICE_POINT_CUT = "within(@org.springframework.stereotype.Service *)";
    public static final String REPOSITORY_POINT_CUT = "within(@org.springframework.stereotype.Repository *)";
    public static final String APP_POINT_CUT = "execution(* academy.mindswap.pantry_management..*(..))";
    public static final String MAIN_POINT_CUT = "appPointCut() && (controllerPointCut() || servicePointCut() || repositoryPointCut())";
    public static final String PATH = "academy.mindswap.pantry_management.aop.AppPointCuts.mainPointCut()";
    public static final String LOG_ASPECT = "LogAspect : {}";
    public static final String BY_INGREDIENT = "byIngredient";
    public static final String URL_BY_ONE_INGREDIENT = "https://www.themealdb.com/api/json/v1/1/filter.php?i=";
    public static final String BY_NAME = "byName";
    public static final String URL_BY_ONE_NAME = "https://www.themealdb.com/api/json/v1/1/search.php?s=";
    public static final String BY_INGREDIENTS = "byIngredients";
    public static final String URL_MULTI_INGREDIENTS = "https://www.themealdb.com/api/json/v2/9973533/filter.php?i=";
    public static final String CRON = "*/40 * * * * *";
    public static final String CACHE_EVICT = "Cache Evict!";
    public static final String MIN_QUANTITY = "The value of quantity can't be less than zero.";
    public static final String UNASSIGNED = "unassigned";
    public static final String RECIPE = "/recipe";
    public static final String RECIPE_BY_INGREDIENT = "/byIngredient/{ingredientName}";
    public static final String NAME = "/{name}";
    public static final String RECIPE_BY_STOCK = "/stock";
    public static final String GET_RECIPE_BY_NAME = "Getting recipes by name";
    public static final String GET_RECIPE_BY_STOCK = "Getting recipes by stock";
    public static final String CATEGORY = "/category";
    public static final String ALL_CATEGORIES = "Getting all categories";
    public static final String CATEGORY_BY_TYPE = "/{type}";
    public static final String GET_CATEGORY_BY_TYPE = "Getting category by type";
    public static final String BAR = "/";
    public static final String UPDATING_CATEGORY = "Updating category";
    public static final String CATEGORIES_DELETED = "All categories were deleted!";
    public static final String THE_CATEGORY = "The category, ";
    public static final String WAS_DELETED = ", was deleted!";
    public static final String INGREDIENT = "/ingredient";
    public static final String ID = "/id/{id}";
    public static final String DATE = "/date/{year},{month},{day}";
    public static final String QUANTITY = "/quantity/{quantity}";
    public static final String GET_ALL_INGREDIENTS = "Getting all ingredients";
    public static final String UPDATING_INGREDIENT = "Updating ingredient";
    public static final String INGREDIENTS_DELETED = "All ingredients were deleted";
    public static final String THE_INGREDIENT = "The ingredient, ";
    public static final String USER = "/user";
    public static final String GET_ALL_USERS = "Getting all users";
    public static final String RESOURCE_NOT_FOUND = "Resource not found: {}";
    public static final String INGREDIENT_LIST = "ingredientList";
    public static final String CATEGORY1 = "category";
    public static final String USER1 = "user";
    public static final String RECIPES_BY_INGREDIENT = "Getting recipes by ingredient";
    public static final String FIND_INGREDIENT_BY_NAME = "Finding ingredient by name";
    public static final String INGREDIENT_WITH_ID_DOESNT_EXIST = "The ingredient with this id doesn't exist. Id: ";
}