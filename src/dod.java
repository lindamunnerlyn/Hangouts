// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public final class dod extends don
{

    private static final ConcurrentHashMap g = new ConcurrentHashMap();
    private final aoa b;
    private aow c;
    private final dhy d = new doe(this);
    private volatile boolean e;
    private final ConcurrentHashMap f = new ConcurrentHashMap();

    private dod(aoa aoa1)
    {
        b = aoa1;
        c = null;
        e = false;
    }

    public static dod a(aoa aoa1)
    {
        int i = aoa1.h();
        dod dod2 = (dod)g.get(Integer.valueOf(i));
        dod dod1 = dod2;
        if (dod2 == null)
        {
            if (eev.a("Babel", 3))
            {
                eev.c("Babel", (new StringBuilder(37)).append("Adding contact loader for ").append(i).toString());
            }
            aoa1 = new dod(aoa1);
            g.putIfAbsent(Integer.valueOf(i), aoa1);
            dod1 = (dod)g.get(Integer.valueOf(i));
        }
        return dod1;
    }

    static ConcurrentHashMap a(dod dod1)
    {
        return dod1.f;
    }

    public static void a(int i)
    {
        if (eev.a("Babel", 3))
        {
            eev.c("Babel", (new StringBuilder(44)).append("Removing conversation loader for ").append(i).toString());
        }
        g.remove(Integer.valueOf(i));
    }

    static void a(dod dod1, String s)
    {
        dod1 = dod1.b(s);
        if (dod1 != null && dod1.size() != 0)
        {
            dod1 = dod1.iterator();
            while (dod1.hasNext()) 
            {
                ((anw)(dor)dod1.next()).b.b();
            }
        }
    }

    static void a(dod dod1, String s, aoz aoz)
    {
        dod1 = dod1.b(s);
        if (dod1 != null && dod1.size() != 0)
        {
            dod1 = dod1.iterator();
            while (dod1.hasNext()) 
            {
                ((anw)(dor)dod1.next()).b.a(aoz);
            }
        }
    }

    static void b(dod dod1)
    {
        if (dod1.e && dod1.f.isEmpty())
        {
            RealTimeChatService.b(dod1.d);
            dod1.e = false;
        }
    }

    protected String a()
    {
        return "ConversationLoader";
    }

    protected void a(ArrayList arraylist)
    {
        for (arraylist = arraylist.iterator(); arraylist.hasNext();)
        {
            String s = (String)arraylist.next();
            if (c == null)
            {
                c = new aow(g.nU, b.h());
            }
            aoz aoz = c.f(s);
            if (aoz == null)
            {
                if (!e)
                {
                    RealTimeChatService.a(d);
                    e = true;
                }
                int i = RealTimeChatService.m(b, s);
                f.put(Integer.valueOf(i), s);
            } else
            {
                a(((Runnable) (new dof(this, s, aoz))));
            }
        }

    }

}
