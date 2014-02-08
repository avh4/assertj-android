package org.fest.assertions.api.android.widget;

import android.widget.RelativeLayout;
import org.fest.assertions.api.android.view.AbstractViewGroupAssert;

import static org.assertj.core.api.Assertions.assertThat;

public abstract class AbstractRelativeLayoutAssert<S extends AbstractRelativeLayoutAssert<S, A>, A extends RelativeLayout>
    extends AbstractViewGroupAssert<S, A> {
  protected AbstractRelativeLayoutAssert(A actual, Class<S> selfType) {
    super(actual, selfType);
  }

  public S hasGravity(int gravity) {
    isNotNull();
    int actualGravity = actual.getGravity();
    assertThat(actualGravity) //
        .overridingErrorMessage("Expected gravity <%s> but was <%s>.", gravity, actualGravity) //
        .isEqualTo(gravity);
    return myself;
  }
}
