// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Notification;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;

public final class ca
{

    private static final cj a;

    public static Bundle a(Notification notification)
    {
        return a.a(notification);
    }

    static cj a()
    {
        return a;
    }

    static void a(by by1, ArrayList arraylist)
    {
        for (arraylist = arraylist.iterator(); arraylist.hasNext(); by1.a((cb)arraylist.next())) { }
    }

    static void a(bz bz, cr cr)
    {
        if (cr != null)
        {
            if (cr instanceof ce)
            {
                cr = (ce)cr;
                cy.a(bz, ((ce) (cr)).e, ((ce) (cr)).g, ((ce) (cr)).f, ((ce) (cr)).a);
            } else
            {
                if (cr instanceof ci)
                {
                    cr = (ci)cr;
                    cy.a(bz, ((ci) (cr)).e, ((ci) (cr)).g, ((ci) (cr)).f, ((ci) (cr)).a);
                    return;
                }
                if (cr instanceof cd)
                {
                    cr = (cd)cr;
                    cy.a(bz, ((cd) (cr)).e, ((cd) (cr)).g, ((cd) (cr)).f, ((cd) (cr)).a, ((cd) (cr)).b, ((cd) (cr)).c);
                    return;
                }
            }
        }
    }

    static 
    {
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            a = new cl();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 20)
        {
            a = new ck();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 19)
        {
            a = new cq();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            a = new cp();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            a = new co();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            a = new cn();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 9)
        {
            a = new cm();
        } else
        {
            a = new cj();
        }
    }
}
