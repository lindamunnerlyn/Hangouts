// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.hangouts.hangout.HangoutSelfMenu;
import java.util.Iterator;
import java.util.List;

public final class bpb extends bnk
{

    final HangoutSelfMenu a;

    public bpb(HangoutSelfMenu hangoutselfmenu)
    {
        a = hangoutselfmenu;
        super();
    }

    public void c(gjr gjr)
    {
        for (Iterator iterator = a.a.iterator(); iterator.hasNext(); ((bov)iterator.next()).a(gjr)) { }
    }
}
