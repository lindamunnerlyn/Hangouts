// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.view.ViewParent;
import android.widget.ListView;
import android.widget.TextView;
import com.google.android.apps.hangouts.phone.DebugActivity;

public final class cmo
    implements android.view.View.OnClickListener
{

    final TextView a;
    final TextView b;
    final DebugActivity c;

    public cmo(DebugActivity debugactivity, TextView textview, TextView textview1)
    {
        c = debugactivity;
        a = textview;
        b = textview1;
        super();
    }

    public void onClick(View view)
    {
        if (view != a) goto _L2; else goto _L1
_L1:
        ((android.widget.LinearLayout.LayoutParams)DebugActivity.c(c).getLayoutParams()).weight = 5F;
        ((android.widget.LinearLayout.LayoutParams)DebugActivity.d(c).getLayoutParams()).weight = 1.0F;
_L4:
        a.getParent().requestLayout();
        return;
_L2:
        if (view == b)
        {
            ((android.widget.LinearLayout.LayoutParams)DebugActivity.c(c).getLayoutParams()).weight = 1.0F;
            ((android.widget.LinearLayout.LayoutParams)DebugActivity.d(c).getLayoutParams()).weight = 5F;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }
}
