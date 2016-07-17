// Generated code from Butter Knife. Do not modify!
package com.dany.niord;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class LoginActivity$$ViewBinder<T extends com.dany.niord.LoginActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131493012, "field 'btnLogin'");
    target.btnLogin = finder.castView(view, 2131493012, "field 'btnLogin'");
    view = finder.findRequiredView(source, 2131493011, "field 'container'");
    target.container = finder.castView(view, 2131493011, "field 'container'");
  }

  @Override public void unbind(T target) {
    target.btnLogin = null;
    target.container = null;
  }
}
