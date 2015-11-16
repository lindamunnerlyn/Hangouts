// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import com.google.android.apps.hangouts.floatingactionbutton.impl.FloatingActionButton;

public final class bfa
    implements android.view.View.OnClickListener
{

    final FloatingActionButton a;

    public bfa(FloatingActionButton floatingactionbutton)
    {
        a = floatingactionbutton;
        super();
    }

    public void onClick(View view)
    {
        if (a.a != null)
        {
            view = a.a;
            int i;
            if (a.d != -1)
            {
                i = a.d;
            } else
            {
                i = a.b;
            }
            view.a(i);
        }
    }
}
