// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.hangouts.hangout.HangoutSelfMenu;
import java.util.Iterator;
import java.util.List;

public final class bpk extends bns
{

    final HangoutSelfMenu a;

    public bpk(HangoutSelfMenu hangoutselfmenu)
    {
        a = hangoutselfmenu;
        super();
    }

    public void c(gmt gmt)
    {
        for (Iterator iterator = a.b.iterator(); iterator.hasNext(); ((bpe)iterator.next()).a(gmt)) { }
    }
}
