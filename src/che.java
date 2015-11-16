// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class che extends dhh
{

    final cgw a;
    private final String b;

    che(cgw cgw1)
    {
        a = cgw1;
        super(cgw.g(cgw1));
        cgw1 = String.valueOf(che.getName());
        int i = hashCode();
        b = (new StringBuilder(String.valueOf(cgw1).length() + 11)).append(cgw1).append(i).toString();
    }

    protected void a(dgu dgu1)
    {
        Object obj1 = (cxs)dgu1.c();
        Object obj = new ArrayList();
        dgu1 = new ArrayList();
        for (obj1 = ((cxs) (obj1)).k().iterator(); ((Iterator) (obj1)).hasNext();)
        {
            ceu ceu1 = (ceu)((Iterator) (obj1)).next();
            amh amh1 = amh.a(ceu1, null, false);
            if (ceu1.y)
            {
                ((List) (obj)).add(amh1);
            } else
            {
                dgu1.add(amh1);
            }
        }

        obj = new amk(((List) (obj)));
        cgw.e(a).c(((amj) (obj)));
        dgu1 = new amk(dgu1);
        cgw.e(a).d(dgu1);
        cgw.a(a, a.getView());
    }

    public void a(String s)
    {
        a(RealTimeChatService.d(cgw.b(a), s, b));
    }
}
