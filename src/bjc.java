// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.res.Resources;
import android.database.Cursor;
import android.os.Bundle;
import com.google.android.apps.hangouts.fragments.ConversationListFragment;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class bjc
{

    public HashMap a;
    final ConversationListFragment b;
    private final aoa c;
    private long d;
    private final bje e = new bje(this);
    private dvg f;

    public bjc(ConversationListFragment conversationlistfragment, aoa aoa)
    {
        b = conversationlistfragment;
        super();
        c = aoa;
    }

    private void a(String s, long l1, boolean flag, boolean flag1)
    {
        ArrayList arraylist = new ArrayList();
        for (s = g.g(s).iterator(); s.hasNext(); arraylist.add((String)s.next())) { }
        s = new long[arraylist.size()];
        for (int i = 0; i < s.length; i++)
        {
            s[i] = l1;
        }

        RealTimeChatService.a(c, (String[])arraylist.toArray(new String[arraylist.size()]), s, flag, flag1);
    }

    public void a()
    {
        e.a();
    }

    public void a(Cursor cursor)
    {
        if (a != null)
        {
            while (!a.isEmpty() && cursor.moveToNext()) 
            {
                String s = cursor.getString(1);
                a.remove(s);
            }
        }
    }

    public void a(Bundle bundle)
    {
        if (a != null && !a.isEmpty())
        {
            bundle.putSerializable("last_archived", a);
        }
    }

    public void a(String s)
    {
        e.a(s);
    }

    public void a(String s, long l1)
    {
        int i;
        if (!e.a(s, l1))
        {
            a(s, l1, true, true);
        }
        long l2 = System.currentTimeMillis();
        if (a != null)
        {
            if (l2 - d > 1000L)
            {
                a.clear();
            }
        } else
        {
            a = new HashMap();
        }
        d = l2;
        a.put(s, Long.valueOf(l1));
        i = a.size();
        s = new dvh(ConversationListFragment.r(b));
        if (i <= 1) goto _L2; else goto _L1
_L1:
        s.a(b.getResources().getString(l.gw, new Object[] {
            Integer.valueOf(i)
        }));
_L5:
        s.c(b.getString(l.o));
        s.a(new bjd(this));
        s = s.a();
        if (f == null || f.equals(s))
        {
            ConversationListFragment.i(b).a(s);
        } else
        {
            ConversationListFragment.i(b).a(f, s);
        }
        f = s;
_L4:
        return;
_L2:
        if (i != 1) goto _L4; else goto _L3
_L3:
        s.a(b.getResources().getString(l.am));
          goto _L5
    }

    void a(Map map, boolean flag, boolean flag1)
    {
        if (map != null)
        {
            map = map.entrySet().iterator();
            while (map.hasNext()) 
            {
                java.util.Map.Entry entry = (java.util.Map.Entry)map.next();
                long l1 = g.a((Long)entry.getValue(), 0L);
                a((String)entry.getKey(), l1, flag, flag1);
            }
        }
    }

    public void b(String s, long l1)
    {
        a(s, l1, false, false);
    }
}
