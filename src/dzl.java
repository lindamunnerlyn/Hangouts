// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class dzl
    implements ebk
{

    final dzh a;

    dzl(dzh dzh1)
    {
        a = dzh1;
        super();
    }

    public void a()
    {
        eev.e("Babel_telephony", "TeleSetupController.onGoogleVoiceAccountInfoUpdateSucceeded");
        if (a.e != null)
        {
            a.e = null;
            a.l();
        }
    }

    public void b()
    {
label0:
        {
            eev.e("Babel_telephony", "TeleSetupController.onGoogleVoiceAccountInfoUpdateFailed");
            if (a.e != null)
            {
                a.e = null;
                if (!a.d())
                {
                    break label0;
                }
                a.a(false);
                a.l();
            }
            return;
        }
        a.a(g.pE);
    }
}
