// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.hangouts.phone.GoogleVoiceTermsOfServiceActivity;

final class cnx
    implements ddy
{

    final cnw a;

    cnx(cnw cnw1)
    {
        a = cnw1;
        super();
    }

    public void a()
    {
        if (dbf.e(GoogleVoiceTermsOfServiceActivity.b(a.a).a()).X() == 1)
        {
            GoogleVoiceTermsOfServiceActivity.a(a.a, -1);
            return;
        } else
        {
            ebw.f("Babel", "EnableVoiceCalling didn't return valid response");
            GoogleVoiceTermsOfServiceActivity.a(a.a, 0);
            return;
        }
    }

    public void b()
    {
        GoogleVoiceTermsOfServiceActivity.a(a.a, 0);
    }
}
