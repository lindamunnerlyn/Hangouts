// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import com.google.android.apps.hangouts.floatingactionbutton.impl.FloatingActionButton;

public final class bek
    implements android.view.View.OnClickListener
{

    final FloatingActionButton a;

    public bek(FloatingActionButton floatingactionbutton)
    {
        a = floatingactionbutton;
        super();
    }

    public void onClick(View view)
    {
        if (FloatingActionButton.f(a) != null)
        {
            view = FloatingActionButton.f(a);
            int i;
            if (FloatingActionButton.b(a) != -1)
            {
                i = FloatingActionButton.b(a);
            } else
            {
                i = FloatingActionButton.g(a);
            }
            view.a(i);
        }
    }
}
