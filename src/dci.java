// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.Iterator;
import java.util.List;

public final class dci extends dgj
{

    private final List a;
    private final boolean e;
    private final boolean f;
    private int g;

    public dci(aoa aoa, List list, boolean flag, boolean flag1)
    {
        super(aoa);
        a = list;
        e = flag;
        f = flag1;
    }

    public void a()
    {
        aow aow1;
        byte byte0;
        byte0 = 1;
        aow1 = new aow(g.nU, super.b.a);
        Iterator iterator = a.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            dcj dcj1 = (dcj)iterator.next();
            aoz aoz1 = aow1.f(dcj1.a);
            long l;
            if (aoz1 != null)
            {
                l = Math.min(aoz1.u, dcj1.b);
            } else
            {
                l = dcj1.b;
            }
            if (!aow.a(dcj1.a) && !f)
            {
                a(((dmf) (new cvx(dcj1.a, l, e))));
            } else
            if (g >= 0)
            {
                Object obj1 = cxu.k();
                obj1 = new did(g, 1, ((cxr) (obj1)));
                RealTimeChatService.a(g, super.b.b, ((did) (obj1)));
            }
        } while (true);
        if (e)
        {
            byte0 = 2;
        }
        aow1.a();
        Iterator iterator1 = a.iterator();
_L7:
        if (!iterator1.hasNext()) goto _L2; else goto _L1
_L1:
        dcj dcj2 = (dcj)iterator1.next();
        if (!eev.a("Babel", 3)) goto _L4; else goto _L3
_L3:
        Object obj = String.valueOf(dcj2.a);
        if (((String) (obj)).length() == 0) goto _L6; else goto _L5
_L5:
        obj = "updateConversationViewLocally conversationId: ".concat(((String) (obj)));
_L8:
        eev.c("Babel", ((String) (obj)));
_L4:
        (new dck(new dns(dcj2.a, byte0))).a(aow1);
          goto _L7
        obj;
        aow1.c();
        throw obj;
_L6:
        obj = new String("updateConversationViewLocally conversationId: ");
          goto _L8
_L2:
        aow1.b();
        aow1.c();
        aoq.d(aow1);
        return;
          goto _L7
    }

    public void a(int i)
    {
        g = i;
    }
}
