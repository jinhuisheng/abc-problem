import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AbcBlocksTest {

    @Test
    void should_make_word_false() {
        assertThat(AbcBlocks.canMakeWord("CONFUSE")).isEqualTo(true);
        assertThat(AbcBlocks.canMakeWord("BOOK")).isEqualTo(false);
        assertThat(AbcBlocks.canMakeWord("SQUAD")).isEqualTo(true);
    }
}