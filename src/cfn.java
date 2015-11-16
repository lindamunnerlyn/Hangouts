// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

final class cfn extends cep
{

    private static final Object h = new Object();
    private final boolean i;

    cfn(Context context, int j, String s, String s1, int k, String s2, long l1, int i1)
    {
        super(context, j, k, edb.a(s1), l1);
        boolean flag;
        if (i1 == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        i = flag;
        if (k == 2)
        {
            if (i)
            {
                j = l.te;
            } else
            {
                j = l.ee;
            }
            c = context.getString(j, new Object[] {
                s2
            });
        } else
        {
            if (i)
            {
                j = l.tf;
            } else
            {
                j = l.ef;
            }
            c = context.getString(j);
        }
        f = s1;
        b = s;
    }

    static void a(Context context, int j, List list)
    {
        TreeSet treeset;
        grd grd1;
        treeset = new TreeSet();
        if (list != null)
        {
            for (list = list.iterator(); list.hasNext(); treeset.add(((cfn)list.next()).q.a())) { }
        }
        grd1 = ((gqz)hlp.a(context, gqz)).b(j);
        Object obj1 = h;
        obj1;
        JVM INSTR monitorenter ;
        Object obj = grd1.c("active_hangouts_list");
        list = ((List) (obj));
        if (obj == null) goto _L2; else goto _L1
_L1:
        Iterator iterator;
        obj = new HashSet(((java.util.Collection) (obj)));
        ((Set) (obj)).removeAll(treeset);
        iterator = ((Set) (obj)).iterator();
_L15:
        if (!iterator.hasNext()) goto _L4; else goto _L3
_L3:
        Object obj2 = (String)iterator.next();
        if (!a) goto _L6; else goto _L5
_L5:
        list = String.valueOf(obj2);
        if (list.length() == 0) goto _L8; else goto _L7
_L7:
        list = "OngoingHangoutNotifier.cancelOngoingNotification conversationId=".concat(list);
_L9:
        eev.b("Babel", list);
_L6:
        list = a(context, j, ((String) (obj2)));
        obj2 = db.a(context);
        cfi.a(list, 1);
        ((db) (obj2)).a(list, 1);
        continue; /* Loop/switch isn't completed */
        context;
        obj1;
        JVM INSTR monitorexit ;
        throw context;
_L8:
        list = new String("OngoingHangoutNotifier.cancelOngoingNotification conversationId=");
          goto _L9
_L2:
        grd1.b("active_hangouts_list", treeset).d();
        if (!a) goto _L11; else goto _L10
_L10:
        if (list == null)
        {
            break MISSING_BLOCK_LABEL_320;
        }
        context = list.toString();
_L12:
        list = String.valueOf(treeset.toString());
        eev.b("Babel", (new StringBuilder(String.valueOf(context).length() + 44 + String.valueOf(list).length())).append("updateActiveHangouts: lastActive=").append(context).append("\nnewActive=").append(list).toString());
_L11:
        obj1;
        JVM INSTR monitorexit ;
        return;
        context = "empty";
          goto _L12
_L4:
        list = ((List) (obj));
        if (true) goto _L2; else goto _L13
_L13:
        if (true) goto _L15; else goto _L14
_L14:
    }

    protected void a(boolean flag)
    {
        t.a(b).c(cfo.a(o, b, c)).b(c).a(d);
        cf cf1 = v;
        Context context = o;
        int j;
        if (i)
        {
            j = l.tg;
        } else
        {
            j = l.eh;
        }
        cf1.a(context.getString(j));
        s = (new ce(t)).b(c);
        super.a(flag);
    }

    protected boolean a()
    {
        return false;
    }

    protected boolean c()
    {
        return false;
    }

    protected int d()
    {
        if (i)
        {
            return com.google.android.apps.hangouts.R.drawable.cu;
        } else
        {
            return com.google.android.apps.hangouts.R.drawable.cq;
        }
    }

    protected int e()
    {
        return 1;
    }

    protected int f()
    {
        return g.a(o, "babel_notify_ongoing_video_priority_level", 2);
    }

    protected Intent g()
    {
        return g.a(p, f, e).putExtra("reset_hangout_notifications", true);
    }

}
