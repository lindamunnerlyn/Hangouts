// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public final class dlg extends dlp
{

    private static final ConcurrentHashMap g = new ConcurrentHashMap();
    private final ani b;
    private aoe c;
    private final dgp d = new dlh(this);
    private volatile boolean e;
    private final ConcurrentHashMap f = new ConcurrentHashMap();

    private dlg(ani ani1)
    {
        b = ani1;
        c = null;
        e = false;
    }

    public static dlg a(ani ani1)
    {
        int i = ani1.h();
        dlg dlg2 = (dlg)g.get(Integer.valueOf(i));
        dlg dlg1 = dlg2;
        if (dlg2 == null)
        {
            if (ebw.a("Babel", 3))
            {
                ebw.c("Babel", (new StringBuilder(37)).append("Adding contact loader for ").append(i).toString());
            }
            ani1 = new dlg(ani1);
            g.putIfAbsent(Integer.valueOf(i), ani1);
            dlg1 = (dlg)g.get(Integer.valueOf(i));
        }
        return dlg1;
    }

    static ConcurrentHashMap a(dlg dlg1)
    {
        return dlg1.f;
    }

    public static void a(int i)
    {
        if (ebw.a("Babel", 3))
        {
            ebw.c("Babel", (new StringBuilder(44)).append("Removing conversation loader for ").append(i).toString());
        }
        g.remove(Integer.valueOf(i));
    }

    static void a(dlg dlg1, String s, aoh aoh)
    {
        dlg1 = dlg1.b(s);
        if (dlg1 != null && dlg1.size() != 0)
        {
            dlg1 = dlg1.iterator();
            while (dlg1.hasNext()) 
            {
                ((ane)(dlt)dlg1.next()).b.a(aoh);
            }
        }
    }

    static void b(dlg dlg1)
    {
        if (dlg1.e && dlg1.f.isEmpty())
        {
            RealTimeChatService.b(dlg1.d);
            dlg1.e = false;
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
                c = new aoe(g.nS, b.h());
            }
            aoh aoh = c.f(s);
            if (aoh == null)
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
                a(((Runnable) (new dli(this, s, aoh))));
            }
        }

    }

}
