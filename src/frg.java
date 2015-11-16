// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.playlog.internal.LogEvent;
import com.google.android.gms.playlog.internal.PlayLoggerContext;
import java.util.ArrayList;

public final class frg
{

    private final ArrayList a;
    private int b;

    public frg()
    {
        this((byte)0);
    }

    private frg(byte byte0)
    {
        a = new ArrayList();
        b = 100;
    }

    public ArrayList a()
    {
        return a;
    }

    public void a(PlayLoggerContext playloggercontext, LogEvent logevent)
    {
        a.add(new frh(playloggercontext, logevent));
        for (; a.size() > b; a.remove(0)) { }
    }

    public void b()
    {
        a.clear();
    }

    public boolean c()
    {
        return a.isEmpty();
    }
}
