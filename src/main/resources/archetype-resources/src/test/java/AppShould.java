package ${package};

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

public class AppShould {

  @Test
  void add_two_numbers() {
    assertThat(1 + 1, is(equalTo(2)));
  }
}