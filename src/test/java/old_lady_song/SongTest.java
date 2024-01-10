package old_lady_song;

import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Don't change anything in this file!
 */
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class SongTest {

    @Test
    void generated_text_matches_given_text() {

        // Given

        Song song = new Song();

        // When

        String text = song.text();

        // Then

        assertThat(text).isEqualTo(TEXT);
    }

    private static final String TEXT =
            "There was an old lady who swallowed a fly.\n"
                    + "I don't know why she swallowed a fly - Perhaps she'll die!\n"
                    + "\n"
                    + "There was an old lady who swallowed a spider;\n"
                    + "That wriggled and jiggled and tickled inside her.\n"
                    + "She swallowed the spider to catch the fly;\n"
                    + "I don't know why she swallowed a fly - Perhaps she'll die!\n"
                    + "\n"
                    + "There was an old lady who swallowed a bird;\n"
                    + "How absurd to swallow a bird.\n"
                    + "She swallowed the bird to catch the spider,\n"
                    + "She swallowed the spider to catch the fly;\n"
                    + "I don't know why she swallowed a fly - Perhaps she'll die!\n"
                    + "\n"
                    + "There was an old lady who swallowed a cat;\n"
                    + "Well, fancy that, she swallowed a cat!\n"
                    + "She swallowed the cat to catch the bird,\n"
                    + "She swallowed the bird to catch the spider,\n"
                    + "She swallowed the spider to catch the fly;\n"
                    + "I don't know why she swallowed a fly - Perhaps she'll die!\n"
                    + "\n"
                    + "There was an old lady who swallowed a dog;\n"
                    + "What a hog to swallow a dog!\n"
                    + "She swallowed the dog to catch the cat,\n"
                    + "She swallowed the cat to catch the bird,\n"
                    + "She swallowed the bird to catch the spider,\n"
                    + "She swallowed the spider to catch the fly;\n"
                    + "I don't know why she swallowed a fly - Perhaps she'll die!\n"
                    + "\n"
                    + "There was an old lady who swallowed a goat;\n"
                    + "Just opened her throat and swallowed a goat!\n"
                    + "She swallowed the goat to catch the dog,\n"
                    + "She swallowed the dog to catch the cat,\n"
                    + "She swallowed the cat to catch the bird,\n"
                    + "She swallowed the bird to catch the spider,\n"
                    + "She swallowed the spider to catch the fly;\n"
                    + "I don't know why she swallowed a fly - Perhaps she'll die!\n"
                    + "\n"
                    + "There was an old lady who swallowed a cow;\n"
                    + "I don't know how she swallowed a cow!\n"
                    + "She swallowed the cow to catch the goat,\n"
                    + "She swallowed the goat to catch the dog,\n"
                    + "She swallowed the dog to catch the cat,\n"
                    + "She swallowed the cat to catch the bird,\n"
                    + "She swallowed the bird to catch the spider,\n"
                    + "She swallowed the spider to catch the fly;\n"
                    + "I don't know why she swallowed a fly - Perhaps she'll die!\n"
                    + "\n"
                    + "There was an old lady who swallowed a horse...\n"
                    + "She's dead, of course!";
}
