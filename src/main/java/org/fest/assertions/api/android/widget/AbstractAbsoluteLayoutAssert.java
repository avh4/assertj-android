package org.fest.assertions.api.android.widget;

import android.widget.AbsoluteLayout;
import org.fest.assertions.api.android.view.AbstractViewGroupAssert;

import static org.assertj.core.api.Assertions.assertThat;

public abstract class AbstractAbsoluteLayoutAssert<S extends AbstractAbsoluteLayoutAssert<S, A>, A extends AbsoluteLayout>
    extends AbstractViewGroupAssert<S, A> {
  protected AbstractAbsoluteLayoutAssert(A actual, Class<S> selfType) {
    super(actual, selfType);
  }

  public S isDelayingChildPressedState() {
    isNotNull();
    assertThat(actual.shouldDelayChildPressedState()) //
        .overridingErrorMessage("Epxected to be delaying child pressed state but was not.") //
        .isTrue();
    return myself;
  }

  public S isNotDelayingChildPressedState() {
    isNotNull();
    assertThat(actual.shouldDelayChildPressedState()) //
        .overridingErrorMessage("Expected to not be delaying child pressed state but was.") //
        .isFalse();
    return myself;
  }
}
