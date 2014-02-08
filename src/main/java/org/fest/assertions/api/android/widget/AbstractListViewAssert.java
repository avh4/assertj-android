// Copyright 2013 Square, Inc.
package org.fest.assertions.api.android.widget;

import android.graphics.drawable.Drawable;
import android.widget.ListView;

import static org.assertj.core.api.Assertions.assertThat;

public abstract class AbstractListViewAssert<S extends AbstractListViewAssert<S, A>, A extends ListView>
    extends AbstractAbsListViewAssert<S, A> {
  protected AbstractListViewAssert(A actual, Class<S> selfType) {
    super(actual, selfType);
  }

  public S hasDivider(Drawable divider) {
    isNotNull();
    Drawable actualDivider = actual.getDivider();
    assertThat(actualDivider) //
        .overridingErrorMessage("Expected divider <%s> but was <%s>.", divider, actualDivider) //
        .isSameAs(divider);
    return myself;
  }

  public S hasDividerHeight(int height) {
    isNotNull();
    int actualHeight = actual.getDividerHeight();
    assertThat(actualHeight) //
        .overridingErrorMessage("Expected divider height <%s> but was <%s>.", height,
            actualHeight) //
        .isEqualTo(height);
    return myself;
  }

  public S hasFooterViewsCount(int count) {
    isNotNull();
    int actualCount = actual.getFooterViewsCount();
    assertThat(actualCount) //
        .overridingErrorMessage("Expected footer views count <%s> but was <%s>.", count, actualCount) //
        .isEqualTo(count);
    return myself;
  }

  public S hasHeaderViewsCount(int count) {
    isNotNull();
    int actualCount = actual.getHeaderViewsCount();
    assertThat(actualCount) //
        .overridingErrorMessage("Expected header views count <%s> but was <%s>.", count, actualCount) //
        .isEqualTo(count);
    return myself;
  }

  public S hasOverscrollFooter(Drawable footer) {
    isNotNull();
    Drawable actualFooter = actual.getOverscrollFooter();
    assertThat(actualFooter) //
        .overridingErrorMessage("Expected overscroll footer <%s> but was <%s>.", footer, actualFooter) //
        .isSameAs(footer);
    return myself;
  }

  public S hasOverscrollHeader(Drawable header) {
    isNotNull();
    Drawable actualHeader = actual.getOverscrollHeader();
    assertThat(actualHeader) //
        .overridingErrorMessage("Expected overscroll header <%s> but was <%s>.", header, actualHeader) //
        .isSameAs(header);
    return myself;
  }
}
