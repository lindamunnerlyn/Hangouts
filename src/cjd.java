// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.hangouts.phone.BabelGatewayActivity;

public final class cjd extends dgp
{

    final BabelGatewayActivity a;

    public cjd(BabelGatewayActivity babelgatewayactivity)
    {
        a = babelgatewayactivity;
        super();
    }

    public void a(int i, ani ani, dcg dcg1, dgu dgu1)
    {
        if (i != BabelGatewayActivity.a(a))
        {
            return;
        }
        if (BabelGatewayActivity.j())
        {
            i = dgu1.b();
            BabelGatewayActivity.a((new StringBuilder(47)).append("onConversationCreated called, error ").append(i).toString());
        }
        if (dgu1.b() != 1)
        {
            BabelGatewayActivity.a(a, l.ca);
            return;
        }
        gbh.a(Boolean.valueOf(dcg1.c), Boolean.valueOf(BabelGatewayActivity.b(a)));
        if (dcg1.c)
        {
            (new cpk(a, BabelGatewayActivity.c(a), dcg1.a, true, BabelGatewayActivity.d(a), BabelGatewayActivity.e(a), BabelGatewayActivity.f(a), BabelGatewayActivity.g(a), BabelGatewayActivity.h(a), BabelGatewayActivity.i(a), BabelGatewayActivity.j(a))).a(new Void[0]);
            a.setResult(-1);
            a.finish();
            return;
        } else
        {
            BabelGatewayActivity.a(a, dcg1.a);
            BabelGatewayActivity.b(a, dcg1.b);
            return;
        }
    }
}
