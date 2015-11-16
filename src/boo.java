// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import android.os.Handler;
import java.util.LinkedList;
import java.util.List;

public final class boo
{

    private static boo a = new boo();
    private final LinkedList b = new LinkedList();

    public boo()
    {
    }

    public static boo a()
    {
        gdv.b("Expected non-null", a);
        return a;
    }

    public void a(Intent intent)
    {
        bpm bpm1 = bnk.a().s();
        if (bpm1 == null)
        {
            eev.a("Babel_calls", "Got Mesi push notification with no joined call");
            return;
        } else
        {
            bpm1.W().post(new bop(this, intent));
            return;
        }
    }

    public void a(boq boq)
    {
        b.add(boq);
    }

    List b()
    {
        return (LinkedList)b.clone();
    }

    public void b(boq boq)
    {
        gdv.a("Expected condition to be true", b.remove(boq));
    }

}
