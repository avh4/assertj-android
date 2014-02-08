package org.assertj.android.api.content.res;

import android.content.res.Configuration;
import org.assertj.core.api.AbstractAssert;

import static android.content.res.Configuration.UI_MODE_TYPE_APPLIANCE;
import static android.content.res.Configuration.UI_MODE_TYPE_CAR;
import static android.content.res.Configuration.UI_MODE_TYPE_DESK;
import static android.content.res.Configuration.UI_MODE_TYPE_NORMAL;
import static android.content.res.Configuration.UI_MODE_TYPE_TELEVISION;
import static android.content.res.Configuration.UI_MODE_TYPE_UNDEFINED;

/** Assertions for {@link Configuration} instances. */
public class ConfigurationAssert extends AbstractAssert<ConfigurationAssert, Configuration> {
  public ConfigurationAssert(Configuration actual) {
    super(actual, ConfigurationAssert.class);
  }

  // TODO a lot!

  public static String uiModeTypeToString(int mode) {
    switch (mode) {
      case UI_MODE_TYPE_NORMAL:
        return "normal";
      case UI_MODE_TYPE_APPLIANCE:
        return "appliance";
      case UI_MODE_TYPE_CAR:
        return "car";
      case UI_MODE_TYPE_DESK:
        return "desk";
      case UI_MODE_TYPE_TELEVISION:
        return "television";
      case UI_MODE_TYPE_UNDEFINED:
        return "undefined";
      default:
        throw new IllegalArgumentException("Unknown UI mode type: " + mode);
    }
  }
}
