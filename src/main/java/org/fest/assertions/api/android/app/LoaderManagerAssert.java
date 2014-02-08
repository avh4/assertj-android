package org.fest.assertions.api.android.app;

import android.app.LoaderManager;
import org.assertj.core.api.AbstractAssert;

import static org.assertj.core.api.Assertions.assertThat;

/** Assertions for {@link LoaderManager} instances. */
public class LoaderManagerAssert extends AbstractAssert<LoaderManagerAssert, LoaderManager> {
  public LoaderManagerAssert(LoaderManager actual) {
    super(actual, LoaderManagerAssert.class);
  }

  public LoaderManagerAssert hasLoader(int id) {
    isNotNull();
    assertThat(actual.getLoader(id))
        .overridingErrorMessage("Expected loader with ID <%s> but was not present.", id)
        .isNotNull();
    return this;
  }
}
