// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class dwb
    implements dya
{

    final dvy a;

    dwb(dvy dvy1)
    {
        a = dvy1;
        super();
    }

    public void a()
    {
        ebw.e("Babel_telephony", "TeleSetupController.onGoogleVoiceAccountInfoUpdateSucceeded");
        if (dvy.f(a) != null)
        {
            dvy.g(a);
            a.k();
        }
    }

    public void b()
    {
label0:
        {
            ebw.e("Babel_telephony", "TeleSetupController.onGoogleVoiceAccountInfoUpdateFailed");
            if (dvy.f(a) != null)
            {
                dvy.g(a);
                if (!dvy.h(a))
                {
                    break label0;
                }
                dvy.i(a);
                a.k();
            }
            return;
        }
        dvy.a(a, g.pC);
    }
}
