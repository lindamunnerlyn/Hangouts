// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.ArrayList;
import java.util.List;

public final class cve extends cvt
{

    private final int a;
    private final int b;

    public cve(aoa aoa1, int i, dgh dgh1)
    {
        super(hio.newBuilder().a(aoa1.a()).b(aoa1.ab()).a(true).a(), dgh1, "presence/querypresence", dmi.a, new jcv(), new jcw());
        a = i;
        b = aoa1.h();
    }

    protected cxr a(kws kws)
    {
        return czk.parseFrom((jcw)kws);
    }

    public void a(int i, Exception exception)
    {
        exception = e();
        if (exception != null)
        {
            RealTimeChatService.a(b, exception);
        }
    }

    protected void b(kws kws)
    {
        kws = (jcv)kws;
        dgh dgh1 = (dgh)super.e;
        Object obj = dgh1.b();
        int k = ((List) (obj)).size();
        kws.a = new jce[k];
        for (int i = 0; i < k; i++)
        {
            jce jce1 = new jce();
            jce1.b = (String)((List) (obj)).get(i);
            jce1.a = jce1.b;
            ((jcv) (kws)).a[i] = jce1;
        }

        kws.requestHeader = a((new ctx()).b(a).a(b).b());
        obj = new ArrayList();
        cvc.a(dgh1.a(), ((java.util.Collection) (obj)));
        k = ((List) (obj)).size();
        kws.b = new int[k];
        for (int j = 0; j < k; j++)
        {
            ((jcv) (kws)).b[j] = g.a((Integer)((List) (obj)).get(j), 0);
        }

    }
}
