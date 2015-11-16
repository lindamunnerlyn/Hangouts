// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.hangouts.hangout.HangoutSelfMenu;
import java.util.Iterator;
import java.util.List;

public final class bpl extends boq
{

    final HangoutSelfMenu a;

    public bpl(HangoutSelfMenu hangoutselfmenu)
    {
        a = hangoutselfmenu;
        super();
    }

    public void a(gkq gkq)
    {
        if (gkq instanceof gkx)
        {
            for (gkq = a.b.iterator(); gkq.hasNext(); ((bpe)gkq.next()).a(a.a.s())) { }
        }
    }

    public void b(int i)
    {
        for (Iterator iterator = a.b.iterator(); iterator.hasNext(); ((bpe)iterator.next()).a(a.a.s())) { }
    }

    public void c()
    {
        for (Iterator iterator = a.b.iterator(); iterator.hasNext(); ((bpe)iterator.next()).a(a.a.s())) { }
    }
}
