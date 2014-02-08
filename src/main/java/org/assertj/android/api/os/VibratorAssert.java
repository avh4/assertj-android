// Copyright 2013 Square, Inc.
package org.assertj.android.api.os;

import android.os.Vibrator;
import org.assertj.core.api.Assertions;
import org.assertj.core.api.AbstractAssert;

/** Assertions for {@link Vibrator} instances. Buzz buzz. */
public class VibratorAssert extends AbstractAssert<VibratorAssert, Vibrator> {
  public VibratorAssert(Vibrator actual) {
    super(actual, VibratorAssert.class);
  }

  public VibratorAssert hasVibrator() {
    isNotNull();
    Assertions.assertThat(actual.hasVibrator()) //
        .overridingErrorMessage("Expected to have vibrator but did not.") //
        .isTrue();
    return this;
  }

  public VibratorAssert hasNoVibrator() {
    isNotNull();
    Assertions.assertThat(actual.hasVibrator()) //
        .overridingErrorMessage("Expected to not have vibrator but did.") //
        .isFalse();
    return this;
  }
}
