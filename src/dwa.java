// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class dwa
    implements dxx
{

    final dvy a;

    dwa(dvy dvy1)
    {
        a = dvy1;
        super();
    }

    public void a()
    {
        ebw.e("Babel_telephony", "TeleSetupController.onGoogleVoiceEnableCallingSucceeded");
        if (dvy.d(a) != null)
        {
            dvy.e(a);
            a.k();
        }
    }

    public void b()
    {
        ebw.e("Babel_telephony", "TeleSetupController.onGoogleVoiceEnableCallingFailed");
        if (dvy.d(a) != null)
        {
            dvy.e(a);
            dvy.a(a, g.px);
        }
    }
}
