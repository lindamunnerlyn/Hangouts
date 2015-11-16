// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.hangouts.phone.BabelGatewayActivity;

public final class cki extends dhy
{

    final BabelGatewayActivity a;

    public cki(BabelGatewayActivity babelgatewayactivity)
    {
        a = babelgatewayactivity;
        super();
    }

    public void a(int i, aoa aoa, ddo ddo1, did did1)
    {
        if (i != BabelGatewayActivity.a(a))
        {
            return;
        }
        if (BabelGatewayActivity.j())
        {
            i = did1.b();
            BabelGatewayActivity.a((new StringBuilder(47)).append("onConversationCreated called, error ").append(i).toString());
        }
        if (did1.b() != 1)
        {
            BabelGatewayActivity.a(a, l.bU);
            return;
        }
        gdv.a(Boolean.valueOf(ddo1.c), Boolean.valueOf(BabelGatewayActivity.b(a)));
        if (ddo1.c)
        {
            (new cra(a, BabelGatewayActivity.c(a), ddo1.a, true, BabelGatewayActivity.d(a), BabelGatewayActivity.e(a), BabelGatewayActivity.f(a), BabelGatewayActivity.g(a), BabelGatewayActivity.h(a), BabelGatewayActivity.i(a), BabelGatewayActivity.j(a))).a(new Void[0]);
            a.setResult(-1);
            a.finish();
            return;
        } else
        {
            BabelGatewayActivity.a(a, ddo1.a);
            BabelGatewayActivity.b(a, ddo1.b);
            return;
        }
    }
}
