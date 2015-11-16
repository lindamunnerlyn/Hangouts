// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import com.google.android.apps.hangouts.phone.GoogleVoiceTermsOfServiceActivity;

public final class cnw
    implements android.view.View.OnClickListener
{

    final GoogleVoiceTermsOfServiceActivity a;

    public cnw(GoogleVoiceTermsOfServiceActivity googlevoicetermsofserviceactivity)
    {
        a = googlevoicetermsofserviceactivity;
        super();
    }

    public void onClick(View view)
    {
        int i = GoogleVoiceTermsOfServiceActivity.a(a).h();
        view = a;
        bfy.a(new ddv(view, i, new cnx(this)), new bgb(view.t_())).a();
    }
}
