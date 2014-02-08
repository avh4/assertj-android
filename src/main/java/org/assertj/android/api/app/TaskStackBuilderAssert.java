package org.assertj.android.api.app;

import android.app.TaskStackBuilder;
import android.content.Intent;
import org.assertj.core.api.AbstractAssert;

import static org.assertj.core.api.Assertions.assertThat;

/** Assertions for {@link TaskStackBuilder} instances. */
public class TaskStackBuilderAssert extends AbstractAssert<TaskStackBuilderAssert, TaskStackBuilder> {
  public TaskStackBuilderAssert(TaskStackBuilder actual) {
    super(actual, TaskStackBuilderAssert.class);
  }

  public TaskStackBuilderAssert hasIntentCount(int count) {
    isNotNull();
    int actualCount = actual.getIntentCount();
    assertThat(actualCount) //
        .overridingErrorMessage("Expected intent count <%s> but was <%s>.", count, actualCount) //
        .isEqualTo(count);
    return this;
  }

  public TaskStackBuilderAssert containsIntents(Intent... intents) {
    isNotNull();
    assertThat(actual.getIntents()).contains(intents);
    return this;
  }
}
