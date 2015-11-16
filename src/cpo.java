// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.hangouts.phone.GoogleVoiceTermsOfServiceActivity;

final class cpo
    implements dfg
{

    final cpn a;

    cpo(cpn cpn1)
    {
        a = cpn1;
        super();
    }

    public void a()
    {
        if (dcn.e(GoogleVoiceTermsOfServiceActivity.b(a.a).a()).U() == 1)
        {
            GoogleVoiceTermsOfServiceActivity.a(a.a, -1);
            return;
        } else
        {
            eev.f("Babel", "EnableVoiceCalling didn't return valid response");
            GoogleVoiceTermsOfServiceActivity.a(a.a, 0);
            return;
        }
    }

    public void b()
    {
        GoogleVoiceTermsOfServiceActivity.a(a.a, 0);
    }
}
