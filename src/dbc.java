// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.Iterator;
import java.util.List;

public final class dbc extends dfa
{

    private final List a;
    private final boolean d;
    private final boolean e;
    private int f;

    public dbc(ani ani1, List list, boolean flag, boolean flag1)
    {
        super(ani1);
        a = list;
        d = flag;
        e = flag1;
    }

    public void a()
    {
        aoe aoe1;
        byte byte0;
        byte0 = 1;
        aoe1 = new aoe(g.nS, b.h());
        Iterator iterator = a.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Object obj1 = (dbd)iterator.next();
            aoh aoh1 = aoe1.f(((dbd) (obj1)).a);
            long l;
            if (aoh1 != null)
            {
                l = Math.min(aoh1.u, ((dbd) (obj1)).b);
            } else
            {
                l = ((dbd) (obj1)).b;
            }
            if (!aoe.a(((dbd) (obj1)).a) && !e)
            {
                obj1 = new ctt(((dbd) (obj1)).a, l, d);
                c.a(((dko) (obj1)));
            } else
            if (f >= 0)
            {
                Object obj2 = cvq.k();
                obj2 = new dgu(f, 1, ((cvn) (obj2)));
                RealTimeChatService.a(f, b, ((dgu) (obj2)));
            }
        } while (true);
        if (d)
        {
            byte0 = 2;
        }
        aoe1.a();
        Iterator iterator1 = a.iterator();
_L7:
        if (!iterator1.hasNext()) goto _L2; else goto _L1
_L1:
        dbd dbd1 = (dbd)iterator1.next();
        if (!ebw.a("Babel", 3)) goto _L4; else goto _L3
_L3:
        Object obj = String.valueOf(dbd1.a);
        if (((String) (obj)).length() == 0) goto _L6; else goto _L5
_L5:
        obj = "updateConversationViewLocally conversationId: ".concat(((String) (obj)));
_L8:
        ebw.c("Babel", ((String) (obj)));
_L4:
        (new dbe(new czm(dbd1.a, byte0))).a(aoe1);
          goto _L7
        obj;
        aoe1.c();
        throw obj;
_L6:
        obj = new String("updateConversationViewLocally conversationId: ");
          goto _L8
_L2:
        aoe1.b();
        aoe1.c();
        any.d(aoe1);
        return;
          goto _L7
    }

    public void a(int i)
    {
        f = i;
    }
}
