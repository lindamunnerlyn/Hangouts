// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.widget.ListView;
import com.google.android.apps.hangouts.views.MessageListAnimationManager;

final class ayn extends eji
{

    final avv a;

    ayn(avv avv1)
    {
        a = avv1;
        super();
    }

    public void a()
    {
        if (avv.k(a) != null)
        {
            ((ListView)avv.l(a)).invalidateViews();
        }
    }

    public void a(boolean flag)
    {
        if (!avv.i(a))
        {
            MessageListAnimationManager messagelistanimationmanager = avv.j(a);
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
