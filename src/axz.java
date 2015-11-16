// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.widget.ListView;
import com.google.android.apps.hangouts.views.MessageListAnimationManager;

final class axz extends egg
{

    final ave a;

    axz(ave ave1)
    {
        a = ave1;
        super();
    }

    public void a()
    {
        if (ave.k(a) != null)
        {
            ((ListView)ave.l(a)).invalidateViews();
        }
    }

    public void a(boolean flag)
    {
        if (!ave.i(a))
        {
            MessageListAnimationManager messagelistanimationmanager = ave.j(a);
            if (!flag)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            messagelistanimationmanager.a(flag);
        }
    }
}
