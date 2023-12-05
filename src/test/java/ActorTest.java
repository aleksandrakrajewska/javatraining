import models.Actor;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

//nazwy metod muszą mieć w nazwie TEST
//metoda musi być voidowa
public class ActorTest {
    @Test //adnotacja
    void shouldCalculateCorrectSalary()
    {
        Actor tomCruise = new Actor("Tom","Hanks");
        int actual = tomCruise.calculateSalary(3, 3);
        int expected = 9;

        //serce testu
        assertThat(actual).isEqualTo(expected);


    }

    @Test
    void shouldCalculateBonus()
    {
        Actor tomHanks = new Actor("Tom","Hanks");
        int actual = tomHanks.giveBonus(3,10);
        int expected = 20;
        assertThat(actual).as("Bonus policzony nieprawidłowo").isEqualTo(expected);
    }

    @Test
    void shouldCalculateBonusForRatingGreaterThan10()
    {Actor tomHanks = new Actor("Tom","Hanks");
        int actual = tomHanks.giveBonus(11,10);
        int expected = 10;
        assertThat(actual).as("Bonus policzony nieprawidłowo").isEqualTo(expected);}


}
