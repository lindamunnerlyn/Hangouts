// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.ArrayList;
import java.util.List;

public final class ctb extends ctp
{

    private final int a;
    private final int b;

    public ctb(ani ani1, int i, dey dey1)
    {
        super(hdx.newBuilder().a(ani1.a()).b(ani1.ae()).a().b(), dey1, "presence/querypresence", "hangouts", new iwq(), new iwr());
        a = i;
        b = ani1.h();
    }

    protected cvn a(kop kop)
    {
        return cxg.parseFrom((iwr)kop);
    }

    public void a(int i, Exception exception)
    {
        exception = e();
        if (exception != null)
        {
            RealTimeChatService.a(b, exception);
        }
    }

    protected void b(kop kop)
    {
        kop = (iwq)kop;
        dey dey1 = (dey)super.e;
        Object obj = dey1.b();
        int k = ((List) (obj)).size();
        kop.a = new ivz[k];
        for (int i = 0; i < k; i++)
        {
            ivz ivz1 = new ivz();
            ivz1.b = (String)((List) (obj)).get(i);
            ivz1.a = ivz1.b;
            ((iwq) (kop)).a[i] = ivz1;
        }

        kop.requestHeader = a((new cru()).b(a).a(b).b());
        obj = new ArrayList();
        csz.a(dey1.a(), ((java.util.Collection) (obj)));
        k = ((List) (obj)).size();
        kop.b = new int[k];
        for (int j = 0; j < k; j++)
        {
            ((iwq) (kop)).b[j] = g.a((Integer)((List) (obj)).get(j), 0);
        }

    }
}
