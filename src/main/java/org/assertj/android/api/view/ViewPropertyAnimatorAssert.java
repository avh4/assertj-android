package org.assertj.android.api.view;

import android.view.ViewPropertyAnimator;
import org.assertj.core.api.AbstractAssert;

import static org.assertj.core.api.Assertions.assertThat;

/** Assertions for {@link ViewPropertyAnimator} instances. */
public class ViewPropertyAnimatorAssert
    extends AbstractAssert<ViewPropertyAnimatorAssert, ViewPropertyAnimator> {
  public ViewPropertyAnimatorAssert(ViewPropertyAnimator actual) {
    super(actual, ViewPropertyAnimatorAssert.class);
  }

  public ViewPropertyAnimatorAssert hasDuration(long duration) {
    isNotNull();
    long actualDuration = actual.getDuration();
    assertThat(actualDuration) //
        .overridingErrorMessage("Expected duration <%s> but was <%s>", duration, actualDuration) //
        .isEqualTo(duration);
    return this;
  }

  public ViewPropertyAnimatorAssert hasStartDelay(long delay) {
    isNotNull();
    long actualDelay = actual.getStartDelay();
    assertThat(actualDelay) //
        .overridingErrorMessage("Expected start delay <%s> but was <%s>", delay, actualDelay) //
        .isEqualTo(delay);
    return this;
  }
}
