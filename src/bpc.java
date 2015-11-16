// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.hangouts.hangout.HangoutSelfMenu;
import java.util.Iterator;
import java.util.List;

public final class bpc extends boh
{

    final HangoutSelfMenu a;

    public bpc(HangoutSelfMenu hangoutselfmenu)
    {
        a = hangoutselfmenu;
        super();
    }

    public void a(gho gho)
    {
        if (gho instanceof ghv)
        {
            for (gho = a.a.iterator(); gho.hasNext(); ((bov)gho.next()).a(HangoutSelfMenu.a(a).t())) { }
        }
    }

    public void b(int i)
    {
        for (Iterator iterator = a.a.iterator(); iterator.hasNext(); ((bov)iterator.next()).a(HangoutSelfMenu.a(a).t())) { }
    }

    public void c()
    {
        for (Iterator iterator = a.a.iterator(); iterator.hasNext(); ((bov)iterator.next()).a(HangoutSelfMenu.a(a).t())) { }
    }
}
