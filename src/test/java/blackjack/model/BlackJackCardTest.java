package blackjack.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BlackJackCardTest {
    public BlackJackCard blackJackCard;
    public final static int ALL_CARD_COUNT = 52;

    @BeforeEach
    void beforeEach() {
        blackJackCard = BlackJackCard.of();
    }

    @DisplayName("BlackJackCard 생성 테스트")
    @Test
    public void initTest() {
        CardBundle cardBundle = blackJackCard.getCardBundle();

        for (Card card : cardBundle.getCards()) {
            System.out.println(card.getNumber() + " " + card.getType());
        }
        assertThat(cardBundle.getCards().size()).isEqualTo(ALL_CARD_COUNT);
    }

    @DisplayName("Pick 과정 테스트")
    @Test
    public void pickTest() {
        CardBundle cardBundle = blackJackCard.getCardBundle();
        blackJackCard.pickOneCard();
        assertThat(cardBundle.getCards().size()).isEqualTo(ALL_CARD_COUNT - 1);
    }

}