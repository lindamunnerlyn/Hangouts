// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextPaint;
import android.text.style.URLSpan;
import com.google.android.apps.hangouts.phone.GoogleVoiceTermsOfServiceActivity;

public final class cpq extends URLSpan
{

    final GoogleVoiceTermsOfServiceActivity a;

    public cpq(GoogleVoiceTermsOfServiceActivity googlevoicetermsofserviceactivity, String s)
    {
        a = googlevoicetermsofserviceactivity;
        super(s);
    }

    public void updateDrawState(TextPaint textpaint)
    {
        super.updateDrawState(textpaint);
        textpaint.setUnderlineText(false);
    }
}
