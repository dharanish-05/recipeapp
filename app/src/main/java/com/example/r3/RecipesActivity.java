package com.example.r3;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class RecipesActivity extends AppCompatActivity {
    private List<Recipe> recipeList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ritem);

        // Initialize the recipe list
        recipeList = new ArrayList<>();
        recipeList.add(new Recipe("Tea", R.drawable.tea, "INGREDIENTS:\n" +
                "\n" +
                "Boil water: Start by heating the desired \n"+"amount of water in a kettle or a pot"+" The amount of water will depend on how many cups of tea you want to make." +
                "\n" +
                "Warm the teapot (optional): If you are using a teapot, you can pre-warm it by "+"rinsing it with hot water. This helps maintain the temperature of the brewed tea." +
                "\n" +
                "Add tea leaves or tea bags: If you are using loose tea leaves, measure the "+"desired amount and add them to the teapot or directly to your cup. If using tea bags, simply place the tea bag in the cup.\n" +
                "\n" +
                "Pour hot water: Once the water has come to a boil, pour it over the tea leaves or tea bag. The ideal water temperature and steeping time can vary depending on the type of tea you are using (e.g., black tea, green tea, herbal tea). Generally, black tea is steeped in near-boiling water (around 95°C or 200°F) for 3-5 minutes, while green tea is steeped in slightly cooler water (around 80°C or 175°F) for 2-3 minutes. Follow the instructions on the tea packaging or adjust according to your taste preferences.\n" +
                "\n" +
                "Steep the tea: Allow the tea to steep for the recommended time. Steeping too long can result in a bitter taste, so be mindful of the duration. If using loose tea leaves, you may want to use a strainer to separate the leaves from the liquid when pouring into a cup.\n" +
                "\n" +
                "Add sweeteners and milk (optional): If desired, you can add sugar, honey, or other sweeteners to taste. Additionally, you can add milk to your tea if you prefer it. Some teas, like black tea, are commonly enjoyed with milk.\n" +
                "\n" +
                "Stir and serve: Give the tea a gentle stir to mix any added ingredients. Serve hot and enjoy!"));
        recipeList.add(new Recipe("Coffee", R.drawable.coffee, "INGREDIENTS:\n" +
                "\n" +
                "Water\n" +
                "Coffee grounds\n" +
                "Optional: Sugar, milk, or other flavorings\n" +
                "Instructions:\n" +
                "\n" +
                "Measure water: Start by measuring the desired amount of water for your cup of coffee. A standard ratio is about 1-2 tablespoons of coffee grounds per 6 ounces (180 milliliters) of water, but you can adjust this based on your taste preferences.\n" +
                "\n" +
                "Grind coffee beans (if using whole beans): If you have whole coffee beans, grind them to a medium-coarse consistency using a coffee grinder. The grind size can affect the flavor and strength of your coffee.\n" +
                "\n" +
                "Boil water: Heat the water in a kettle or a pot until it reaches a temperature just below boiling point (around 195-205°F or 90-96°C). Using water that is too hot can result in a bitter taste.\n" +
                "\n" +
                "Add coffee grounds: Place the coffee grounds into a coffee filter or a coffee maker. The amount of coffee grounds can be adjusted based on your desired strength.\n" +
                "\n" +
                "Pour water over the coffee grounds: Slowly pour the hot water over the coffee grounds, starting from the center and moving in a circular motion. This allows for proper extraction.\n" +
                "\n" +
                "Let it brew: Allow the water to drip or steep through the coffee grounds. The brewing time can vary depending on your preferred strength and the brewing method you are using. In general, it takes around 4-5 minutes for a drip coffee maker and 2-4 minutes for a French press.\n" +
                "\n" +
                "Optional: Add sugar, milk, or flavorings: If desired, add sugar, milk, or any other flavorings to your brewed coffee. Adjust the amount based on your taste preferences.\n" +
                "\n" +
                "Stir and serve: Give the coffee a gentle stir to mix in any added ingredients. Pour the brewed coffee into a cup and serve it hot."));
        recipeList.add(new Recipe("Juice", R.drawable.juice, "INGREDIENTS:\n" +
                "\n" +
                "Fresh fruits or vegetables of your choice\n" +
                "Water (optional)\n" +
                "Sweeteners (optional, such as sugar or honey)\n" +
                "Instructions:\n" +
                "\n" +
                "Select and prepare the fruits or vegetables: Choose your preferred fruits or vegetables for the juice. Popular choices include oranges, apples, carrots, strawberries, and watermelon. Wash the produce thoroughly to remove any dirt or residue.\n" +
                "\n" +
                "Cut and remove any undesirable parts: Remove any stems, leaves, or peels from the fruits or vegetables as necessary. For example, peel citrus fruits like oranges and remove the seeds from apples.\n" +
                "\n" +
                "Extract the juice: There are different methods to extract juice, and you can choose the one that suits you best:\n" +
                "\n" +
                "Manual juicing: Use a citrus juicer or a manual juicer to squeeze the juice out of fruits like oranges or lemons. Cut the fruit in half, place it on the juicer, and apply pressure to extract the juice.\n" +
                "\n" +
                "Blender or food processor: If you don't have a juicer, you can use a blender or food processor to blend the fruits or vegetables into a smooth puree. Then, strain the mixture through a fine mesh sieve or cheesecloth to separate the juice from the pulp.\n" +
                "\n" +
                "Juicer machine: If you have an electric juicer, follow the instructions provided with your specific machine. Typically, you'll need to feed the fruits or vegetables into the juicer, and it will extract the juice while separating the pulp.\n" +
                "\n" +
                "Dilute and sweeten (optional): Depending on your preference, you can dilute the juice with some water to reduce the intensity of flavor. If desired, you can also add a sweetener like sugar or honey to enhance the taste. Adjust the amount according to your taste preferences.\n" +
                "\n" +
                "Mix well: Stir the juice to ensure any added sweeteners are well blended.\n" +
                "\n" +
                "Serve and enjoy: Pour the juice into a glass or pitcher and serve it immediately. You can also add ice cubes for a chilled beverage."));
        recipeList.add(new Recipe("Potato Fry", R.drawable.potatofry, "INGREDIENTS:\n" +
                "\n" +
                "Potatoes\n" +
                "Cooking oil (such as vegetable oil or olive oil)\n" +
                "Salt\n" +
                "Optional: Spices and herbs of your choice (e.g., chili powder, paprika, garlic powder, cumin, rosemary)\n" +
                "Instructions:\n" +
                "\n" +
                "Prepare the potatoes: Wash the potatoes thoroughly to remove any dirt. Peel the potatoes if desired, although leaving the skin on can add texture and flavor. Cut the potatoes into small, bite-sized pieces or thin slices.\n" +
                "\n" +
                "Parboil the potatoes (optional): Parboiling the potatoes briefly can help speed up the cooking process and ensure they are cooked evenly. Fill a pot with water and bring it to a boil. Add the potato pieces and cook them for about 5 minutes until they are slightly tender but still firm. Drain the water and pat the potatoes dry with a clean kitchen towel.\n" +
                "\n" +
                "Heat the oil: In a frying pan or skillet, heat a few tablespoons of cooking oil over medium-high heat.\n" +
                "\n" +
                "Add the potatoes: Carefully add the potato pieces to the hot oil, spreading them out in a single layer. Make sure not to overcrowd the pan to allow the potatoes to cook evenly. You may need to cook them in batches if your pan is small.\n" +
                "\n" +
                "Sauté the potatoes: Let the potatoes cook undisturbed for a few minutes until they start to develop a golden-brown crust on one side. Then, using a spatula, flip the potato pieces and continue cooking. Stir occasionally to ensure even browning on all sides. The total cooking time will vary depending on the size of the potato pieces but generally takes around 10-15 minutes.\n" +
                "\n" +
                "Season with salt and spices: Sprinkle salt evenly over the cooking potatoes. You can also add spices and herbs of your choice to enhance the flavor. Common options include chili powder, paprika, garlic powder, cumin, or rosemary. Adjust the amount of seasoning based on your taste preferences.\n" +
                "\n" +
                "Continue cooking until done: Stir the potatoes gently to coat them with the seasoning. Cook for a few more minutes until the potatoes are fully cooked and tender. Test their doneness by piercing them with a fork. If they are soft and easily pierced, they are ready.\n" +
                "\n" +
                "Remove from heat and serve: Once the potatoes are cooked to your liking, remove the pan from the heat. Transfer the potato fry to a serving dish and serve hot as a side dish or a snack."));

        LinearLayout recipeContainer = findViewById(R.id.recipeContainer);

        // Create and add views for each recipe
        for (int i = 0; i < recipeList.size(); i++) {
            Recipe recipe = recipeList.get(i);
            View recipeView = LayoutInflater.from(this).inflate(R.layout.item_recipe, recipeContainer, false);

            ImageView imageView = recipeView.findViewById(R.id.imageView);
            TextView nameTextView = recipeView.findViewById(R.id.nameTextView);

            imageView.setImageResource(recipe.getImageResource());
            nameTextView.setText(recipe.getName());

            final int position = i;
            recipeView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Recipe clickedRecipe = recipeList.get(position);
                    Intent intent = new Intent(RecipesActivity.this, Rd.class);
                    intent.putExtra("recipe", clickedRecipe);
                    startActivity(intent);
                }
            });

            recipeContainer.addView(recipeView);
        }
    }
}

