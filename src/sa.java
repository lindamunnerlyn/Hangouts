// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.View;
import android.widget.ListAdapter;

final class sa extends sr
{

    final ru a;

    public sa(ru ru1, android.view.Window.Callback callback)
    {
        a = ru1;
        super(callback);
    }

    public View onCreatePanelView(int i)
    {
        i;
        JVM INSTR tableswitch 0 0: default 20
    //                   0 26;
           goto _L1 _L2
_L1:
        Menu menu;
        return super.onCreatePanelView(i);
_L2:
        if (onPreparePanel(i, null, menu = a.a.o()) && onMenuOpened(i, menu))
        {
            ru ru1 = a;
            if (ru1.d == null && (menu instanceof ta))
            {
                ta ta1 = (ta)menu;
                Object obj = ru1.a.b();
                TypedValue typedvalue = new TypedValue();
                android.content.res.Resources.Theme theme = ((Context) (obj)).getResources().newTheme();
                theme.setTo(((Context) (obj)).getTheme());
                theme.resolveAttribute(g.e, typedvalue, true);
                if (typedvalue.resourceId != 0)
                {
                    theme.applyStyle(typedvalue.resourceId, true);
                }
                theme.resolveAttribute(g.J, typedvalue, true);
                if (typedvalue.resourceId != 0)
                {
                    theme.applyStyle(typedvalue.resourceId, true);
                } else
                {
                    theme.applyStyle(g.bK, true);
                }
                obj = new ContextThemeWrapper(((Context) (obj)), 0);
                ((Context) (obj)).getTheme().setTo(theme);
                ru1.d = new sy(((Context) (obj)), g.by);
                ru1.d.a(new rz(ru1));
                ta1.a(ru1.d);
            }
            if (menu == null || ru1.d == null)
            {
                return null;
            }
            if (ru1.d.a().getCount() > 0)
            {
                return (View)ru1.d.a(ru1.a.a());
            } else
            {
                return null;
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    public boolean onPreparePanel(int i, View view, Menu menu)
    {
        boolean flag = super.onPreparePanel(i, view, menu);
        if (flag && !a.b)
        {
            a.a.j();
            a.b = true;
        }
        return flag;
    }
}
