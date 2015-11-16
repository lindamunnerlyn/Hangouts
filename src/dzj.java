// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class dzj
    implements ebh
{

    final dzh a;

    dzj(dzh dzh1)
    {
        a = dzh1;
        super();
    }

    public void a()
    {
        eev.e("Babel_telephony", "TeleSetupController.onGoogleVoiceEnableCallingSucceeded");
        if (a.f != null)
        {
            a.f = null;
            a.l();
        }
    }

    public void b()
    {
        eev.e("Babel_telephony", "TeleSetupController.onGoogleVoiceEnableCallingFailed");
        if (a.f != null)
        {
            a.f = null;
            a.a(g.pz);
        }
    }
}
