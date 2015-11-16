// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import com.google.android.apps.hangouts.phone.GoogleVoiceTermsOfServiceActivity;

public final class cpn
    implements android.view.View.OnClickListener
{

    final GoogleVoiceTermsOfServiceActivity a;

    public cpn(GoogleVoiceTermsOfServiceActivity googlevoicetermsofserviceactivity)
    {
        a = googlevoicetermsofserviceactivity;
        super();
    }

    public void onClick(View view)
    {
        int i = GoogleVoiceTermsOfServiceActivity.a(a).h();
        view = a;
        bgk.a(new dfd(view, i, new cpo(this)), new bgn(view.u_())).a();
    }
}
